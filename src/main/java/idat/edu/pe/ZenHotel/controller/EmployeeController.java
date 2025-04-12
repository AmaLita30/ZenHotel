package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.dto.EmployeeDto;
import idat.edu.pe.ZenHotel.model.EmployeeModel;
import idat.edu.pe.ZenHotel.service.EmployeeService;
import idat.edu.pe.ZenHotel.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;
    private final RoleService roleService;

    public EmployeeController(EmployeeService employeeService, RoleService roleService) {
        this.employeeService = employeeService;
        this.roleService = roleService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("employees", employeeService.getEmployees());
        return "employee/index";
    }

//    @GetMapping("/create")
//    public String create(Model model) {
//        model.addAttribute("employee", new EmployeeModel());
//        return ("employee/create");
//    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        model.addAttribute("employeeDto", employeeService.getEmployeeDtoById(id));
        model.addAttribute("roles", roleService.getRoles());
        return "employee/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("employee") EmployeeDto employeeDto) {
        employeeService.saveEmployeeDto(employeeDto);
        return "redirect:/employee";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("employeeDto", new EmployeeDto());
        model.addAttribute("roles", roleService.getRoles());
        return "employee/create";
    }

}
