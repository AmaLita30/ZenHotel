package idat.edu.pe.ZenHotel.model;
import jakarta.persistence.*;

@Entity
@Table(name = "paymentstatus")
public class PaymentStatusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpaymentstatus;
    private String paymentstatusname;

    public Integer getIdpaymentstatus() {
        return idpaymentstatus;
    }

    public void setIdpaymentstatus(Integer idpaymentstatus) {
        this.idpaymentstatus = idpaymentstatus;
    }

    public String getPaymentstatusname() {
        return paymentstatusname;
    }

    public void setPaymentstatusname(String paymentstatusname) {
        this.paymentstatusname = paymentstatusname;
    }
}