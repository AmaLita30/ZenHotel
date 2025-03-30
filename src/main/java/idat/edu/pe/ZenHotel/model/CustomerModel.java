package idat.edu.pe.ZenHotel.model;
import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class CustomerModel extends PersonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcustomer;
    @OneToOne
    @JoinColumn(name = "idperson")
    private Integer idperson;

    public Integer getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(Integer idcustomer) {
        this.idcustomer = idcustomer;
    }

    @Override
    public Integer getIdperson() {
        return idperson;
    }

    @Override
    public void setIdperson(Integer idperson) {
        this.idperson = idperson;
    }
}
