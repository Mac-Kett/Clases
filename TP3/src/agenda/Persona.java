package agenda;

public class Persona {

	private String nombre;
	private String apellido;
	private String dni;
	private String telefono;
	private String mail;
	
	public Persona(String nombre, String apellido, String dni, String telefono, String mail) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.mail = mail;
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

	public String getDni() {
		return dni;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	private void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	private void setMail(String mail) {
		this.mail = mail;
	}

	
	
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono
				+ ", mail=" + mail + "]";
	}
	
}
