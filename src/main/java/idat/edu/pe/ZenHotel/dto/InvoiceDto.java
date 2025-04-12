package idat.edu.pe.ZenHotel.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class InvoiceDto {
    private Integer idinvoice;
    private Integer idbooking;
    private Integer idpaymentmethod;
    private Integer idpaymentstatus;
    private Integer idextraservice;
    private Double amount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date paymentdate;

    // Getters y Setters
    public Integer getIdinvoice() {
        return idinvoice;
    }

    public void setIdinvoice(Integer idinvoice) {
        this.idinvoice = idinvoice;
    }

    public Integer getIdbooking() {
        return idbooking;
    }

    public void setIdbooking(Integer idbooking) {
        this.idbooking = idbooking;
    }

    public Integer getIdpaymentmethod() {
        return idpaymentmethod;
    }

    public void setIdpaymentmethod(Integer idpaymentmethod) {
        this.idpaymentmethod = idpaymentmethod;
    }

    public Integer getIdpaymentstatus() {
        return idpaymentstatus;
    }

    public void setIdpaymentstatus(Integer idpaymentstatus) {
        this.idpaymentstatus = idpaymentstatus;
    }

    public Integer getIdextraservice() {
        return idextraservice;
    }

    public void setIdextraservice(Integer idextraservice) {
        this.idextraservice = idextraservice;
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
