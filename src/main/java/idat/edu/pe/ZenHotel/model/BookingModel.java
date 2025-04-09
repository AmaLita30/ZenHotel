package idat.edu.pe.ZenHotel.model;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "booking")
public class BookingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idbooking;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date bookingdate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date checkindate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date checkoutdate;
    @OneToOne
    @JoinColumn(name = "idroom")
    private RoomModel room;
    @OneToOne
    @JoinColumn(name = "idcustomer")
    private CustomerModel customer;

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

    public RoomModel getRoom() {
        return room;
    }

    public void setRoom(RoomModel room) {
        this.room = room;
    }

    public CustomerModel getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerModel customer) {
        this.customer = customer;
    }
}