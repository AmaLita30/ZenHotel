package idat.edu.pe.ZenHotel.repository;

import idat.edu.pe.ZenHotel.model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;


public interface BookingRepository extends JpaRepository<BookingModel, Integer> {
    @Query(value = """
            UPDATE booking SET
            idbooking = :book,
            bookingdate = :bookingdate:
            checkindate = :checkindate:
            checkoutdate = :checkoutdate
            idroom = :idroom
            idcustomer = :idcustomer
            WHERE idbooking = :idbooking
            """, nativeQuery = true)
    void updateParcialEmployee(
            @Param("idbooking") Integer idbooking,
            @Param("bookingdate") Date bookingdate,
            @Param("checkindate") Date checkindate,
            @Param("checkoutdate") Date checkoutdate,
            @Param("idroom") Integer idroom,
            @Param("idcustomer") Integer idcustomer
    );
}
