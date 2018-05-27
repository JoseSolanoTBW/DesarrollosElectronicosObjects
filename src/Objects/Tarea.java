package Objects;

import java.util.ArrayList;

public class Tarea {
	
	private Usuario Asignado;
	private String Descripcion;
	private ArrayList<Pregunta> Preguntas;
	private Grupo GrupoUsuarios;
	
	public Usuario getAsignado() {
		return Asignado;
	}
	public void setAsignado(Usuario asignado) {
		Asignado = asignado;
	}
	public ArrayList<Pregunta> getPregunta() {
		return Preguntas;
	}
	
	public void setPregunta(Pregunta pregunta) {
		if(Preguntas == null )
			Preguntas = new ArrayList<Pregunta>();
		
		Preguntas.add(pregunta);		
	}		
	public Grupo getGrupoUsuarios() {
		return GrupoUsuarios;
	}
	public void setGrupoUsuarios(Grupo grupoUsuarios) {
		GrupoUsuarios = grupoUsuarios;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	
}
