package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.dto.RoomDto;
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

    public RoomModel getRoomById(int id){
        return roomRepository.findById(id).orElse(null);
    }

    public void updateRoom(RoomDto dto) {
        roomRepository.UpdateRoom(
                dto.getRoomnum(),
                dto.getPrice(),
                dto.getRoomdescription(),
                dto.getIdroomtype(),
                dto.getIdstatus(),
                dto.getIdroom()
        );
    }

    public Long getAvailableRoomCount() {
        return roomRepository.countAvailableRooms();
    }

    public Long getReservedRoomCount() {
        return roomRepository.countReservedRooms();
    }

    public Long getOccupiedRoomCount() {
        return roomRepository.countOccupiedRooms();
    }

    public List<Object[]> getRoomCountByStatus() {
        return roomRepository.countRoomsByStatus();
    }
}