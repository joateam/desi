package tuti.desi.servicios;

import java.time.LocalDate;
import java.util.List;

import tuti.desi.entidades.Aeronave;
import tuti.desi.excepciones.Excepcion;

public interface AeronaveService {

	List<Aeronave> getAll();
	
	Aeronave getById(Long idAeronave);
	
	Aeronave findByNombre(String name);
	
	void save(Aeronave a) throws Excepcion;
	
}
