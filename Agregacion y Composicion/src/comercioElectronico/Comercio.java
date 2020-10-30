package comercioElectronico;

import java.util.ArrayList;

public class Comercio {

	private ArrayList<Insumo> historial;
	
	public Comercio() {
		historial = new ArrayList<Insumo>();
	}
	
	public double montoTotalFacturado() {
		double precio;
		double total = 0;
		
		for(Insumo i: this.historial) {
			precio = i.devolverPrecioFacturacion();
			total = total + precio;
		}
		
		return total;
	}
	
	public int cantServiciosSimples() {
		
		int contador = 0;
		
		for(Insumo i: this.historial) {
			if(i instanceof Reparacion) {
				if(i.getDificultad() < 2) {
					contador++;
				}
			}
		}
		return contador;
	}
	
}
