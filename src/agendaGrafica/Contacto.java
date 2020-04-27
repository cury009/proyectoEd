package agendaGrafica;


public class Contacto {

	private String nombre;
	private int telefono;
	private String email;
	private String direccion;
	
	//constructores
	
	public Contacto (String nombre) {
		this.nombre = nombre;
		this.telefono = 0;
		
	}
	public Contacto(String nombre, int telefono, String email, String direccion) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
	}
	//metodos getter and setter
	public String getNombre() {
		return nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public String getEmail() {
		return email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//toString
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", direccion=" + direccion
				+ "]";
	}
	
	
	
	
	
}