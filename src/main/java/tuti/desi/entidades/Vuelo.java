package tuti.desi.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
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

	@Column(unique = true)
    private String numeroVuelo;

	@ManyToOne
	@JoinColumn(name = "ciudad_origen_id")
	private Ciudad origen;

	@ManyToOne
	@JoinColumn(name = "ciudad_destino_id")
	private Ciudad destino;

	private String tipoVuelo;
	private float precioPasaje;

	private LocalDate fechaPartida;
	private LocalTime horaPartida;

	private String estado;




	@ManyToOne
    @JoinColumn(name = "aeronave_id")
    private Aeronave avion;

	public Vuelo(){}

	public Vuelo( String numeroVuelo, Ciudad origen, Ciudad destino, String tipoVuelo, float precioPasaje,
			LocalDate fechaPartida, LocalTime horaPartida, String estado, Aeronave avion) {
		super();
		this.numeroVuelo = numeroVuelo;
		this.origen = origen;
		this.destino = destino;
		this.tipoVuelo = tipoVuelo;
		this.precioPasaje = precioPasaje;
		this.fechaPartida = fechaPartida;
		this.horaPartida = horaPartida;
		this.estado = estado;
		this.avion = avion;
	}




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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
