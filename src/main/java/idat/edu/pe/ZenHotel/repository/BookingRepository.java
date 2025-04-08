package idat.edu.pe.ZenHotel.repository;

import idat.edu.pe.ZenHotel.model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingModel, Integer> { }