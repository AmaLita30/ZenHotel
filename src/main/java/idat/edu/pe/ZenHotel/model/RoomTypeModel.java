package idat.edu.pe.ZenHotel.model;
import jakarta.persistence.*;

@Entity
@Table(name = "roomtype")
public class RoomTypeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idroomtype;
    private String type;

    public Integer getIdroomtype() {
        return idroomtype;
    }

    public void setIdroomtype(Integer idroomtype) {
        this.idroomtype = idroomtype;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}