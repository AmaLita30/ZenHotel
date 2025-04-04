package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.model.PaymentMethodModel;
import idat.edu.pe.ZenHotel.service.PaymentMethodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/paymentmethod")
public class PaymentMethodController {
    private final PaymentMethodService paymentMethodService;

    public PaymentMethodController(PaymentMethodService paymentMethodService) {
        this.paymentMethodService = paymentMethodService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("paymentmethods", paymentMethodService.getPaymentMethods());
        return "paymentmethod/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("paymentmethod", new PaymentMethodModel());
        return "paymentmethod/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        model.addAttribute("paymentmethod", paymentMethodService.getPaymentMethodById(id));
        return "paymentmethod/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("paymentmethod") PaymentMethodModel paymentMethod){
        paymentMethodService.savePaymentMethod(paymentMethod);
        return "redirect:/paymentmethod";
    }
}