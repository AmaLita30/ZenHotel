package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.model.PaymentStatusModel;
import idat.edu.pe.ZenHotel.service.PaymentStatusService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/paymentstatus")
public class PaymentStatusController {
    private final PaymentStatusService paymentStatusService;

    public PaymentStatusController(PaymentStatusService paymentStatusService) {
        this.paymentStatusService = paymentStatusService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("paymentstatues", paymentStatusService.getPaymentStatus());
        return "paymentstatus/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("paymentstatus", new PaymentStatusModel());
        return "paymentstatus/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        model.addAttribute("paymentstatus", paymentStatusService.getPaymentStatusById(id));
        return "paymentstatus/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("paymentmethod") PaymentStatusModel paymentStatus){
        paymentStatusService.savePaymentStatus(paymentStatus);
        return "redirect:/paymentstatus";
    }
}