package idat.edu.pe.ZenHotel.model;

public class RoomModel {
    private Integer idRoom;
    private Integer roomNum;
    private Double price;
    private String roomDescription;
    private Integer idRoomType;
    private Integer idRoomStatus;

    public RoomModel(Integer idRoom, Integer roomNum, Double price, String roomDescription, Integer idRoomType, Integer idRoomStatus) {
        this.idRoom = idRoom;
        this.roomNum = roomNum;
        this.price = price;
        this.roomDescription = roomDescription;
        this.idRoomType = idRoomType;
        this.idRoomStatus = idRoomStatus;
    }

    public Integer getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(Integer idRoom) {
        this.idRoom = idRoom;
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public Integer getIdRoomType() {
        return idRoomType;
    }

    public void setIdRoomType(Integer idRoomType) {
        this.idRoomType = idRoomType;
    }

    public Integer getIdRoomStatus() {
        return idRoomStatus;
    }

    public void setIdRoomStatus(Integer idRoomStatus) {
        this.idRoomStatus = idRoomStatus;
    }
}
