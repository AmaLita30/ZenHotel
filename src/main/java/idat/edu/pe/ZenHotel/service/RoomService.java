package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.model.RoomModel;
import idat.edu.pe.ZenHotel.repository.RoomRepository;

import java.util.List;

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
}
