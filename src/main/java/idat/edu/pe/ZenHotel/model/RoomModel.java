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
    @JoinColumn(name = "idroomstatus")
    private RoomStatusModel roomstatus;


}