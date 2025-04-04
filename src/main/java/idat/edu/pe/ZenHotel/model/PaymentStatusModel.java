package idat.edu.pe.ZenHotel.model;

import jakarta.persistence.*;

@Entity
@Table(name = "paymentstatus")
public class PaymentStatusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String paymentstatusname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaymentstatusname() {
        return paymentstatusname;
    }

    public void setPaymentstatusname(String paymentstatusname) {
        this.paymentstatusname = paymentstatusname;
    }
}