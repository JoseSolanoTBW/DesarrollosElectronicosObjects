package Objects;

import java.util.ArrayList;

public class Pregunta {

	private ArrayList<String> Respuestas;
	private String Tipo;
	private String Pregunta;
	
	public ArrayList<String> getRespuestas() {
		return Respuestas;
	}
	public void setRespuestas(ArrayList<String> respuestas) {
		Respuestas = respuestas;
	}
	public void setRespuesta(String respuesta) {
		if(Respuestas == null )
			Respuestas = new ArrayList<String>();
		
		Respuestas.add(respuesta);		
	}
	
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getPregunta() {
		return Pregunta;
	}
	public void setPregunta(String pregunta) {
		Pregunta = pregunta;
	}
	
	
}
