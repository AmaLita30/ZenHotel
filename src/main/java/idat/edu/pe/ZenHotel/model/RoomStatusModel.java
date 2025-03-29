package idat.edu.pe.ZenHotel.model;
import jakarta.persistence.*;

@Entity
@Table(name = "roomstatus")
public class RoomStatusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idroomstatus;
    private String status;

    public Integer getIdroomstatus() {
        return idroomstatus;
    }

    public void setIdroomstatus(Integer idroomstatus) {
        this.idroomstatus = idroomstatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}