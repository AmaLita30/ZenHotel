package idat.edu.pe.ZenHotel.dto;

public class RoomDto {
    private Integer idroom;
    private Integer roomnum;
    private Double price;
    private String roomdescription;
    private Integer idroomtype;
    private Integer idroomstatus;

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

    public Integer getIdroomtype() {
        return idroomtype;
    }

    public void setIdroomtype(Integer idroomtype) {
        this.idroomtype = idroomtype;
    }

    public Integer getIdroomstatus() {
        return idroomstatus;
    }

    public void setIdroomstatus(Integer idroomstatus) {
        this.idroomstatus = idroomstatus;
    }
}