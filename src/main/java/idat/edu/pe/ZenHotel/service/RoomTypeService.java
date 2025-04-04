package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.model.RoomTypeModel;
import idat.edu.pe.ZenHotel.repository.RoomTypeRepository;

import java.util.List;

public class RoomTypeService {
    private final RoomTypeRepository roomTypeRepository;

    public RoomTypeService(RoomTypeRepository roomTypeRepository) {
        this.roomTypeRepository = roomTypeRepository;
    }

    public List<RoomTypeModel> getRoomTypes() {
        return roomTypeRepository.findAll();
    }

    public void saveRoomType (RoomTypeModel roomtype) {
        roomTypeRepository.save(roomtype);
    }
}
