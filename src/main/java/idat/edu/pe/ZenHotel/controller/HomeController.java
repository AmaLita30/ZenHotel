package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.service.InvoiceService;
import idat.edu.pe.ZenHotel.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {
    private final RoomService roomService;
    private final InvoiceService invoiceService;

    public HomeController(RoomService roomService, InvoiceService invoiceService) {
        this.roomService = roomService;
        this.invoiceService = invoiceService;
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
        Double totalIcome = invoiceService.getTotalIncome();

        // ROOMS
        List<Object[]> resultados = roomService.getRoomCountByStatus();
        List<String> categorias = new ArrayList<>();
        List<Integer> valores = new ArrayList<>();

        for (Object[] obj : resultados) {
            categorias.add((String) obj[0]); // Nombre del estado
            valores.add(((Long) obj[1]).intValue()); // Conteo de habitaciones
        }

        // INVOICE
        List<Object[]> resultados2 = invoiceService.getDailyIncome();
        List<Date> date = new ArrayList<>();
        List<Double> amount = new ArrayList<>();

        for (Object[] obj : resultados2) {
            amount.add(((BigDecimal) obj[0]).doubleValue());
            date.add((Date) obj[1]);     // paymentdate
        }

        model.addAttribute("availableCount", countA);
        model.addAttribute("reservedCount", countR);
        model.addAttribute("occupiedCount", countO);
        model.addAttribute("totalIncome", totalIcome);
        model.addAttribute("categorias", categorias);
        model.addAttribute("valores", valores);
        model.addAttribute("date", date);
        model.addAttribute("amount", amount);

        return "home";
    }
}
