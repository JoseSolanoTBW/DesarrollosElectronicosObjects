package Objects;

import java.util.List;

public class Tarea {
	
	private Usuario Asignado;
	private String Pregunta;
	private List<String> Respuestas;
	
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

	
}
