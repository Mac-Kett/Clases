package estacionesDePeaje;

public class Empleado {

	private String nombre;
	private String apellido;
	private String sexo;
	private String direccion;
	private int cp;
	private int telefono;
	
	public Empleado(String nom, String ap, String sex, String dir, int cp, int tel) {
		setNombre(nom);
		setApellido(ap);
		setSexo(sex);
		setDireccion(dir);
		setCp(cp);
		setTelefono(tel);
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

	public String getSexo() {
		return sexo;
	}

	private void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCp() {
		return cp;
	}

	private void setCp(int cp) {
		this.cp = cp;
	}

	public int getTelefono() {
		return telefono;
	}

	private void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}
