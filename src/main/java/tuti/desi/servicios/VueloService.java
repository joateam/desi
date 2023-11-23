package tuti.desi.servicios;

import java.time.LocalDate;
import java.util.List;
import tuti.desi.entidades.Vuelo;

public interface VueloService {
    List<Vuelo> getAll();
    Vuelo getById(Long id);
    void save(Vuelo vuelo);
    
    public boolean existsFlightOnDateAndAircraft(LocalDate fechaPartida, Long avionId);
}
