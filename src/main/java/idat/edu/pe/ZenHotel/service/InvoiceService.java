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

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private PaymentMethodRepository paymentMethodRepository;

    @Autowired
    private PaymentStatusRepository paymentStatusRepository;

    @Autowired
    private ExtraServiceRepository extraServiceRepository;

    public List<InvoiceModel> listAll() {
        return invoiceRepository.findAll();
    }

    public InvoiceModel save(InvoiceDto dto) {
        InvoiceModel invoice = new InvoiceModel();
        invoice.setAmount(dto.getAmount());
        invoice.setPaymentdate(dto.getPaymentdate());
        invoice.setBooking(bookingRepository.findById(dto.getIdbooking()).orElse(null));
        invoice.setPaymentmethod(paymentMethodRepository.findById(dto.getIdpaymentmethod()).orElse(null));
        invoice.setPaymentstatus(paymentStatusRepository.findById(dto.getIdpaymentstatus()).orElse(null));
        invoice.setExtraservice(extraServiceRepository.findById(dto.getIdextraservice()).orElse(null));
        return invoiceRepository.save(invoice);
    }

    public Optional<InvoiceModel> getById(Integer id) {
        return invoiceRepository.findById(id);
    }

    public void delete(Integer id) {
        invoiceRepository.deleteById(id);
    }
}
