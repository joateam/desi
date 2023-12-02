package tuti.desi.adicionales;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tuti.desi.entidades.Aeronave;
import tuti.desi.entidades.Ciudad;
import tuti.desi.entidades.Vuelo;
import tuti.desi.servicios.VueloServiceImpl;

//Agregamos component para que pueda ser tomado por @Bean
@Component
public class ValoresPreseteados {
	@Autowired
	private VueloServiceImpl vueloServiceImpl;

	public List<String> nombresProvincias = List.of("Santa Fe", "Buenos Aires", "Entre Ríos");
	public List<String> nombresCiudadesSantaFe = List.of(
			"Santo Tomé", "Rosario", "Santa Fe", "Reconquista", "Avellaneda", "Venado Tuerto", "Goya", "Esperanza", "Rafaela", "Villa Constitución", "San Lorenzo", "Granadero Baigorria", "Capitán Bermúdez", "Firmat", "Casilda", "Cañada de Gómez", "Funes", "San Justo", "Helvecia", "Arroyo Seco", "Villa Gobernador Gálvez", "Villa Ocampo", "Santa Isabel", "Coronda", "San Cristóbal", "Villa Cañás", "Las Toscas", "Rosario del Tala", "Sunchales", "Sastre", "Tostado", "San Genaro", "El Trébol", "San Javier", "Vera", "Arocena", "San Jorge", "Esperanza", "San Carlos Centro", "Roldán", "Ceres", "Rufino", "Gálvez", "San Vicente", "Fray Luis Beltrán", "Carcarña", "Helvecia", "Soldini", "Sauce Viejo", "Ángel Gallardo", "Empalme Villa Constitución", "San Guillermo", "San Jorge", "San Javier", "Totoras", "Malabrigo", "Santa Clara de Saguier", "San Jerónimo Norte", "Coronel Arnold", "Firmat", "Recreo", "Alvear", "San Carlos Sud", "Las Parejas", "San José del Rincón", "Romang", "Elortondo", "Teodelina", "Villa Trinidad", "Vila", "Ibarlucea", "San Martín de las Escobas", "Carmen del Sauce", "San Javier y Yacanto", "San Martín de las Escobas", "Esperanza", "Los Molinos", "Cayastá", "Pilar", "Rosario de la Frontera", "Alvarez", "Cayastá", "Ricardone", "Ibarlucea", "General Lagos", "Desvio Arijón", "General Lagos", "Álvarez", "Arequito", "Sa Pereira", "Rosario del Tala", "Empalme Villa Constitución", "Coronel Arnold", "Santa Isabel", "La Pelada", "Ricardone", "Rosario de la Frontera", "San Carlos Sud", "Arroyo Ceibal", "Cañada del Ucle", "Campo Quijano", "Pujato Norte", "Colastiné Norte", "Campo Quijano", "Colastiné Norte", "Villa Cañás", "Monte Vera", "Malabrigo", "Rafaela", "Rosario del Tala", "Aldea Santa María", "Santa Fe", "Rosario", "San Javier y Yacanto", "Desvío Arijón", "Santa Clara de Saguier", "Esperanza", "Santa Clara de Saguier", "Malabrigo", "Pilar", "Sauce Viejo", "Recreo", "Empalme San Carlos", "Carmen del Sauce", "Esperanza", "Santo Domingo", "Romang", "Álvarez", "Colonia Teresa", "La Vanguardia", "Vila", "Capitán Bermúdez", "La Pelada", "San Vicente", "Romang", "Sastre", "Arroyo Aguiar", "Teodelina", "Las Rosas", "Santa Isabel", "Pujato Norte", "Pilar", "Piamonte", "San Martín de las Escobas", "San José del Rincón", "Campo Quijano", "Pueblo Andino", "Rosario de la Frontera", "Rosario de la Frontera", "Empalme San Carlos", "Colonia Teresa", "Rosario", "General Lagos", "Santo Tomé", "Santa Clara de Saguier", "Monte Vera", "Sunchales", "San Justo", "Cayastá", "Santa Clara de Saguier", "Santo Tomé", "San Javier y Yacanto", "Monte Vera", "Empalme San Carlos", "Villa Cañás", "San Javier y Yacanto", "San Carlos Sud", "Rafaela", "Coronda", "Santa Isabel", "Santa Clara de Saguier", "Pilar", "Coronda", "San Cristóbal", "Las Rosas", "Santa Clara de Saguier", "Carmen del Sauce", "Sunchales", "Funes", "Arroyo Aguiar", "Santo Domingo", "Funes", "Carmen del Sauce", "Cayastá", "Pueblo Andino", "Coronel Arnold", "Recreo", "Santo Domingo", "San Genaro", "Arocena", "Arroyo Seco", "Helvecia", "Rafaela", "Santa Isabel", "Santa Clara de Saguier", "Empalme Villa Constitución", "Santa Isabel"
			);

	public List <String> nombreCiudadesEntreRios = List.of(
			"Paraná", "Concordia", "Gualeguaychú", "Concepción del Uruguay", "Colón", "Villaguay", "Gualeguay", "Victoria", "Diamante", "Federación", "La Paz", "San José", "Crespo", "Chajarí", "Santa Elena", "La Criolla", "San Salvador", "Gualeguaychú", "Gualeguay", "Victoria", "Paraná", "Concepción del Uruguay", "Colón", "Diamante", "La Paz", "Federación", "Chajarí", "San José de Feliciano", "Victoria", "Rosario del Tala", "Villaguay", "Gualeguay", "San Salvador", "La Paz", "Concordia", "Gualeguaychú", "Concepción del Uruguay", "Colón", "Villaguay", "Gualeguay", "Victoria", "Diamante", "Federación", "La Paz", "San José", "Crespo", "Chajarí", "Santa Elena", "La Criolla", "San Salvador", "Gualeguaychú", "Gualeguay", "Victoria", "Paraná", "Concepción del Uruguay", "Colón", "Diamante", "La Paz", "Federación", "Chajarí", "San José de Feliciano", "Victoria", "Rosario del Tala", "Villaguay", "Gualeguay", "San Salvador", "La Paz", "Concordia", "Gualeguaychú", "Concepción del Uruguay", "Colón", "Villaguay", "Gualeguay", "Victoria", "Diamante", "Federación", "La Paz", "San José", "Crespo", "Chajarí", "Santa Elena", "La Criolla", "San Salvador", "Gualeguaychú", "Gualeguay", "Victoria", "Paraná", "Concepción del Uruguay", "Colón", "Diamante", "La Paz", "Federación", "Chajarí", "San José de Feliciano", "Victoria", "Rosario del Tala", "Villaguay", "Gualeguay", "San Salvador", "La Paz", "Concordia", "Gualeguaychú", "Concepción del Uruguay", "Colón", "Villaguay", "Gualeguay", "Victoria", "Diamante", "Federación", "La Paz", "San José", "Crespo", "Chajarí"
			);

	public List <String> nombresCiudadesBuenosAires = List.of(
			"Buenos Aires", "La Plata", "Mar del Plata", "Bahía Blanca", "Quilmes", "Lomas de Zamora", "Avellaneda", "Merlo", "Moreno", "Florencio Varela", "San Isidro", "Tigre", "San Miguel", "Pilar", "Lanús", "Berazategui", "José C. Paz", "Ituzaingó", "Malvinas Argentinas", "San Fernando", "Esteban Echeverría", "Ezeiza", "Almirante Brown", "Vicente López", "Quilmes", "Berisso", "Florencio Varela", "San Nicolás", "Zárate", "Pergamino", "Junín", "Chivilcoy", "Mercedes", "San Pedro", "Dolores", "Tandil", "Azul", "Olavarría", "Necochea", "Mar de Ajó", "Villa Gesell", "Pinamar", "San Clemente del Tuyú", "Las Toninas", "Santa Teresita", "La Costa", "Monte Hermoso", "Sierra de la Ventana", "Carhué", "Tres Arroyos", "Miramar", "Balcarce", "Villa La Angostura", "San Antonio de Areco", "Chascomús", "Luján", "Tres de Febrero", "Malvinas Argentinas", "Hurlingham", "Morón", "Tigre", "La Matanza", "Berazategui", "Florencio Varela", "Quilmes", "Lanús", "Avellaneda", "Almirante Brown", "Esteban Echeverría", "Ezeiza", "Presidente Perón", "Cañuelas", "San Vicente", "La Plata", "Ensenada", "Berisso", "Magdalena", "La Plata", "Quilmes", "Avellaneda", "Lomas de Zamora", "Berazategui", "Florencio Varela", "Esteban Echeverría", "Ezeiza", "Cañuelas", "La Matanza", "Merlo", "Moreno", "Tres de Febrero", "Morón", "Hurlingham", "Ituzaingó", "Merlo", "José C. Paz", "San Miguel", "Malvinas Argentinas"
			);

	public List<Aeronave> aeronaves = List.of(
            new Aeronave("Boeing 737", 22, 10),
            new Aeronave("Airbus A320", 20, 8),
            new Aeronave("Boeing 777", 30, 12),
            new Aeronave("Airbus A330", 28, 10),
            new Aeronave("Boeing 787 Dreamliner", 32, 9),
            new Aeronave("Airbus A350 XWB", 26, 8),
            new Aeronave("Boeing 747", 35, 10),
            new Aeronave("Embraer E190", 18, 6),
            new Aeronave("Bombardier CRJ900", 16, 5),
            new Aeronave("McDonnell Douglas MD-11", 40, 11)
    );

	/*
		this.numeroVuelo = numeroVuelo;
		this.origen = origen;
		this.destino = destino;
		this.tipoVuelo = tipoVuelo;
		this.precioPasaje = precioPasaje;
		this.fechaPartida = fechaPartida;
		this.horaPartida = horaPartida;
		this.estado = estado;
		this.avion = avion;*/


	// CARGAMOS LOS VUELOS
	public  void  cargarVuelos(List<Aeronave> listaAeronaves, List<Ciudad> listaCiudades) {


		/*
		List<Ciudad> listaCiudades = new ArrayList<Ciudad>();

		for (String nombreCiudadSantaFe : nombresCiudadesSantaFe) {
			listaCiudades.add(new Ciudad(nombreCiudadSantaFe));
		}*/








		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		Random random = new Random();
		for (int i = 0; i < 10; i++) {


			int hora = random.nextInt(24);
			int min = random.nextInt(60);
			LocalTime horaVuelo = LocalTime.of(hora, min);


			LocalDate fecha = LocalDate.parse("2023-12-"+(i+10),formatter);

			Vuelo vuelo = new Vuelo(String.valueOf(i+1),listaCiudades.get(i),listaCiudades.get(i+1),"nacional",((i+1)*10000),fecha,horaVuelo,"Normal",listaAeronaves.get(i));
			vueloServiceImpl.save(vuelo);
		}

	}

}
