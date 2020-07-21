package ejercicio5;

public class Hotel {
	
	private String nombre;
	private String localidad;
	private int habitacionesTotales;
	private int habitacionesOcupadas;
	private int habitacionesReservadas;
	
	public Hotel(String nom, String local, int totHab) {
		setNombre(nom);
		setLocalidad(local);
		setHabitacionesTotales(totHab);
	}

	public Hotel(String nom, String local, int totHab, int habOcu, int habRes) {
		setNombre(nom);
		setLocalidad(local);
		setHabitacionesTotales(totHab);
		setHabitacionesOcupadas(habOcu);
		setHabitacionesReservadas(habRes);
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getLocalidad() {
		return localidad;
	}


	private void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public int getHabitacionesTotales() {
		return habitacionesTotales;
	}


	private void setHabitacionesTotales(int habitacionesTotales) {
		this.habitacionesTotales = habitacionesTotales;
		if(this.habitacionesTotales <= 0) {
		this.habitacionesTotales = 1;
		}
	}


	public int getHabitacionesOcupadas() {
		return habitacionesOcupadas;
	}


	private void setHabitacionesOcupadas(int habitacionesOcupadas) {
		this.habitacionesOcupadas = habitacionesOcupadas;
	}


	public int getHabitacionesReservadas() {
		return habitacionesReservadas;
	}


	private void setHabitacionesReservadas(int habitacionesReservadas) {
		this.habitacionesReservadas = habitacionesReservadas;
	}

	public boolean reservarHabitaciones(int cantHab) {
		
		if(this.habitacionesTotales >= cantHab) {
		return true;
		}
		else {
		return false;
		}
	}
	
	private boolean ocuparConReserva() {
		
	}
	
	private boolean ocuparSinReserva() {
		
	}
	
	public boolean ocuparHabitaciones(int quieroOcupar, boolean esReserva) {

		boolean reserva = ocuparConReserva();
		boolean sinReserva = ocuparSinReserva();
		 
		if(esReserva == true) {
			if(reserva == true) {
			return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}
	
	public boolean desocuparHabitaciones(int quieroDesocupar) {
		
		if((quieroDesocupar > 0) && (quieroDesocupar < this.habitacionesOcupadas)) {
			this.habitacionesOcupadas = this.habitacionesOcupadas - quieroDesocupar;
			return true;
		}
		else {
			return false;
		}
	}
	
	public int cantidadHabitacionesLibres() {
		
		int aux = this.habitacionesTotales - this.habitacionesOcupadas;
		
		return aux;
		
	}
	
	public int disponibilidad() {
		
		int aux = this.habitacionesTotales - this.habitacionesOcupadas;
		int auxi = aux - this.habitacionesReservadas;
		
		return auxi;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

	@Override
	public String toString() {
		return "Hotel [nombre=" + nombre + ", localidad=" + localidad + ", habitacionesTotales=" + habitacionesTotales
				+ ", habitacionesOcupadas=" + habitacionesOcupadas + ", habitacionesReservadas="
				+ habitacionesReservadas + ", cantidadHabitacionesLibres()=" + cantidadHabitacionesLibres()
				+ ", disponibilidad()=" + disponibilidad() + "]";
	}
	
}
