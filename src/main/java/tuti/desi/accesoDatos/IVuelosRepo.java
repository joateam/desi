package tuti.desi.accesoDatos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tuti.desi.entidades.Ciudad;
import tuti.desi.entidades.Vuelo;

public interface IVuelosRepo extends JpaRepository<Vuelo, Long>{

	boolean existsByFechaPartidaAndAvionId(LocalDate fechaPartida, Long avionId);

	List<Vuelo> findByFechaPartidaAndOrigenAndDestinoAndTipoVuelo(LocalDate fecha, Ciudad origen, Ciudad destino, String tipoVuelo);

	List<Vuelo> findByFechaPartida(LocalDate fecha);
}
