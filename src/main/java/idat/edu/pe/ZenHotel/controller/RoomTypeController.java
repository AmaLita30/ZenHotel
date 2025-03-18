package idat.edu.pe.ZenHotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoomTypeController {

    @GetMapping("/roomType")
    public String type(){
        return "roomType";
    }

    @GetMapping("/roomTypeForm")
    public String typeForm(){
        return "roomTypeForm";
    }
}
