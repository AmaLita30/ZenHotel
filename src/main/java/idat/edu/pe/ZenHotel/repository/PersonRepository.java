package idat.edu.pe.ZenHotel.repository;

import idat.edu.pe.ZenHotel.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonModel, Integer> {

}
