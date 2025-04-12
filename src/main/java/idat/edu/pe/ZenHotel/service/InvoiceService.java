package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.dto.InvoiceDto;
import idat.edu.pe.ZenHotel.model.*;
import idat.edu.pe.ZenHotel.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;
    private final BookingRepository bookingRepository;
    private final PaymentMethodRepository paymentMethodRepository;
    private final PaymentStatusRepository paymentStatusRepository;
    private final ExtraServiceRepository extraServiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository, BookingRepository bookingRepository, PaymentMethodRepository paymentMethodRepository, PaymentStatusRepository paymentStatusRepository, ExtraServiceRepository extraServiceRepository) {
        this.invoiceRepository = invoiceRepository;
        this.bookingRepository = bookingRepository;
        this.paymentMethodRepository = paymentMethodRepository;
        this.paymentStatusRepository = paymentStatusRepository;
        this.extraServiceRepository = extraServiceRepository;
    }

    public List<InvoiceModel> getInvoices() {
        return invoiceRepository.findAll();
    }

    public InvoiceModel getInvoiceById(int id) {
        return invoiceRepository.findById(id).orElse(null);
    }

    public Double getTotalIncome() {
        return invoiceRepository.totalIncome();
    }

    public List<Object[]> getDailyIncome() {
        return invoiceRepository.findDailyIncome();
    }

    public void saveInvoiceDto(InvoiceDto invoiceDto) {
        if (invoiceDto.getIdinvoice() != null) {
            invoiceRepository.UpdateInvoice(
                    invoiceDto.getIdbooking(),
                    invoiceDto.getIdpaymentmethod(),
                    invoiceDto.getIdpaymentstatus(),
                    invoiceDto.getIdextraservice(),
                    invoiceDto.getAmount(),
                    invoiceDto.getPaymentdate(),
                    invoiceDto.getIdinvoice()
            );
        } else {
            InvoiceModel invoice = new InvoiceModel();
            BookingModel booking = bookingRepository.findById(invoiceDto.getIdbooking()).orElse(null);
            PaymentMethodModel paymentMethod = paymentMethodRepository.findById(invoiceDto.getIdpaymentmethod()).orElse(null);
            PaymentStatusModel paymentStatus = paymentStatusRepository.findById(invoiceDto.getIdpaymentstatus()).orElse(null);
            ExtraServiceModel extraService = extraServiceRepository.findById(invoiceDto.getIdextraservice()).orElse(null);
            invoice.setBooking(booking);
            invoice.setPaymentmethod(paymentMethod);
            invoice.setPaymentstatus(paymentStatus);
            invoice.setExtraservice(extraService);
            invoice.setAmount(invoiceDto.getAmount());
            invoice.setPaymentdate(invoiceDto.getPaymentdate());
            invoiceRepository.save(invoice);
        }
    }

    public InvoiceDto getInvoiceDtoById(int id) {
        InvoiceModel invoiceModel = getInvoiceById(id);

        InvoiceDto invoiceDto = new InvoiceDto();
        invoiceDto.setIdinvoice(invoiceModel.getIdinvoice());
        invoiceDto.setIdbooking(invoiceModel.getBooking().getIdbooking());
        invoiceDto.setIdpaymentmethod(invoiceModel.getPaymentmethod().getIdpaymentmethod());
        invoiceDto.setIdpaymentstatus(invoiceModel.getPaymentstatus().getIdpaymentstatus());
        invoiceDto.setIdextraservice(invoiceModel.getExtraservice().getIdextraservice());
        invoiceDto.setAmount(invoiceModel.getAmount());
        invoiceDto.setPaymentdate(invoiceModel.getPaymentdate());
        return invoiceDto;
    }
}
