package idat.edu.pe.ZenHotel.repository;

import idat.edu.pe.ZenHotel.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerModel, Integer > {}