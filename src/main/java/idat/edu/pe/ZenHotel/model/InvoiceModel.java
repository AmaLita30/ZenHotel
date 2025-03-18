package idat.edu.pe.ZenHotel.model;

import java.util.Date;

public class InvoiceModel {
    private Integer idInvoice;
    private Integer idBooking;
    private Integer idPaymentMethod;
    private Integer idPaymentStatus;
    private Double totalAmount;
    private Date paymentDate;

    public InvoiceModel(Integer idInvoice, Integer idBooking, Integer idPaymentMethod, Integer idPaymentStatus, Double totalAmount, Date paymentDate) {
        this.idInvoice = idInvoice;
        this.idBooking = idBooking;
        this.idPaymentMethod = idPaymentMethod;
        this.idPaymentStatus = idPaymentStatus;
        this.totalAmount = totalAmount;
        this.paymentDate = paymentDate;
    }

    public Integer getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }

    public Integer getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Integer idBooking) {
        this.idBooking = idBooking;
    }

    public Integer getIdPaymentMethod() {
        return idPaymentMethod;
    }

    public void setIdPaymentMethod(Integer idPaymentMethod) {
        this.idPaymentMethod = idPaymentMethod;
    }

    public Integer getIdPaymentStatus() {
        return idPaymentStatus;
    }

    public void setIdPaymentStatus(Integer idPaymentStatus) {
        this.idPaymentStatus = idPaymentStatus;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
