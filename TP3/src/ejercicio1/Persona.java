package ejercicio1;

public class Persona {

	private String nombre;
	private String apellido;
	private String direccion;
	
	public Persona() {
		setNombre("");
		setApellido("");
		setDireccion("");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + "]";
	}

	
}
