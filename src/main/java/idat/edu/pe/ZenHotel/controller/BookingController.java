package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.dto.BookingDto;
import idat.edu.pe.ZenHotel.service.BookingService;
import idat.edu.pe.ZenHotel.service.CustomerService;
import idat.edu.pe.ZenHotel.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("booking", new BookingDto());
        model.addAttribute("customers", customerService.getCustomers());
        return "booking/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id){
        model.addAttribute("room", roomService.getRoomById(id));
        model.addAttribute("customers", customerService.getCustomers());
        model.addAttribute("booking", bookingService.getBookingDtoById(id));
        return "booking/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("booking") BookingDto bookingDto){
        bookingService.saveBookingDto(bookingDto);
        return "redirect:/booking";
    }
}