package Objects;

import java.util.Date;

public class HistorialTramite {
	
	private Tramite TramiteHistorico;
	private Date Fecha;
	private Usuario Responsable;
	
	public Tramite getTramiteHistorico() {
		return TramiteHistorico;
	}
	public void setTramiteHistorico(Tramite tramiteHistorico) {
		TramiteHistorico = tramiteHistorico;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public Usuario getResponsable() {
		return Responsable;
	}
	public void setResponsable(Usuario responsable) {
		Responsable = responsable;
	}
	
	

}
