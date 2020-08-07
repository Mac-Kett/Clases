import java.util.ArrayList;

import repaso.Asiento;

public class Funcion {

	private String dia;
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

	private String horaInicio;
	ArrayList <Asiento> asientos;
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}

