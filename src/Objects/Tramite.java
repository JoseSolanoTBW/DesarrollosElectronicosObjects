package Objects;

import java.util.List;

public class Tramite {
	
	private int NumeroTramite;
	private String Descripcion;
	private List<Tarea> Tareas;
	private Usuario Solicitante;
	
	public int getNumeroTramite() {
		return NumeroTramite;
	}
	public void setNumeroTramite(int numeroTramite) {
		NumeroTramite = numeroTramite;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public List<Tarea> getTareas() {
		return Tareas;
	}
	public void setTareas(List<Tarea> tareas) {
		Tareas = tareas;
	}
	public Usuario getSolicitante() {
		return Solicitante;
	}
	public void setSolicitante(Usuario solicitante) {
		Solicitante = solicitante;
	}	
}
