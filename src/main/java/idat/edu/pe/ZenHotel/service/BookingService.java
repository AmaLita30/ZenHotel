package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.model.BookingModel;
import idat.edu.pe.ZenHotel.repository.BookingRepository;

import java.util.List;

public class BookingService {
    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<BookingModel> getBookings() {
        return bookingRepository.findAll();
    }

    public void saveBooking (BookingModel booking) {
        bookingRepository.save(booking);
    }
}
