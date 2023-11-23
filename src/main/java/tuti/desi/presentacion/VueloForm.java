package tuti.desi.presentacion;
import java.time.LocalDate;
import java.time.LocalTime;

public class VueloForm {

    private String numeroVuelo;
    private Long origenId;
    private Long destinoId;
    private String tipoVuelo;
    private String precioPasaje;
    private LocalDate fechaPartida;
    private LocalTime horaPartida;
    private Long avionId;

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Long getOrigenId() {
        return origenId;
    }

    public void setOrigenId(Long origenId) {
        this.origenId = origenId;
    }

    public Long getDestinoId() {
        return destinoId;
    }

    public void setDestinoId(Long destinoId) {
        this.destinoId = destinoId;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public String getPrecioPasaje() {
        return precioPasaje;
    }

    public void setPrecioPasaje(String precioPasaje) {
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

    public Long getAvionId() {
        return avionId;
    }

    public void setAvionId(Long avionId) {
        this.avionId = avionId;
    }

	@Override
	public String toString() {
		return "VueloForm [numeroVuelo=" + numeroVuelo + ", origenId=" + origenId + ", destinoId=" + destinoId
				+ ", tipoVuelo=" + tipoVuelo + ", precioPasaje=" + precioPasaje + ", fechaPartida=" + fechaPartida
				+ ", horaPartida=" + horaPartida + ", avionId=" + avionId + "]";
	}
    
}
