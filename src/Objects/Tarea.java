package Objects;

import java.util.List;

public class Tarea {
	
	private Usuario Asignado;
	private String Pregunta;
	private List<String> Respuestas;
	private String Tipo;
	private Grupo GrupoUsuarios;
	
	public Usuario getAsignado() {
		return Asignado;
	}
	public void setAsignado(Usuario asignado) {
		Asignado = asignado;
	}
	public String getPregunta() {
		return Pregunta;
	}
	public void setPregunta(String pregunta) {
		Pregunta = pregunta;
	}
	public List<String> getRespuestas() {
		return Respuestas;
	}
	public void setRespuestas(List<String> respuestas) {
		Respuestas = respuestas;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public Grupo getGrupoUsuarios() {
		return GrupoUsuarios;
	}
	public void setGrupoUsuarios(Grupo grupoUsuarios) {
		GrupoUsuarios = grupoUsuarios;
	}	
	
}
