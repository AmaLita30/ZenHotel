package idat.edu.pe.ZenHotel.repository;

import idat.edu.pe.ZenHotel.model.RoomModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoomRepository extends JpaRepository<RoomModel, Integer> {
    @Query(value = """
            UPDATE room SET
            roomnum = :roomnum:
            price = :price:
            roomdescription = :roomdescription
            idroomtype = :idroomtype
            idstatus = :idstatus
            WHERE idroom = :idroom
            """, nativeQuery = true)
    void actualizarProductoParcial(
            @Param("roomnum") String roomnum,
            @Param("price") Double price,
            @Param("roomdescription") String roomdescription,
            @Param("idroomtype") Integer idroomtype,
            @Param("idstatus") Integer idstatus,
            @Param("idroom") Integer idroom
    );
}