package idat.edu.pe.ZenHotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {


    @GetMapping("/configuration")
    public String configuration(){
        return "configuration";
    }

    @GetMapping("/home")
    public String mostrarGrafico(Model model) {
        List<String> categorias = List.of("Enero", "Febrero", "Marzo");
        List<Integer> valores = List.of(10, 20, 15);

        model.addAttribute("categorias", categorias);
        model.addAttribute("valores", valores);

        return "home";
    }
}
