package idat.edu.pe.ZenHotel.model;

import java.util.Date;

public class BookingModel {
    private Integer idBooking;
    private Date bookingDate;
    private Date checkInDate;
    private Date checkOutDate;
    private Integer idEmployee;
    private Integer idGuest;

    public BookingModel(Integer idBooking, Date bookingDate, Date checkInDate, Date checkOutDate, Integer idEmployee, Integer idGuest) {
        this.idBooking = idBooking;
        this.bookingDate = bookingDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.idEmployee = idEmployee;
        this.idGuest = idGuest;
    }

    public Integer getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Integer idBooking) {
        this.idBooking = idBooking;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Integer getIdGuest() {
        return idGuest;
    }

    public void setIdGuest(Integer idGuest) {
        this.idGuest = idGuest;
    }
}
