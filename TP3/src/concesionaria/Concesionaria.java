package concesionaria;

import java.util.ArrayList;

public class Concesionaria {

	private String nombre;
	private int valorEconomico;
	private ArrayList <Auto> vehiculos;
	private ArrayList <Auto> vehiculosEconomicos;
	
	public int getValorEconomico() {
		return valorEconomico;
	}


	public void setValorEconomico(int valorEconomico) {
		this.valorEconomico = valorEconomico;
	}


	public ArrayList<Auto> getVehiculosEconomicos() {
		return vehiculosEconomicos;
	}


	public void setVehiculosEconomicos(ArrayList<Auto> vehiculosEconomicos) {
		this.vehiculosEconomicos = vehiculosEconomicos;
	}


	public ArrayList<Auto> getVehiculos() {
		return vehiculos;
	}


	public void setVehiculos(ArrayList<Auto> vehiculos) {
		this.vehiculos = vehiculos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList <Auto> vehiculosMasEconomicos (){
		int i = 0;
		Auto autoEncontrado = null;
		Auto auto;
		
		while(i < vehiculos.size() && autoEncontrado == null) {
			auto = vehiculos.get(i);
			if(auto.getPrecio() == valorEconomico) {
				autoEncontrado = auto;
				vehiculosEconomicos.add(autoEncontrado);
			}
			else {
				i++;
			}
		}
		
		return vehiculosEconomicos;
	}
	
	public int cantidadDeVehiculosSegunMarca(String marca) {
		
		int i = 0;
		Auto autoEncontrado = null;
		Auto auto;
		int cantidad = 0;
		
		while(i < vehiculos.size() && autoEncontrado == null) {
			auto = vehiculos.get(i);
			if(auto.getMarca() == marca) {
				autoEncontrado = auto;
				cantidad++;
			}
			else {
				i++;
			}
		}
		return cantidad;
	}

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}
}

