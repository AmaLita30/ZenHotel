package idat.edu.pe.ZenHotel.repository;

import idat.edu.pe.ZenHotel.model.PaymentStatusModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentStatusRepository extends JpaRepository<PaymentStatusModel, Integer> {
}
