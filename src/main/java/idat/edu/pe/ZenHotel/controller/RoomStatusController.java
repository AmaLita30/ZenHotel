package idat.edu.pe.ZenHotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoomStatusController {

    @GetMapping("/roomStatus")
    public String status(){
        return "roomStatus";
    }

    @GetMapping("/roomStatusForm")
    public String statusForm(){
        return "roomStatusForm";
    }
}
