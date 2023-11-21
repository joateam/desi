package tuti.desi.entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Vuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String numeroVuelo;

	@ManyToOne
	@JoinColumn(name = "ciudad_origen_id")
	private Ciudad origen;

	@ManyToOne
	@JoinColumn(name = "ciudad_destino_id")
	private Ciudad destino;

	private List<String> tipoVueloPosibilidades = new ArrayList<>(Arrays.asList("nacional", "internacional"));

	private String tipoVuelo;
	private float precioPasaje;

	private LocalDate fechaPartida;
	private LocalTime horaPartida;

	@ManyToOne
    @JoinColumn(name = "aeronave_id")
    private Aeronave avion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroVuelo() {
		return numeroVuelo;
	}

	public void setNumeroVuelo(String numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	public Ciudad getOrigen() {
		return origen;
	}

	public void setOrigen(Ciudad origen) {
		this.origen = origen;
	}

	public Ciudad getDestino() {
		return destino;
	}

	public void setDestino(Ciudad destino) {
		this.destino = destino;
	}

	public List<String> getTipoVueloPosibilidades() {
		return tipoVueloPosibilidades;
	}

	public String getTipoVuelo() {
		return tipoVuelo;
	}

	public void setTipoVuelo(String tipoVuelo) {
		this.tipoVuelo = tipoVuelo;
	}

	public float getPrecioPasaje() {
		return precioPasaje;
	}

	public void setPrecioPasaje(float precioPasaje) {
		this.precioPasaje = precioPasaje;
	}

	public LocalDate getFechaPartida() {
		return fechaPartida;
	}

	public void setFechaPartida(LocalDate fechaPartida) {
		this.fechaPartida = fechaPartida;
	}

	public LocalTime getHoraPartida() {
		return horaPartida;
	}

	public void setHoraPartida(LocalTime horaPartida) {
		this.horaPartida = horaPartida;
	}

	public Aeronave getAvion() {
		return avion;
	}

	public void setAvion(Aeronave avion) {
		this.avion = avion;
	}

}
