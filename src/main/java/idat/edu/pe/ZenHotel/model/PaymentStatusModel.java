package idat.edu.pe.ZenHotel.model;
import jakarta.persistence.*;

@Entity
@Table(name = "paymentstatus")
public class PaymentStatusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpaymentstatus;
    private String paymentstatus;

    public Integer getIdpaymentstatus() {
        return idpaymentstatus;
    }

    public void setIdpaymentstatus(Integer idpaymentstatus) {
        this.idpaymentstatus = idpaymentstatus;
    }

    public String getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus;
    }
}