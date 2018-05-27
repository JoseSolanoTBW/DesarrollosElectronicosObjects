package Objects;

import java.util.ArrayList;

public class Grupo {

	private String Nombre;
	private ArrayList<String> Privilegios;

	public ArrayList<String> getPrivilegios() {
		return Privilegios;
	}

	public void setPrivilegios(ArrayList<String> privilegios) {
		Privilegios = privilegios;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}	
}
