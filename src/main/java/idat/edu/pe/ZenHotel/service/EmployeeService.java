package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.dto.EmployeeDto;
import idat.edu.pe.ZenHotel.model.EmployeeModel;
import idat.edu.pe.ZenHotel.model.RoleModel;
import idat.edu.pe.ZenHotel.repository.EmployeeRepository;
import idat.edu.pe.ZenHotel.repository.RoleRepository;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final RoleRepository roleRepository;

    public EmployeeService(EmployeeRepository employeeRepository, RoleRepository roleRepository) {
        this.employeeRepository = employeeRepository;
        this.roleRepository = roleRepository;
    }

    public List<EmployeeModel> getEmployees(){
        return employeeRepository.findAll();
    }

    public EmployeeModel getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public void saveEmployee (EmployeeModel employeeModel){
        employeeRepository.save(employeeModel);
    }

    public void saveEmployeeDto(EmployeeDto employeeDto) {
        if (employeeDto.getIdemployee() != null) {
            //Es una actualización
            employeeRepository.updateParcialEmployee(
                    employeeDto.getEmployeecode(),
                    employeeDto.getFatherlastname(),
                    employeeDto.getMotherlastname(),
                    employeeDto.getFirstname(),
                    employeeDto.getMiddlename(),
                    employeeDto.getDni(),
                    employeeDto.getPhone(),
                    employeeDto.getEmail(),
                    employeeDto.getIdrole(),
                    employeeDto.getIdemployee()
            );
        } else {
            //Es un registro nuevo
            EmployeeModel employee = new EmployeeModel();
            employee.setEmployeecode(employeeDto.getEmployeecode());
            employee.setFatherlastname(employeeDto.getFatherlastname());
            employee.setMotherlastname(employeeDto.getMotherlastname());
            employee.setFirstname(employeeDto.getFirstname());
            employee.setMiddlename(employeeDto.getMiddlename());
            employee.setDni(employeeDto.getDni());
            employee.setPhone(employeeDto.getPhone());
            employee.setEmail(employeeDto.getEmail());
            RoleModel role = roleRepository.findById(employeeDto.getIdrole()).orElse(null);
            employee.setRole(role);
            employeeRepository.save(employee);
        }
    }
    public EmployeeDto getEmployeeDtoById(int id) {
        EmployeeModel employeeModel = getEmployeeById(id);

        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setIdemployee(employeeModel.getIdemployee());
        employeeDto.setEmployeecode(employeeModel.getEmployeecode());
        employeeDto.setFatherlastname(employeeModel.getFatherlastname());
        employeeDto.setMotherlastname(employeeModel.getMotherlastname());
        employeeDto.setFirstname(employeeModel.getFirstname());
        employeeDto.setMiddlename(employeeModel.getMiddlename());
        employeeDto.setDni(employeeModel.getDni());
        employeeDto.setPhone(employeeModel.getPhone());
        employeeDto.setEmail(employeeModel.getEmail());
        employeeDto.setIdrole(employeeModel.getRole().getIdrole());
        return employeeDto;
    }

}