package tuti.desi.servicios;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import tuti.desi.accesoDatos.IVuelosRepo;
import tuti.desi.entidades.Ciudad;
import tuti.desi.entidades.Vuelo;

@Service
public class VueloServiceImpl implements VueloService {

    @Autowired
    private IVuelosRepo repo;

    @Override
    public List<Vuelo> getAll() {
        return repo.findAll();
    }

    @Override
    public Vuelo getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void save(Vuelo vuelo) {
    	 try {
             repo.save(vuelo);
         } catch (DataIntegrityViolationException e) {
             throw new VueloDuplicadoException("El número de vuelo ya existe");
         }
    }
    
    public class VueloDuplicadoException extends RuntimeException {
        public VueloDuplicadoException(String message) {
            super(message);
        }
    }


	 @Override
	    public boolean existsFlightOnDateAndAircraft(LocalDate fechaPartida, Long avionId) {
	             return repo.existsByFechaPartidaAndAvionId(fechaPartida, avionId);
	    }

	@Override
	public List<Vuelo> ListarVuelos(LocalDate fecha, Long origenId, Long destinoId, String tipoVuelo) {
		return repo.findByDateAndCitiesAndType(fecha,origenId,destinoId,tipoVuelo);
	}
	
	@Override
	public List<Vuelo> ListarVuelosFecha(LocalDate fecha){
		return repo.findByFechaPartidaOrderByHoraPartida(fecha);
	}
	
	
}
