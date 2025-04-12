package idat.edu.pe.ZenHotel.model;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "invoice")
public class InvoiceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idinvoice;
    @ManyToOne
    @JoinColumn(name = "idbooking")
    private BookingModel booking;
    @ManyToOne
    @JoinColumn(name = "idpaymentmethod")
    private PaymentMethodModel paymentmethod;
    @ManyToOne
    @JoinColumn(name = "idpaymentstatus")
    private PaymentStatusModel paymentstatus;
    @ManyToOne
    @JoinColumn(name = "idextraservice")
    private ExtraServiceModel extraservice;
    private Double amount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date paymentdate;

    public Integer getIdinvoice() {
        return idinvoice;
    }

    public void setIdinvoice(Integer idinvoice) {
        this.idinvoice = idinvoice;
    }

    public BookingModel getBooking() {
        return booking;
    }

    public void setBooking(BookingModel booking) {
        this.booking = booking;
    }

    public PaymentMethodModel getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(PaymentMethodModel paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public PaymentStatusModel getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(PaymentStatusModel paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    public ExtraServiceModel getExtraservice() {
        return extraservice;
    }

    public void setExtraservice(ExtraServiceModel extraservice) {
        this.extraservice = extraservice;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Date paymentdate) {
        this.paymentdate = paymentdate;
    }
}