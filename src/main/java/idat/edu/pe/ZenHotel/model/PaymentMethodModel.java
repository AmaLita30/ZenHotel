package idat.edu.pe.ZenHotel.model;

public class PaymentMethodModel {
    private Integer idPaymentMethod;
    private String paymentMethod;

    public PaymentMethodModel(Integer idPaymentMethod, String paymentMethod) {
        this.idPaymentMethod = idPaymentMethod;
        this.paymentMethod = paymentMethod;
    }

    public Integer getIdPaymentMethod() {
        return idPaymentMethod;
    }

    public void setIdPaymentMethod(Integer idPaymentMethod) {
        this.idPaymentMethod = idPaymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
