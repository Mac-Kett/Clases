package ORTProp;

public class Cliente {

	private String apellido;
	private String nombre;
	private String telefono;
	private String email;
	
	public Cliente(String apellido, String nombre, String tel, String email) {
		super();
		
		setApellido(apellido);
		setNombre(nombre);
		setTelefono(tel);
		setEmail(email);
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public void responderMensaje() {
		//falta
	}
	
	@Override
	public void recibirMensaje() {
		System.out.println("He recibido un SMS en mi telefono " + this.telefono " con el mensaje: " + mensaje)	}
	
	@Override
	public String getMedioDeContacto() {
		//falta
	}
}
