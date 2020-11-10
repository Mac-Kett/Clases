package ORTProp;

public abstract class Interesado {

	private String nombre;
	private String email;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract void responderMensaje();
	
	public abstract void recibirMensaje();
	
	public abstract void getMedioDeContacto();
	
}
