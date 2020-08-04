package consultorio;

public class Paciente {

	private String nombre;
	private String apellido;
	private String telefono;
	private String dni;
	private String genero;
	private boolean presente;
	
	public Paciente (String nombre, String apellido, String tel, String dni, String genero) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setTelefono(tel);
		this.setDni(dni);
		this.setGenero(genero);
		this.setPresente(false);
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

	
}
