package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.dto.InvoiceDto;
import idat.edu.pe.ZenHotel.model.BookingModel;
import idat.edu.pe.ZenHotel.model.InvoiceModel;
import idat.edu.pe.ZenHotel.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("invoice")
public class InvoiceController {
    private final InvoiceService invoiceService;
    private final BookingService bookingService;
    private final PaymentMethodService paymentMethodService;
    private final PaymentStatusService paymentStatusService;
    private final ExtraService extraService;

    public InvoiceController(InvoiceService invoiceService, BookingService bookingService, PaymentMethodService paymentMethodService, PaymentStatusService paymentStatusService, ExtraService extraService) {
        this.invoiceService = invoiceService;
        this.bookingService = bookingService;
        this.paymentMethodService = paymentMethodService;
        this.paymentStatusService = paymentStatusService;
        this.extraService = extraService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("invoices", invoiceService.getInvoices());
        return "invoice/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("invoice", new InvoiceDto());
        model.addAttribute("bookings", bookingService.getBookings());
        model.addAttribute("paymentmethods", paymentMethodService.getPaymentMethods());
        model.addAttribute("paymentstatuses", paymentStatusService.getPaymentStatus());
        model.addAttribute("extraservices", extraService.getExtraServices());
        return "invoice/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        model.addAttribute("invoice", invoiceService.getInvoiceDtoById(id));
        model.addAttribute("bookings", bookingService.getBookings());
        model.addAttribute("paymentmethods", paymentMethodService.getPaymentMethods());
        model.addAttribute("paymentstatuses", paymentStatusService.getPaymentStatus());
        model.addAttribute("extraservices", extraService.getExtraServices());
        return "invoice/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("invoice") InvoiceDto invoiceDto) {
        invoiceService.saveInvoiceDto(invoiceDto);
        return "redirect:/invoice";
    }

}
