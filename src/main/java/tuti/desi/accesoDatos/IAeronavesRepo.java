package tuti.desi.accesoDatos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tuti.desi.entidades.Aeronave;


@Repository
public interface IAeronavesRepo extends JpaRepository<Aeronave, Long>{

	Aeronave findByNombre(String nombre);
	
}
