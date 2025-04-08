package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    private final RoomService roomService;

    public HomeController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/configuration")
    public String configuration(){
        return "configuration";
    }

    @GetMapping("/home")
    public String mostrarGrafico(Model model) {
        Long countA = roomService.getAvailableRoomCount();
        Long countR = roomService.getReservedRoomCount();
        Long countO = roomService.getOccupiedRoomCount();

        List<Object[]> resultados = roomService.getRoomCountByStatus();
        List<String> categorias = new ArrayList<>();
        List<Integer> valores = new ArrayList<>();

        for (Object[] obj : resultados) {
            categorias.add((String) obj[0]); // Nombre del estado
            valores.add(((Long) obj[1]).intValue()); // Conteo de habitaciones
        }

        model.addAttribute("availableCount", countA);
        model.addAttribute("reservedCount", countR);
        model.addAttribute("occupiedCount", countO);
        model.addAttribute("categorias", categorias);
        model.addAttribute("valores", valores);

        return "home";
    }
}
