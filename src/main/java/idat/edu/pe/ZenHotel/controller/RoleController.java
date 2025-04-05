package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.model.RoleModel;
import idat.edu.pe.ZenHotel.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/role")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public String index(Model model){
        model.addAttribute("roles", roleService.getRoles());
        return "role/index";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("role", new RoleModel());
        return "role/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id){
        model.addAttribute("role", roleService.getRoleById(id));
        return "role/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("role")RoleModel role){
        roleService.saveRole(role);
        return "redirect:/role";
    }
}