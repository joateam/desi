/**
 * @author DESI
 *
 */
package tuti.desi.servicios;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import tuti.desi.accesoDatos.IProvinciaRepo;
import tuti.desi.entidades.Provincia;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {
//	Logger LOG = LoggerFactory.getLogger(CiudadService.class);
//	
	@Autowired
	IProvinciaRepo repo;

	@Override
	public List<Provincia> getAll() {
		return repo.findAll();
	}


	@Override
	public Provincia getById(Long idCiudad) {
		return repo.findById(idCiudad).get();
	}
	
	@Override
	public Provincia findByNombre(String name) {
		return repo.findByNombre(name);
	}
	
	@Override
    public void save(Provincia provincia) {
        repo.save(provincia);
    }

}
