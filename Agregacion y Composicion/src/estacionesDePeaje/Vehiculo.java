package estacionesDePeaje;

public class Vehiculo {

	private String patente;
	private TipoVehiculo tipo;
	
	public Vehiculo(String patente, TipoVehiculo tipo) {
		setPatente(patente);
		setTipo(tipo);
	}

	public String getPatente() {
		return patente;
	}

	private void setPatente(String patente) {
		this.patente = patente;
	}

	public TipoVehiculo getTipo() {
		return tipo;
	}

	private void setTipo(TipoVehiculo tipo) {
		this.tipo = tipo;
	}
	
}
