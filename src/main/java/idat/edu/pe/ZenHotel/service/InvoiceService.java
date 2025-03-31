package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.model.InvoiceModel;
import idat.edu.pe.ZenHotel.repository.InvoiceRepository;

import java.util.List;

public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public List<InvoiceModel> getInvoices() {
        return invoiceRepository.findAll();
    }

    public void saveInvoice(InvoiceModel invoice) {
        invoiceRepository.save(invoice);
    }
}
