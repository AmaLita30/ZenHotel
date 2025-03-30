package idat.edu.pe.ZenHotel.model;
import jakarta.persistence.*;

@Entity
@Table(name = "paymentmethod")
public class PaymentMethodModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpaymentmethod;
    private String paymentmethod;

    public Integer getIdpaymentmethod() {
        return idpaymentmethod;
    }

    public void setIdpaymentmethod(Integer idpaymentmethod) {
        this.idpaymentmethod = idpaymentmethod;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }
}