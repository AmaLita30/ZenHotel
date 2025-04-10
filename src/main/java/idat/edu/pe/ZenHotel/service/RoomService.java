package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.dto.RoomDto;
import idat.edu.pe.ZenHotel.model.*;
import idat.edu.pe.ZenHotel.repository.RoomRepository;
import idat.edu.pe.ZenHotel.repository.RoomStatusRepository;
import idat.edu.pe.ZenHotel.repository.RoomTypeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomRepository;
    private final RoomStatusRepository roomStatusRepository;
    private final RoomTypeRepository roomTypeRepository;

    public RoomService(RoomRepository roomRepository, RoomStatusRepository roomStatusRepository, RoomTypeRepository roomTypeRepository) {
        this.roomRepository = roomRepository;
        this.roomStatusRepository = roomStatusRepository;
        this.roomTypeRepository = roomTypeRepository;
    }

    public List<RoomModel> getRooms() {
        return roomRepository.findAll();
    }

    public RoomModel getRoomById(int id){
        return roomRepository.findById(id).orElse(null);
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

    public void saveRoomDto(RoomDto roomDto){
        RoomModel room = new RoomModel();
        room.setPrice(roomDto.getPrice());
        room.setRoomnum(roomDto.getRoomnum());
        room.setRoomdescription(roomDto.getRoomdescription());
        RoomStatusModel status = roomStatusRepository.findById(roomDto.getIdstatus()).orElse(null);
        RoomTypeModel type = roomTypeRepository.findById(roomDto.getIdroomtype()).orElse(null);
        room.setRoomstatus(status);
        room.setRoomtype(type);

        roomRepository.save(room);
    }
}