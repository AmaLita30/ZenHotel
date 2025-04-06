package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.model.EmployeeModel;
import idat.edu.pe.ZenHotel.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("employees", employeeService.getEmployees());
        return "employee/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("employee", new EmployeeModel());
        return ("employee/create");
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        model.addAttribute("employee", employeeService.getEmployeeById(id));
        return "employee/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("employee") EmployeeModel employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employee";
    }
}
