package idat.edu.pe.ZenHotel.model;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "booking")
public class BookingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idbooking;
    private Date bookingdate;
    private Date checkindate;
    private Date checkoutdate;
    @OneToOne
    @JoinColumn(name = "idemployee")
    private EmployeeModel employee;
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

    public EmployeeModel getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeModel employee) {
        this.employee = employee;
    }

    public CustomerModel getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerModel customer) {
        this.customer = customer;
    }
}