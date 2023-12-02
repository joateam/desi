package tuti.desi.presentacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tuti.desi.entidades.Aeronave;
import tuti.desi.entidades.Ciudad;
import tuti.desi.entidades.Vuelo;
import tuti.desi.servicios.AeronaveService;
import tuti.desi.servicios.CiudadService;
import tuti.desi.servicios.VueloService;
import tuti.desi.servicios.VueloServiceImpl.VueloDuplicadoException;

@Controller
@RequestMapping("/programarvuelo")
public class ProgramarVueloController {

	@Autowired
	private CiudadService servicioCiudad;
	@Autowired
	private AeronaveService servicioAeronave;
	@Autowired
	private VueloService servicioVuelo;

    @GetMapping
    public String mostrarProgramarVuelo(Model model) {
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

    @PostMapping
    public String guardarVuelo(@ModelAttribute VueloForm vueloForm, Model model) {

    	String msj = "";
    	boolean errores = false;

        System.out.println(vueloForm.toString());

    	Ciudad origen = servicioCiudad.getById(vueloForm.getOrigenId());
        Ciudad destino = servicioCiudad.getById(vueloForm.getDestinoId());
        Aeronave avion = servicioAeronave.getById(vueloForm.getAvionId());

        Vuelo vuelo = new Vuelo();
        vuelo.setNumeroVuelo(vueloForm.getNumeroVuelo());
        vuelo.setOrigen(origen);
        vuelo.setDestino(destino);
        vuelo.setTipoVuelo(vueloForm.getTipoVuelo());
        vuelo.setPrecioPasaje(Float.parseFloat(vueloForm.getPrecioPasaje()));
        vuelo.setFechaPartida(vueloForm.getFechaPartida());
        vuelo.setHoraPartida(vueloForm.getHoraPartida());
        vuelo.setAvion(avion);
        vuelo.setEstado("Normal");


        if (servicioVuelo.existsFlightOnDateAndAircraft(vueloForm.getFechaPartida(), vueloForm.getAvionId())) {
            msj = msj+"Ya existe un vuelo para esta fecha y avión.";
        }

        if(errores) {
        	 model.addAttribute("alert", "danger");

        }else {
        	try {
        		servicioVuelo.save(vuelo);
            	model.addAttribute("alert", "info");
            	msj = "El vuelo fue programado exitosamente";
			} catch (VueloDuplicadoException e) {
				model.addAttribute("alert", "danger");
            	msj = msj+". "+e.getMessage();
			}
        }
        model.addAttribute("msj", msj);

        return "programarvuelo";
    }


}
