package idat.edu.pe.ZenHotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReceptionController {

    @GetMapping("/reception")
    public String reception(){
        return "reception";
    }
}
