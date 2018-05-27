package Objects;

import java.util.ArrayList;

public class Tramite {
	
	private int NumeroTramite;
	private String Descripcion;
	private ArrayList<Tarea> Tareas;
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
	public ArrayList<Tarea> getTareas() {
		return Tareas;
	}
	public void setTareas(ArrayList<Tarea> tareas) {
		Tareas = tareas;
	}
	public void setTarea(Tarea tarea) {
		if(Tareas == null )
			Tareas = new ArrayList<Tarea>();
		
		Tareas.add(tarea);
		
	}
	public Usuario getSolicitante() {
		return Solicitante;
	}
	public void setSolicitante(Usuario solicitante) {
		Solicitante = solicitante;
	}	
}
