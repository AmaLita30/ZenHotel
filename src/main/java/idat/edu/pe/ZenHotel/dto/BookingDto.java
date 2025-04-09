package idat.edu.pe.ZenHotel.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BookingDto {
    private Integer idbooking;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date bookingdate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date checkindate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date checkoutdate;
    private Integer idroom;
    private Integer idcustomer;

    public Integer getIdbooking() {
        return idbooking;
    }

    public void setIdbooking(Integer idbooking) {
        this.idbooking = idbooking;
    }

    public Date getBookingdate() {
        return bookingdate;
    }

    public void setBookingdate(Date bookingdate) {
        this.bookingdate = bookingdate;
    }

    public Date getCheckindate() {
        return checkindate;
    }

    public void setCheckindate(Date checkindate) {
        this.checkindate = checkindate;
    }

    public Date getCheckoutdate() {
        return checkoutdate;
    }

    public void setCheckoutdate(Date checkoutdate) {
        this.checkoutdate = checkoutdate;
    }

    public Integer getIdroom() {
        return idroom;
    }

    public void setIdroom(Integer idroom) {
        this.idroom = idroom;
    }

    public Integer getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(Integer idcustomer) {
        this.idcustomer = idcustomer;
    }
}