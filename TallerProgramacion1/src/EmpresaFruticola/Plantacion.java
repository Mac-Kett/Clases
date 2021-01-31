package EmpresaFruticola;

import java.util.ArrayList;

public class Plantacion {

	private String nombre;
	private double hectareas;
	private ArrayList<Cosecha> cosechas;
	
	public Plantacion(String nom, double hec) {
		setNombre(nom);
		setHectareas(hec);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getHectareas() {
		return hectareas;
	}

	private void setHectareas(double hectareas) {
		this.hectareas = hectareas;
	}
	
	public void agregarCosecha(Cosecha c) {
		//TODO
		
		this.cosechas.add(c);
		
	}
	
	public void mostrarDatos() {
		//TODO
		toString();
		
	}
	
	public void mostrarTodos() {
		//TODO
		
		for(Cosecha c: this.cosechas) {
			c.toString();
			c.imprimirResultadoCosecha();
		}
		
	}
	
	public void rendimientoMaximo() {
		//TODO
	}
	
	public void rendimientoMinimo() {
		//TODO
	}
	
	public void mostrarMenoresA (int num) {
		//TODO
	}

	public void mostrarMayoresA(int num) {
		//TODO
	}
	
	public Cosecha getCosechaPorNumero(int num) {
		//TODO
	}
	
	public Cosecha getCosechaPorProducto(Producto prod) {
		//TODO
	}

	@Override
	public String toString() {
		return "Plantacion [nombre=" + nombre + ", hectareas=" + hectareas + ", cosechas=" + cosechas + "]";
	}
	
	
}
