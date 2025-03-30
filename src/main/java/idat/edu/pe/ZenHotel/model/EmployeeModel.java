package idat.edu.pe.ZenHotel.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeModel extends PersonModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idemployee;
    private String codemployee;
    private Integer idrole;
    @OneToOne
    @JoinColumn(name = "idperson")
    private Integer idperson;

    public Integer getIdemployee() {
        return idemployee;
    }

    public void setIdemployee(Integer idemployee) {
        this.idemployee = idemployee;
    }

    public String getCodemployee() {
        return codemployee;
    }

    public void setCodemployee(String codemployee) {
        this.codemployee = codemployee;
    }

    public Integer getIdrole() {
        return idrole;
    }

    public void setIdrole(Integer idrole) {
        this.idrole = idrole;
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
