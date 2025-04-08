package idat.edu.pe.ZenHotel.service;

import idat.edu.pe.ZenHotel.model.EmployeeModel;
import idat.edu.pe.ZenHotel.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
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
}