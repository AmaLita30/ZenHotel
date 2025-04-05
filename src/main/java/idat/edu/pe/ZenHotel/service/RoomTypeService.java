package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.model.RoomTypeModel;
import idat.edu.pe.ZenHotel.repository.RoomTypeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomTypeService {
    private final RoomTypeRepository roomTypeRepository;

    public RoomTypeService(RoomTypeRepository roomTypeRepository) {
        this.roomTypeRepository = roomTypeRepository;
    }

    public List<RoomTypeModel> getRoomTypes() {
        return roomTypeRepository.findAll();
    }

    public RoomTypeModel getRoomTypeById(int id) {
        return roomTypeRepository.findById(id).orElse(null);
    }

    public void saveRoomType (RoomTypeModel roomtype) {
        roomTypeRepository.save(roomtype);
    }
}