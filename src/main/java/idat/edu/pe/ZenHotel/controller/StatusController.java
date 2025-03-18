package idat.edu.pe.ZenHotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatusController {

    @GetMapping("/status")
    public String status(){
        return "status";
    }

    @GetMapping("/statusForm")
    public String statusForm(){
        return "statusForm";
    }
}
