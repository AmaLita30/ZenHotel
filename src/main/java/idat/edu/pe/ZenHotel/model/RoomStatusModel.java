package idat.edu.pe.ZenHotel.model;
import jakarta.persistence.*;

@Entity
@Table(name = "roomstatus")
public class RoomStatusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idstatus;
    private String roomstatusname;

    public Integer getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Integer idstatus) {
        this.idstatus = idstatus;
    }

    public String getRoomstatusname() {
        return roomstatusname;
    }

    public void setRoomstatusname(String roomstatusname) {
        this.roomstatusname = roomstatusname;
    }
}