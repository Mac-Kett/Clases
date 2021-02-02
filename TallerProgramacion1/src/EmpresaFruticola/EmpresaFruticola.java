package EmpresaFruticola;

import java.util.ArrayList;

public class EmpresaFruticola {

	private String nombre;
	private ArrayList<DatosCosecha> datosCosecha;
	private ArrayList<Plantacion> plantaciones;
	private int[][] contCosechas;
	private double[][] toneladasAcumuladas;
	
	public EmpresaFruticola(String nom) {
		setNombre(nom);
		ArrayList<DatosCosecha> datosCosecha = new ArrayList<DatosCosecha>();
		ArrayList<Plantacion> plantaciones = new ArrayList<Plantacion>();
		
		contCosechas[][];
	}
	
	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		if(nombre == "" || nombre == " ") {
			throw new IllegalArgumentException ("El nombre no puede quedar vacío");
		} else {
		this.nombre = nombre;
		}
	}

	public void agregarPlantacion(String nombre) {
	//TODO	
		Plantacion plantacion = new Plantacion(nombre, 0);
		plantaciones.add(plantacion);
	}
	
	public void cargarDatosCosecha (int a, int b, Producto prod, double d) {
		//TODO
	}

	public void cargarDatosCosecha (int a, int b, Producto p, double num, double num2) {
		//TODO
	}
	
	private boolean nroDePlantacionValido(int num) {
		//TODO
		
		boolean esValido = false;
		int i  = 0;
		Plantacion actual = null;
		
		while (esValido == false && i < this.plantaciones.size()) {
			actual = this.plantaciones.get(i);
			
			if(actual.getCosechaPorNumero(num) != null) {
				esValido = true;
			}
		}
		
		return esValido;
	}
	
	private int cantidadDeProductos() {
		//TODO
		
	}
	
	public void procesarDatos() {
		//TODO
	}
	
	public void listarDatosEntrada() {
		//TODO
	}
	
	public void listarDatosSalida() {
		//TODO
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
