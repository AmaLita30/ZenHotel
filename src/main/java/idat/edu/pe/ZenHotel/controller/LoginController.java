package idat.edu.pe.ZenHotel.controller;

import idat.edu.pe.ZenHotel.model.LoginModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String formularioLogin(Model model) {
        model.addAttribute("loginmodel", new LoginModel());
        return "login"; // Nombre de la vista HTML del formulario de login
    }

    @PostMapping("/acceso")
    public String procesarLogin(@ModelAttribute("loginmodel") LoginModel login, Model model) {
        String usuarioValido = "admin"; // Usuario válido (puedes cambiarlo)
        String claveValida = "1234";    // Contraseña válida

        if (login.getUser().equals(usuarioValido) && login.getPassword().equals(claveValida)) {
            model.addAttribute("mensaje", "¡Inicio de sesión exitoso!");
            return "Bienvenido(a)"; // Vista a la que redirigirás si el login es correcto
        } else {
            model.addAttribute("Error!", "Usuario o contraseña incorrectos");
            return "login"; // Si falla, vuelve al formulario de login
        }
    }
}