package idat.edu.pe.ZenHotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/employee")
    public String employee(){
        return "employee";
    }

    @GetMapping("/employeeForm")
    public String employeeForm() {
        return ("employeeForm");
    }
}
