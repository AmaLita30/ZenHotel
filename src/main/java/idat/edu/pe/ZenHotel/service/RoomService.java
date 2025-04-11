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
        if (roomDto.getIdroom() != null) {
            // Es una actualización
            roomRepository.UpdateRoom(
                roomDto.getRoomnum(),
                roomDto.getPrice(),
                roomDto.getRoomdescription(),
                roomDto.getIdroomtype(),
                roomDto.getIdstatus(),
                roomDto.getIdroom()
            );
        } else {
            // Es un registro nuevo
            RoomModel room = new RoomModel();
            room.setRoomnum(roomDto.getRoomnum());
            room.setPrice(roomDto.getPrice());
            room.setRoomdescription(roomDto.getRoomdescription());
            RoomTypeModel roomType = roomTypeRepository.findById(roomDto.getIdroomtype()).orElse(null);
            RoomStatusModel roomStatus = roomStatusRepository.findById(roomDto.getIdstatus()).orElse(null);
            room.setRoomtype(roomType);
            room.setRoomstatus(roomStatus);
            roomRepository.save(room);
        }
    }

    public RoomDto getRoomDtoById(int id) {
        RoomModel roomModel = getRoomById(id);

        RoomDto roomDto = new RoomDto();
        roomDto.setIdroom(roomModel.getIdroom());
        roomDto.setRoomnum(roomModel.getRoomnum());
        roomDto.setPrice(roomModel.getPrice());
        roomDto.setRoomdescription(roomModel.getRoomdescription());
        roomDto.setIdroomtype(roomModel.getRoomtype().getIdroomtype());
        roomDto.setIdstatus(roomModel.getRoomstatus().getIdstatus());
        return roomDto;
    }
}