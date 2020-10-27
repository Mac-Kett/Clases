package puerto;

public class DeportivoDeLujo extends Deportiva{

	private int potenciaHP;
	private int aerodinamico;
	
	public DeportivoDeLujo(int potencia, int aero) {
		super(potencia, aero);
		setPotenciaHP(potencia);
		setAerodinamico(aero);
	}
	
	public int getPotencialHP() {
		return potenciaHP;
	}
	public void setPotenciaHP(int potenciaHP) {
		this.potenciaHP = potenciaHP;
	}
	public int getAerodinamico() {
		return aerodinamico;
	}
	public void setAerodinamico(int aerodinamico) {
		this.aerodinamico = aerodinamico;
	}
	
	public double calcularConsumo() {
		return 2 * this.potenciaHP * super.INDICE_POTENCIA;
	}
	
}
