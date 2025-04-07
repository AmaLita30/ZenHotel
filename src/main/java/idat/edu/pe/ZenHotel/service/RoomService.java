package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.model.RoomModel;
import idat.edu.pe.ZenHotel.repository.RoomRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<RoomModel> getRooms() {
        return roomRepository.findAll();
    }

    public void saveRoom (RoomModel room) {
        roomRepository.save(room);
    }

    public RoomModel getRoomById(int id){
        return roomRepository.findById(id).orElse(null);
    }
}