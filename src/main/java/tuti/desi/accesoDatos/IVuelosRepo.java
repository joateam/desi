package tuti.desi.accesoDatos;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import tuti.desi.entidades.Vuelo;

public interface IVuelosRepo extends JpaRepository<Vuelo, Long>{

	boolean existsByFechaPartidaAndAvionId(LocalDate fechaPartida, Long avionId);
}
