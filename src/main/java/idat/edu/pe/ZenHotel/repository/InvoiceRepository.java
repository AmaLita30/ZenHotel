package idat.edu.pe.ZenHotel.repository;

import idat.edu.pe.ZenHotel.model.InvoiceModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<InvoiceModel, Integer> {
}
