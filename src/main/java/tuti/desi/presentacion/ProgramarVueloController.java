package tuti.desi.presentacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import tuti.desi.entidades.Aeronave;
import tuti.desi.entidades.Ciudad;
import tuti.desi.entidades.Provincia;
import tuti.desi.servicios.AeronaveService;
import tuti.desi.servicios.CiudadService;
import tuti.desi.servicios.CiudadServiceImpl;

@Controller
@RequestMapping("/programarvuelo")
public class ProgramarVueloController {
	
	@Autowired
	private CiudadService servicioCiudad;
	@Autowired
	private AeronaveService servicioAeronave;

    @GetMapping
    public String mostrarProgramarVuelo(Model model) {
        // Puedes agregar lógica adicional aquí si es necesario
        return "programarvuelo";
    }
    
    @ModelAttribute("allCiudades")
    public List<Ciudad> getAllProvincias() {
        return this.servicioCiudad.getAll();
    }
    
    @ModelAttribute("allAeronaves")
    public List<Aeronave> getAllAeronaves(){
    	return this.servicioAeronave.getAll();
    }
    
}
