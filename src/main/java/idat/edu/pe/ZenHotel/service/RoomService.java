package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.dto.RoomDto;
import idat.edu.pe.ZenHotel.model.RoomModel;
import idat.edu.pe.ZenHotel.model.RoomStatusModel;
import idat.edu.pe.ZenHotel.model.RoomTypeModel;
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

    public void guardarDesdeDTO(RoomDto dto) {
        RoomModel room = new RoomModel();
        room.setRoomnum(dto.getRoomnum());
        room.setPrice(dto.getPrice());
        room.setRoomdescription(dto.getRoomdescription());

        RoomTypeModel type = roomTypeRepository.findById(dto.getIdroomtype()).orElse(null);
        RoomStatusModel status = roomStatusRepository.findById(dto.getIdstatus()).orElse(null);

        room.setRoomtype(type);
        room.setRoomstatus(status);

        roomRepository.save(room);
    }
}