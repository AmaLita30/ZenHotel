package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.model.RoomModel;
import idat.edu.pe.ZenHotel.service.BookingService;
import idat.edu.pe.ZenHotel.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("booking")
public class BookingController {
    private final BookingService bookingService;
    private final RoomService roomService;

    public BookingController(BookingService bookingService, RoomService roomService) {
        this.bookingService = bookingService;
        this.roomService = roomService;
    }

    @GetMapping
    public String index(Model model){
        model.addAttribute("bookings", bookingService.getBookings());
        return "booking/index";
    }

    @GetMapping("reception")
    public String reception(Model model){
        model.addAttribute("rooms", roomService.getRooms());
        return "booking/reception";
    }
}