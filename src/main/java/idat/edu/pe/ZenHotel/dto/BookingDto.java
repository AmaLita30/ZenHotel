package idat.edu.pe.ZenHotel.dto;

import java.util.Date;

public class BookingDto {
    private Integer idbooking;
    private Date bookingdate;
    private Date checkindate;
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
