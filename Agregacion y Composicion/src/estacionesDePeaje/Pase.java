package estacionesDePeaje;

public class Pase extends MediosElectronicos{

	private double DCTO1 = 15;
	private double DCTO2 = 12;
	public static int DIAS_MAX_DEMORA = 5;
	private int demora;
	
	public int getDIAS_MAX_DEMORA() {
		return DIAS_MAX_DEMORA;
	}

	public void setDIAS_MAX_DEMORA(int dIAS_MAX_DEMORA) {
		DIAS_MAX_DEMORA = dIAS_MAX_DEMORA;
	}

	public double getDCTO1() {
		return DCTO1;
	}

	public void setDCTO1(double dCTO1) {
		DCTO1 = dCTO1;
	}

	public double getDCTO2() {
		return DCTO2;
	}

	public void setDCTO2(double dCTO2) {
		DCTO2 = dCTO2;
	}

	public void setDemora(int demora) {
		this.demora = demora;
	}

	@Override
	public int getDemora() {
		return 5;
	}
	
	@Override
	public double getDescuento() {
		double descuento = DCTO2;
		
		if(getDemora() < DIAS_MAX_DEMORA) {
			descuento = DCTO1;
		}
		
		return descuento;
	}
	
}
