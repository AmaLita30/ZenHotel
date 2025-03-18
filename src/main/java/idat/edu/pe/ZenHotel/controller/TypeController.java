package idat.edu.pe.ZenHotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TypeController {

    @GetMapping("/type")
    public String type(){
        return "type";
    }

    @GetMapping("/typeForm")
    public String typeForm(){
        return "typeForm";
    }
}
