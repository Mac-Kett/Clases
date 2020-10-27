package puerto;

import java.util.ArrayList;

public class Amarra {

	private int numero;
	private String ubicacion;
	private boolean disponibilidad;
	private ArrayList <Embarcacion> embarcaciones;
	
	public Amarra(int num, String ubicacion, boolean dis) {
		setNumero(num);
		setUbicacion(ubicacion);
		setDisponibilidad(dis);
		ArrayList <Embarcacion> embarcaciones = new ArrayList <Embarcacion>();
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	public Embarcacion barcoConMayorConsumo() {
		double consumoTotal = 0;
		double consumoAux;
		Embarcacion embarcacionDevolver;
		
		for(Embarcacion e: this.embarcaciones) {
			
			if(e instanceof Deportivo) {
				consumoAux = e.calcularConsumo();
				
				if(consumoAux > consumoTotal) {
					consumoTotal = consumoAux;
					embarcacionDevolver = embarcacion;
				}
			}
		}
		
		return embarcacionDevolver;
	}
	
}
