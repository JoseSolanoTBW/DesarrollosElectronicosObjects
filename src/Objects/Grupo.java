package Objects;

import java.util.List;

public class Grupo {

	private String Nombre;
	private List<String> Privilegios;

	public List<String> getPrivilegios() {
		return Privilegios;
	}

	public void setPrivilegios(List<String> privilegios) {
		Privilegios = privilegios;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}	
}
