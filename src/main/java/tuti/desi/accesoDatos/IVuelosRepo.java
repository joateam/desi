package tuti.desi.accesoDatos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tuti.desi.entidades.Vuelo;

public interface IVuelosRepo extends JpaRepository<Vuelo, Long>{

	boolean existsByFechaPartidaAndAvionId(LocalDate fechaPartida, Long avionId);

	@Query("SELECT v FROM Vuelo v WHERE v.fechaPartida = :fechaPartida " +
            "AND (:origenId IS NULL OR v.origen = :origenId) " +
            "AND (:destinoId IS NULL OR v.destino = :destinoId) " +
            "AND (:tipoVuelo IS NULL OR v.tipoVuelo = :tipoVuelo) ORDER BY v.horaPartida ASC")
    List<Vuelo> findByDateAndCitiesAndType(
            @Param("fechaPartida") LocalDate fechaPartida,
            @Param("origenId") Long origenId,
            @Param("destinoId") Long destinoId,
            @Param("tipoVuelo") String tipoVuelo
    );

	List<Vuelo> findByFechaPartidaOrderByHoraPartida(LocalDate fecha);
}
