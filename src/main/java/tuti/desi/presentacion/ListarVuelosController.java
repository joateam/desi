package tuti.desi.presentacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import tuti.desi.entidades.Ciudad;
import tuti.desi.servicios.AeronaveService;
import tuti.desi.servicios.CiudadService;
import tuti.desi.servicios.VueloService;

@Controller
@RequestMapping("/listarvuelos")
public class ListarVuelosController {
	
	@Autowired
	private VueloService vueloservice;
	
	@Autowired
	private CiudadService ciudadservice;
	
	@Autowired
	private AeronaveService aeronaveservice;
	
	@ModelAttribute("allCiudades")
    public List<Ciudad> getAllCiudades() {
        return this.ciudadservice.getAll();
    }
	
	@GetMapping
    public String mostrarListarVuelos(Model model) {
        return "listarvuelos";
    }
}
