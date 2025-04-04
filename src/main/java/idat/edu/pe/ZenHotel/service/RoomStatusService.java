package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.model.RoomModel;
import idat.edu.pe.ZenHotel.model.RoomStatusModel;
import idat.edu.pe.ZenHotel.repository.RoomStatusRepository;

import java.util.List;

public class RoomStatusService {
    private final RoomStatusRepository roomStatusRepository;

    public RoomStatusService(RoomStatusRepository roomStatusServiceRepository) {
        this.roomStatusRepository = roomStatusServiceRepository;
    }

    public List<RoomStatusModel> getRoomStatuses() {
        return roomStatusRepository.findAll();
    }

    public void saveRoomStatus(RoomStatusModel roomstatus) {
        roomStatusRepository.save(roomstatus);
    }
}
