package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.dto.RoomDto;
import idat.edu.pe.ZenHotel.model.RoleModel;
import idat.edu.pe.ZenHotel.service.RoomService;
import idat.edu.pe.ZenHotel.service.RoomStatusService;
import idat.edu.pe.ZenHotel.service.RoomTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/room")
public class RoomController {
    private final RoomService roomService;
    private final RoomStatusService roomStatusService;
    private final RoomTypeService roomTypeService;

    public RoomController(RoomService roomService, RoomStatusService roomStatusService, RoomTypeService roomTypeService) {
        this.roomService = roomService;
        this.roomStatusService = roomStatusService;
        this.roomTypeService = roomTypeService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("rooms", roomService.getRooms());
        return "room/index";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("roomDTO", new RoomDto());
        model.addAttribute("types", roomTypeService.getRoomTypes());
        model.addAttribute("statuses",roomStatusService.getRoomStatuses());
        return "room/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("roomDTO") RoomDto roomDto){
        roomService.saveRoom(roomDto);
        return "redirect:/room";
    }
}