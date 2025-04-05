package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.model.CustomerModel;
import idat.edu.pe.ZenHotel.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("customers", customerService.getCustomers());
        return "customer/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new CustomerModel());
        return "customer/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        model.addAttribute("customer", customerService.getCustomerById(id));
        return "customer/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("customer") CustomerModel customer){
        customerService.saveCustomer(customer);
        return "redirect:/customer";
    }
}