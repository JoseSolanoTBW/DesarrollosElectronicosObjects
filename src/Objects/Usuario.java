package Objects;

public class Usuario {
	
	private String Nombre;
	private String Apellido;
	private String Password;
	private Grupo Grupos;
	private Rol Roles;
	private String Mail;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Grupo getGrupos() {
		return Grupos;
	}
	public void setGrupos(Grupo grupos) {
		Grupos = grupos;
	}
	public Rol getRoles() {
		return Roles;
	}
	public void setRoles(Rol roles) {
		Roles = roles;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
}
