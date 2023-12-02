package tuti.desi.servicios;

import java.time.LocalDate;
import java.util.List;

import tuti.desi.entidades.Ciudad;
import tuti.desi.entidades.Vuelo;

public interface VueloService {
    List<Vuelo> getAll();
    List<Vuelo> ListarVuelos(LocalDate fecha,Long origenid,Long destinoid,String tipoVuelo);
    List<Vuelo> ListarVuelosFecha(LocalDate fecha);
    Vuelo getById(Long id);
    void save(Vuelo vuelo);
    
    
    public boolean existsFlightOnDateAndAircraft(LocalDate fechaPartida, Long avionId);
	
}
