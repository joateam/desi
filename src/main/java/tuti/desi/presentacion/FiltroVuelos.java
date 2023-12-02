package tuti.desi.presentacion;

import java.time.LocalDate;

public class FiltroVuelos {
	private LocalDate fechaPartida;
	private Long ciudadOrigenId;
	private Long ciudadDestinoId;
	private String tipoVuelo;
	
	public LocalDate getFechaPartida() {
		return fechaPartida;
	}
	public void setFechaPartida(LocalDate fechaPartida) {
		this.fechaPartida = fechaPartida;
	}
	public Long getCiudadOrigenId() {
		return ciudadOrigenId;
	}
	public void setCiudadOrigenId(Long ciudadOrigenId) {
		this.ciudadOrigenId = ciudadOrigenId;
	}
	public String getTipoVuelo() {
		return tipoVuelo;
	}
	public void setTipoVuelo(String tipoVuelo) {
		this.tipoVuelo = tipoVuelo;
	}
	public Long getCiudadDestinoId() {
		return ciudadDestinoId;
	}
	public void setCiudadDestinoId(Long ciudadDestinoId) {
		this.ciudadDestinoId = ciudadDestinoId;
	}
	
	
}
