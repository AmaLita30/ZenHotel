package idat.edu.pe.ZenHotel.repository;

import idat.edu.pe.ZenHotel.model.PaymentMethodModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethodModel, Integer> {}