package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.dto.BookingDto;
import idat.edu.pe.ZenHotel.model.BookingModel;
import idat.edu.pe.ZenHotel.model.RoomModel;
import idat.edu.pe.ZenHotel.service.BookingService;
import idat.edu.pe.ZenHotel.service.CustomerService;
import idat.edu.pe.ZenHotel.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("booking")
public class BookingController {
    private final BookingService bookingService;
    private final RoomService roomService;
    private final CustomerService customerService;

    public BookingController(BookingService bookingService, RoomService roomService, CustomerService customerService) {
        this.bookingService = bookingService;
        this.roomService = roomService;
        this.customerService = customerService;
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

    @GetMapping("/create/{id}")
    public String create(Model model, @PathVariable int id) {
        model.addAttribute("room", roomService.getRoomById(id));
//        model.addAttribute("rm", new RoomModel());
//        model.addAttribute("booking", new BookingModel());
//        BookingModel bk = new BookingModel();
//        bk.setBookingdate(new Date());
        model.addAttribute("booking", new BookingDto());
        model.addAttribute("customers", customerService.getCustomers());
        return "booking/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("booking") BookingDto bookingDto){
        bookingService.saveBookingDto(bookingDto);
        return "redirect:/booking";
    }
}