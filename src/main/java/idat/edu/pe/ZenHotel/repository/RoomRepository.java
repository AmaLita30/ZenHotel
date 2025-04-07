package idat.edu.pe.ZenHotel.repository;

import idat.edu.pe.ZenHotel.model.RoomModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface RoomRepository extends JpaRepository<RoomModel, Integer> {
    @Modifying
    @Transactional
    @Query(value = """
        UPDATE room
        SET roomnum = :roomnum,
            price = :price,
            roomdescription = :roomdescription,
            idroomtype = :idroomtype,
            idstatus = :idstatus
        WHERE idroom = :idroom
    """, nativeQuery = true)
    void UpdateRoom(
            @Param("roomnum") Integer roomnum,
            @Param("price") Double price,
            @Param("roomdescription") String roomdescription,
            @Param("idroomtype") Integer idroomtype,
            @Param("idstatus") Integer idstatus,
            @Param("idroom") Integer idroom
    );
}