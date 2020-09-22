package gastos_anuales;

import java.util.ArrayList;

public class GastosAnuales {

	private ArrayList <Rubro> rubros;
	
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
	
	
	private Rubro obtenerRubro(String ****) {
		
	}
	
	private Rubro buscarRubro(String ***) {
		
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
