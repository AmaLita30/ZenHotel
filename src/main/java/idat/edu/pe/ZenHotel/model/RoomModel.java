package idat.edu.pe.ZenHotel.model;
import jakarta.persistence.*;

@Entity
@Table(name = "room")
public class RoomModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idroom;
    private Integer roomnum;
    private Double price;
    private String roomdescription;
    @ManyToOne
    @JoinColumn(name = "idroomtype")
    private RoomTypeModel roomtype;
    @ManyToOne
    @JoinColumn(name = "idstatus")
    private RoomStatusModel roomstatus;

    public Integer getIdroom() {
        return idroom;
    }

    public void setIdroom(Integer idroom) {
        this.idroom = idroom;
    }

    public Integer getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(Integer roomnum) {
        this.roomnum = roomnum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRoomdescription() {
        return roomdescription;
    }

    public void setRoomdescription(String roomdescription) {
        this.roomdescription = roomdescription;
    }

    public RoomTypeModel getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(RoomTypeModel roomtype) {
        this.roomtype = roomtype;
    }

    public RoomStatusModel getRoomstatus() {
        return roomstatus;
    }

    public void setRoomstatus(RoomStatusModel roomstatus) {
        this.roomstatus = roomstatus;
    }
}