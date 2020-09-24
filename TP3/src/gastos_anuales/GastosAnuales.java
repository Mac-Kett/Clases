package gastos_anuales;

import java.util.ArrayList;

public class GastosAnuales {

	private ArrayList <Rubro> rubros;
	private double[][] gastosPorMes;

	
//constructor:  Inicializa Rubros-------------------------------------------------------------------
	public GastosAnuales () {
		this.rubros = new ArrayList <Rubro>();
	}
	
	public void agregarGasto(Mes mes, String nombreRubro, double importe){
		
		int i = 0;
		Rubro rubroEncontrado = null;
//rubroAux existe sólo para ejecutar la búsqueda-----------------------------------------------------
		Rubro rubroAux;
//busca en el ArrayList si existe previamente-------------------------------------------------------
		while(i < this.rubros.size() && rubroEncontrado == null) {
			rubroAux = this.rubros.get(i);
			if(rubroAux.getNombre().equals(nombreRubro)) {
				rubroEncontrado = rubroAux;
				rubroEncontrado.agregarGasto(mes, importe);
			}
			
//Sino lo encuentra al finalizar el recorrido, lo agrega----------------------------------------------
		}
		if(rubroEncontrado == null) {
			Rubro rubroNuevo = new Rubro(nombreRubro);
			this.rubros.add(rubroEncontrado);
			rubroNuevo.agregarGasto(mes, importe);
		}
	}
	
	
	private Rubro obtenerRubro(String nombreRubro) {
		
		Rubro miRubro = buscarRubro(nombreRubro);
		
		if(miRubro == null) {
			Rubro rubro = new Rubro(nombreRubro);
			miRubro = rubro;
		}
		return miRubro;
	}
	
	private Rubro buscarRubro(String nombreRubro) {
		
		int i = 0;
		Rubro rubroEncontrado = null;
		Rubro rubroAux;
		
		
		while(i < this.rubros.length && rubroEncontrado == null) {
			rubroAux = this.rubros[i];
			if (rubroAux.getNombre.equals(nombreRubro)) {
				rubroEncontrado = rubroAux;
			}
			else {
				i++;
			}
		}
		return rubroEncontrado;
	}
	
	private double[][] consolidadoDeGastos(){
		int TOTAL_MESES = 12;
		this.gastosPorMes = new double[TOTAL_MESES][this.rubros.size()];
		
		for(double[] g: this.gastosPorMes) {
			this.gastosPorMes[g] = Mes.
		}

}
	
	
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
