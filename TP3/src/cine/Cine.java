import java.util.ArrayList;

import repaso.Asiento;
import repaso.Entrada;
import repaso.EstadoAsiento;
import repaso.Funcion;

public class Cine {

	private String nombre;
	ArrayList <Funcion> asientos;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Funcion> getFunciones() {
		return asientos;
	}

	public void setFunciones(ArrayList<Funcion> funciones) {
		this.asientos = funciones;
	}
	
	public boolean procesarEntradas (ArrayList<Entrada>entradas) {
		boolean pudo = true;
		
		
		
		return pudo;
	}

	public Asiento buscarAsiento (String letraBuscada, int filaBuscada) {
		Asiento asientoBuscado = null;
		int i = 0;
		
		while (i < asientos.size() && asientoBuscado == null) {
			if(asientos.get(i).getLetra().equals(letraBuscada)
				&& asientos.get(i).getFila()==filaBuscada 
				&& asientos.get(i).getEstado == EstadoAsiento.RESERVADO) {
				
				asientoBuscado = asientos.get(i);
			}
			else {
				i++;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
