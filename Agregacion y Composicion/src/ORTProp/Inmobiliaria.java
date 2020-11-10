package ORTProp;

public class Inmobiliaria {

	private String nombre;
	private String email;
	private int comision;
	
	public Inmobiliaria(String nombre, String email, int comision) {
		super();
		
		setNombre(nombre);
		setEmail(email);
		setComision(comision);
	}
	
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
	public int getComision() {
		return comision;
	}
	public void setComision(int comision) {
		this.comision = comision;
	}
	
	@Override
	public void responderMensaje() {
		//falta
	}
	
	@Override
	public void recibirMensaje(String mensaje) {
		System.out.println("He recibido un email en mi casilla " + this.email " con el mensaje: " + mensaje)
	}
	
	@Override
	public String getMedioDeContacto() {
		//falta
	}
	
}
