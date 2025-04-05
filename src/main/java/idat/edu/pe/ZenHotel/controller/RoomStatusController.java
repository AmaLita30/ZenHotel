package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.model.RoomStatusModel;
import idat.edu.pe.ZenHotel.service.RoomStatusService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/roomstatus")
public class RoomStatusController {

    private final RoomStatusService roomStatusService;

    public RoomStatusController(RoomStatusService roomStatusService) {
        this.roomStatusService = roomStatusService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("roomstatuses", roomStatusService.getRoomStatuses());
        return "roomstatus/index";
    }
    @GetMapping("/create")
    public  String create(Model model) {
        model.addAttribute("roomstatus", new RoomStatusModel());
        return "roomstatus/create";
    }

    @GetMapping("/edit/{id}")
    public  String edit(Model model, @PathVariable int id){
        model.addAttribute("roomstatus", roomStatusService.getRoomStatusById(id));
        return  "roomstatus/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("roomstatus") RoomStatusModel roomStatus) {
        roomStatusService.saveRoomStatus(roomStatus);
        return "redirect:/roomstatus";
    }
}
