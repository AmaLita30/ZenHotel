package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.dto.InvoiceDto;
import idat.edu.pe.ZenHotel.model.InvoiceModel;
import idat.edu.pe.ZenHotel.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @GetMapping
    public List<InvoiceModel> listAll() {
        return invoiceService.listAll();
    }

    @PostMapping
    public InvoiceModel create(@RequestBody InvoiceDto dto) {
        return invoiceService.save(dto);
    }

    @GetMapping("/{id}")
    public InvoiceModel getById(@PathVariable Integer id) {
        return invoiceService.getById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        invoiceService.delete(id);
    }
}
