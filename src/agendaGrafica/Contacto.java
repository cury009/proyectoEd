package agendaGrafica;


public class Contacto {

	private String nombre;
	private int telefono;
	
	//constructores
	public Contacto (String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
		
	}
	public Contacto (String nombre) {
		this.nombre = nombre;
		this.telefono = 0;
		
	}
	//metodos getter and setter

	public String getNombre() {
		return nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public boolean equals (Contacto c) {
		if(this.nombre.equalsIgnoreCase(c.getNombre())) {
			return true;
		}
		return false;
	}
	//toString
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
}