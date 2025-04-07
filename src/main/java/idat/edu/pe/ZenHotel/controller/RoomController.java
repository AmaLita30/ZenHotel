package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/room")
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("rooms", roomService.getRooms());
        return "room/index";
    }
}