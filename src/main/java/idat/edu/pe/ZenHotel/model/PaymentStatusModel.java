package idat.edu.pe.ZenHotel.model;

public class PaymentStatusModel {
    private Integer idPaymentStatus;
    private String paymentStatus;

    public PaymentStatusModel(Integer idPaymentStatus, String paymentStatus) {
        this.idPaymentStatus = idPaymentStatus;
        this.paymentStatus = paymentStatus;
    }

    public Integer getIdPaymentStatus() {
        return idPaymentStatus;
    }

    public void setIdPaymentStatus(Integer idPaymentStatus) {
        this.idPaymentStatus = idPaymentStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
