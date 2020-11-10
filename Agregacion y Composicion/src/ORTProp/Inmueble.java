package ORTProp;

import java.util.ArrayList;

public class Inmueble {

	private String domicilio;
	private double superficie;
	private int cantAmbientes;
	private double precioAnterior;
	private double precioNuevo;
	private ArrayList <Interesado> interesados;
	
	public Inmueble(String dom, double sup, int amb, double pAnt, double pNuevo) {
		setDomicilio(dom);
		setSuperficie(sup);
		setCantAmbientes(amb);
		setPrecioAnterior(pAnt);
		setPrecioNuevo(pNuevo);
		
		this.interesados = new ArrayList <Interesado>();
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	public int getCantAmbientes() {
		return cantAmbientes;
	}
	public void setCantAmbientes(int cantAmbientes) {
		this.cantAmbientes = cantAmbientes;
	}
	public double getPrecioAnterior() {
		return precioAnterior;
	}
	public void setPrecioAnterior(double precioAnterior) {
		this.precioAnterior = precioAnterior;
	}
	public double getPrecioNuevo() {
		return precioNuevo;
	}
	public void setPrecioNuevo(double precioNuevo) {
		this.precioNuevo = precioNuevo;
	}
	
	public void setNuevoPrecio(double pNuevo) {
		setPrecioNuevo(pNuevo);
		enviarNotificacion(pNuevo);
	}
	
	private void obtenerMedioDeContacto(double, double) {
		
		for(Interesado i: this.interesados) {
			String medioDeContacto = i.getMedioDeContacto();
			enviarMensaje(medioDeContacto, pNuevo);
			i.recibirMensaje();
		}
	}
	
	private void enviarMensaje(String mensaje, double monto) {
		System.out.println("El inmueble por el que ha demostrado interés " + mostrarDatos() + " ha cambiado su precio de " + this.precio + " a " + monto)
	}
	
	public void mostrarDatos() {
		System.out.println(this.domicilio + this.superficie + this.cantAmbientes);
	}
}
