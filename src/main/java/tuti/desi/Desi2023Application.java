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
import tuti.desi.entidades.Provincia;
import tuti.desi.servicios.AeronaveServiceImpl;
import tuti.desi.servicios.CiudadServiceImpl;
import tuti.desi.servicios.ProvinciaServiceImpl;

@SpringBootApplication
public class Desi2023Application {

	@Autowired
	private ProvinciaServiceImpl provinciaServiceImpl;
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
			// Cargamos provincias por defecto al iniciar la aplicación
			List<String> nombresProvincias = valoresPreseteados.nombresProvincias;

			for (String nombreProvincia : nombresProvincias) {
				if (provinciaServiceImpl.findByNombre(nombreProvincia) == null) {
					provinciaServiceImpl.save(new Provincia(nombreProvincia));
				}
			}
			List<Provincia> provincias = provinciaServiceImpl.getAll();

			//Cargamos nonbres de ciudades de Santa Fe
			List<String> nombresCiudadesSantaFe = valoresPreseteados.nombresCiudadesSantaFe;
			for (String nombreCiudadSantaFe : nombresCiudadesSantaFe) {
				if (ciudadServiceImpl.findByNombreAndProvinciaId(nombreCiudadSantaFe,
						provincias.get(0).getId()) == null) {
					ciudadServiceImpl.save(new Ciudad(nombreCiudadSantaFe, provincias.get(0)));
				}
			}

			//Cargamos nonbres de ciudades de Buenos Aires
			List<String> nombresciudadesBsAs = valoresPreseteados.nombresCiudadesBuenosAires;
			for (String nombreCiudadBsAs : nombresciudadesBsAs) {
				if (ciudadServiceImpl.findByNombreAndProvinciaId(nombreCiudadBsAs, provincias.get(2).getId()) == null) {
					ciudadServiceImpl.save(new Ciudad(nombreCiudadBsAs, provincias.get(2)));
				}
			}

			//Cargamos nonbres de ciudades de Entre Ríos
			List<String> nombresCiudadesEntreRios = valoresPreseteados.nombreCiudadesEntreRios;
			for (String nombreCiudadEntreRios : nombresCiudadesEntreRios) {
				if (ciudadServiceImpl.findByNombreAndProvinciaId(nombreCiudadEntreRios,
						provincias.get(2).getId()) == null) {
					ciudadServiceImpl.save(new Ciudad(nombreCiudadEntreRios, provincias.get(2)));
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
