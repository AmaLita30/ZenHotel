package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.model.RoomTypeModel;
import idat.edu.pe.ZenHotel.service.RoomTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/roomtype")
public class RoomTypeController {
    private final RoomTypeService roomTypeService;

    public RoomTypeController(RoomTypeService roomTypeService) {
        this.roomTypeService = roomTypeService;
    }

    @GetMapping
    public String index(Model model){
        model.addAttribute("roomtypes", roomTypeService.getRoomTypes());
        return "roomtype/index";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("roomtype", new RoomTypeModel());
        return "roomtype/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id){
        model.addAttribute("roomtype", roomTypeService.getRoomTypeById(id));
        return "roomtype/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("roomtype")RoomTypeModel roomtype){
        roomTypeService.saveRoomType(roomtype);
        return "redirect:/roomtype";
    }
}