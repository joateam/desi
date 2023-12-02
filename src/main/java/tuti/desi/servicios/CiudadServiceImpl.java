/**
 * @author kuttel
 *
 */
package tuti.desi.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuti.desi.accesoDatos.ICiudadRepo;
import tuti.desi.entidades.Ciudad;
import tuti.desi.excepciones.Excepcion;

@Service
public class CiudadServiceImpl implements CiudadService {
//	Logger LOG = LoggerFactory.getLogger(CiudadService.class);
//
	@Autowired
	ICiudadRepo repo;

	@Override
	public List<Ciudad> getAll() {
		return repo.findAll();
	}



	@Override
	public Ciudad getById(Long idCiudad) {

		return repo.findById(idCiudad).get();
	}

	@Override
	public void deleteByid(Long id) {
		repo.deleteById(id);

	}


	 @Override
	    public Ciudad findByNombre(String nombre) {
		 Optional<Ciudad> optionalCiudad = Optional.ofNullable(repo.findByNombre(nombre));
		 return optionalCiudad.orElseThrow(() -> new CiudadNotFoundException("Ciudad no encontrada con el nombre: " + nombre));
	    }

	@Override
	public void save(Ciudad c) throws Excepcion {
		repo.save(c);
	}

	public class CiudadNotFoundException extends RuntimeException {
	    public CiudadNotFoundException(String mensaje) {
	        super(mensaje);
	    }
	}


}
