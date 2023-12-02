package tuti.desi.presentacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import tuti.desi.entidades.Ciudad;
import tuti.desi.entidades.Vuelo;
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

	@PostMapping("/filtrar")
    public ResponseEntity<Object>  mostrarListarVuelos(@RequestBody FiltroVuelos filtroVuelos) {
		List<Vuelo> resultado;

		if(	filtroVuelos.getCiudadOrigenId()==null && filtroVuelos.getCiudadDestinoId()== null && filtroVuelos.getTipoVuelo().equals("")){

			resultado = this.vueloservice.ListarVuelosFecha(filtroVuelos.getFechaPartida());

		}else {
			resultado = this.vueloservice.ListarVuelos(
				filtroVuelos.getFechaPartida(),
				filtroVuelos.getCiudadOrigenId(),
				filtroVuelos.getCiudadDestinoId(),
				filtroVuelos.getTipoVuelo());
		}

		return ResponseEntity.ok().body(resultado);


    }


	@GetMapping
    public String mostrarFormBusqueda() {



		return "listarvuelos";
    }
}
