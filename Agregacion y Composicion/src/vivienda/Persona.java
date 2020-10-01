package vivienda;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona (String nom, String ap, int edad) {
		setNombre(nom);
		setApellido(ap);
		setEdad(edad);
	}
	
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	private void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
