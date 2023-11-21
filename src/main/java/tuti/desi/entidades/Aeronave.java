package tuti.desi.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aeronave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombre;
    
    private Integer cantFilas, nroAsientosXFila;

    public Aeronave() {
    }

    public Aeronave(String nombre, Integer cantFilas, Integer nroAsientosXFila) {
        super();
        this.nombre = nombre;
        this.cantFilas = cantFilas;
        this.nroAsientosXFila = nroAsientosXFila;
    }

    // Métodos getter y setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantFilas() {
        return cantFilas;
    }

    public void setCantFilas(Integer cantFilas) {
        this.cantFilas = cantFilas;
    }

    public Integer getNroAsientosXFila() {
        return nroAsientosXFila;
    }

    public void setNroAsientosXFila(Integer nroAsientosXFila) {
        this.nroAsientosXFila = nroAsientosXFila;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Integer capacidadVuelo() {
		return (this.cantFilas * this.nroAsientosXFila);
	}
}
