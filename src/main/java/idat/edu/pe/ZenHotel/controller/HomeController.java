package idat.edu.pe.ZenHotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home.html")
    public String home(){
        return "home";
    }
}
