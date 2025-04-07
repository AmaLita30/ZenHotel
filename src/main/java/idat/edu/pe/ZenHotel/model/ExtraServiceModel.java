package idat.edu.pe.ZenHotel.model;
import jakarta.persistence.*;

@Entity
@Table(name = "extraservice")
public class ExtraServiceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idextraservice;
    private String extraservicename;
    private Double price;
    private String description;

    public Integer getIdextraservice() {
        return idextraservice;
    }

    public void setIdextraservice(Integer idextraservice) {
        this.idextraservice = idextraservice;
    }

    public String getExtraservicename() {
        return extraservicename;
    }

    public void setExtraservicename(String extraservicename) {
        this.extraservicename = extraservicename;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}