package tuti.desi.presentacion;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/programarvuelo")
public class ProgramarVueloController {

    @GetMapping
    public String mostrarProgramarVuelo(Model model) {
        // Puedes agregar lógica adicional aquí si es necesario
        return "programarvuelo";
    }
}
