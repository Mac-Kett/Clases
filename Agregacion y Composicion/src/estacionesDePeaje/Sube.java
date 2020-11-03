package estacionesDePeaje;

public class Sube extends MediosElectronicos{

	public static double DCTO = 10;
	public static double descuento;
	
	@Override
	public double getDescuento() {
		return DCTO;
	}
	
	@Override
	public int getDemora() {
		return 5;
	}
	
	
	
}
