package idat.edu.pe.ZenHotel.repository;


import idat.edu.pe.ZenHotel.model.EmployeeModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {
    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = """
        UPDATE employee
        SET employeecode = :employeecode,
            fatherlastname = :fatherlastname,
            motherlastname = :motherlastname,
            firstname = :firstname,
            middlename = :middlename,
            dni = :dni,
            phone = :phone,
            email = :email,
            idrole = :idrole
        WHERE idemployee = :idemployee
    """, nativeQuery = true)
    void updateParcialEmployee(
            @Param("employeecode") String employeecode,
            @Param("fatherlastname") String fatherlastname,
            @Param("motherlastname") String motherlastname,
            @Param("firstname") String firstname,
            @Param("middlename") String middlename,
            @Param("dni") String dni,
            @Param("phone") String phone,
            @Param("email") String email,
            @Param("idrole") Integer idrole,
            @Param("idemployee") Integer idemployee
    );
}
