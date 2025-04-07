package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.model.ExtraServiceModel;
import idat.edu.pe.ZenHotel.service.ExtraService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/extraservice")
public class ExtraServiceController {
    private final ExtraService extraService;

    public ExtraServiceController(ExtraService extraService) {
        this.extraService = extraService;
    }

    @GetMapping
    public String extraService(Model model){
        model.addAttribute("extraservices", extraService.getExtraServices());
        return "extraservice/index";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("extraservice", new ExtraServiceModel());
        return "extraservice/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id){
        model.addAttribute("extraservice", extraService.getExtraServiceById(id));
        return "extraservice/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("extraservice") ExtraServiceModel extraservice){
        extraService.saveExtraService(extraservice);
        return "redirect:/extraservice";
    }
}