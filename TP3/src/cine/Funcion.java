package repaso;

import java.util.ArrayList;

public class Funcion {

	private String dia;
	private String horaInicio;
	ArrayList <Asiento> asientos;
	
	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public ArrayList<Asiento> getAsientos() {
		return asientos;
	}

	public void setAsientos(ArrayList<Asiento> asientos) {
		this.asientos = asientos;
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
