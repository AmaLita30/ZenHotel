package idat.edu.pe.ZenHotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping("/customer")
    public String customer() {
        return "customer";
    }

    @GetMapping("/customerForm")
    public String customerForm() {
        return ("customerForm");
    }
}
