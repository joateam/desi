package tuti.desi.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tuti.desi.accesoDatos.IAeronavesRepo;
import tuti.desi.entidades.Aeronave;
import tuti.desi.excepciones.Excepcion;

@Service
public class AeronaveServiceImpl implements AeronaveService {

	@Autowired
	private IAeronavesRepo repo;
	@Override
	public List<Aeronave> getAll() {
		return repo.findAll();
	}

	@Override
	public Aeronave getById(Long idAeronave) {
		return repo.findById(idAeronave).get();
	}

	@Override
	public Aeronave findByNombre(String name) {
		return repo.findByNombre(name);
	}

	@Override
    @Transactional
	public void save(Aeronave a) throws Excepcion {
		repo.save(a);
	}

}
