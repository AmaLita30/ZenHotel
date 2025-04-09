package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.dto.BookingDto;
import idat.edu.pe.ZenHotel.model.BookingModel;
import idat.edu.pe.ZenHotel.model.CustomerModel;
import idat.edu.pe.ZenHotel.model.RoomModel;
import idat.edu.pe.ZenHotel.repository.BookingRepository;
import idat.edu.pe.ZenHotel.repository.CustomerRepository;
import idat.edu.pe.ZenHotel.repository.RoomRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    private final CustomerRepository customerRepository;
    private final RoomRepository roomRepository;

    public BookingService(BookingRepository bookingRepository, CustomerRepository customerRepository, RoomRepository roomRepository) {
        this.bookingRepository = bookingRepository;
        this.customerRepository = customerRepository;
        this.roomRepository = roomRepository;
    }

    public List<BookingModel> getBookings() {
        return bookingRepository.findAll();
    }

    public void saveBooking(BookingModel booking) {
        bookingRepository.save(booking);
    }

    public BookingModel getBookingById(int id){
        return bookingRepository.findById(id).orElse(null);
    }

    public void saveBookingDto(BookingDto bookingDto){
        BookingModel booking = new BookingModel();
        booking.setBookingdate(bookingDto.getBookingdate());
        booking.setCheckindate(bookingDto.getCheckindate());
        booking.setCheckoutdate(bookingDto.getCheckoutdate());
        CustomerModel customer = customerRepository.findById(bookingDto.getIdcustomer()).orElse(null);
        RoomModel room = roomRepository.findById(bookingDto.getIdroom()).orElse(null);
        booking.setCustomer(customer);
        booking.setRoom(room);
        bookingRepository.save(booking);
    }
}