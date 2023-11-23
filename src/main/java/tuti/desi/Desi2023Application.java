package tuti.desi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import tuti.desi.adicionales.ValoresPreseteados;
import tuti.desi.entidades.Aeronave;
import tuti.desi.entidades.Ciudad;
import tuti.desi.servicios.AeronaveServiceImpl;
import tuti.desi.servicios.CiudadServiceImpl;

@SpringBootApplication
public class Desi2023Application {

	@Autowired
	private CiudadServiceImpl ciudadServiceImpl;
	@Autowired
	private ValoresPreseteados valoresPreseteados;
	@Autowired
	private AeronaveServiceImpl aeronaveServicImpl;

	public static void main(String[] args) {
		SpringApplication.run(Desi2023Application.class, args);
	}

	// Metodo para insetar valores por defecto en la base de datos si estos no
	// existen
	@Bean
	public CommandLineRunner initData() {
		return args -> {
	

			//Cargamos nonbres de ciudades de Santa Fe
			List<String> nombresCiudadesSantaFe = valoresPreseteados.nombresCiudadesSantaFe;
			for (String nombreCiudadSantaFe : nombresCiudadesSantaFe) {
				if (ciudadServiceImpl.findByNombre(nombreCiudadSantaFe) == null) {
					ciudadServiceImpl.save(new Ciudad(nombreCiudadSantaFe));
				}
			}

			//Cargamos nonbres de ciudades de Buenos Aires
			List<String> nombresciudadesBsAs = valoresPreseteados.nombresCiudadesBuenosAires;
			
			for (String nombreCiudadBsAs : nombresciudadesBsAs) {
				if (ciudadServiceImpl.findByNombre(nombreCiudadBsAs) == null) {
					ciudadServiceImpl.save(new Ciudad(nombreCiudadBsAs));
				}
			}

			//Cargamos nonbres de ciudades de Entre Ríos
			List<String> nombresCiudadesEntreRios = valoresPreseteados.nombreCiudadesEntreRios;
			for (String nombreCiudadEntreRios : nombresCiudadesEntreRios) {
				if (ciudadServiceImpl.findByNombre(nombreCiudadEntreRios) == null) {
					ciudadServiceImpl.save(new Ciudad(nombreCiudadEntreRios));
				}
			}
			
			//Cargamos nonbres las Aeronaves
			List<Aeronave> aeronaves = valoresPreseteados.aeronaves;
			for (Aeronave aeronave : aeronaves) {
				if (aeronaveServicImpl.findByNombre(aeronave.getNombre()) == null) {
					aeronaveServicImpl.save(aeronave);
				}
			}
			
			
		};
	}

}
