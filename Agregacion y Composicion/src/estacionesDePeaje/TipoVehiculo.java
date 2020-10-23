package estacionesDePeaje;

public enum TipoVehiculo {

	public CAMION,
	public AUTO,
	public MOTO
	
	public double costo(Vehiculo) {
		if(vehiculo.tipo()) {
			case CAMION: costo = 30;
			break;
			case AUTO: costo = 20;
			break;
			case MOTO: costo = 10;
		}
		
		return costo;
	}
	
}
