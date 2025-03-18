package idat.edu.pe.ZenHotel.model;

public class RoomTypeModel {
    private Integer idType;
    private String type;

    public RoomTypeModel(Integer idType, String type) {
        this.idType = idType;
        this.type = type;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
