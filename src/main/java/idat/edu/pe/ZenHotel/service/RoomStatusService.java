package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.model.RoomModel;
import idat.edu.pe.ZenHotel.model.RoomStatusModel;
import idat.edu.pe.ZenHotel.repository.RoomStatusRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomStatusService {
    private final RoomStatusRepository roomStatusRepository;

    public RoomStatusService(RoomStatusRepository roomStatusServiceRepository) {
        this.roomStatusRepository = roomStatusServiceRepository;
    }

    public List<RoomStatusModel> getRoomStatuses() {
        return roomStatusRepository.findAll();
    }

    public RoomStatusModel getRoomStatusById(int id){
        return roomStatusRepository.findById(id).orElse(null);
    }
    public void saveRoomStatus(RoomStatusModel roomstatus) {
        roomStatusRepository.save(roomstatus);
    }
}
