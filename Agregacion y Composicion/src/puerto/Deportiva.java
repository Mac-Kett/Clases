package puerto;

public class Deportiva extends Embarcacion{

	private int potenciaHP;
	private int factorAerodinamico;
	private static final double = 0,35;

	public Deportiva(int potencia, int aero) {
		super();
		setPotenciaHP(potencia);
		setFactorAerodinamico(aero);
	}
	
	public int getPotenciaHP() {
		return potenciaHP;
	}
	public void setPotenciaHP(int potenciaHP) {
		this.potenciaHP = potenciaHP;
	}
	public int getFactorAerodinamico() {
		return factorAerodinamico;
	}
	public void setFactorAerodinamico(int factorAerodinamico) {
		this.factorAerodinamico = factorAerodinamico;
	}
	
	public double calcularAdicional() {
		return super.getValorAdicional() * (this.potenciaHP/2);
	}
	
	public double calcularConsumo() {
		return this.potenciaHP / aerodinamico * this.INDICE_POTENCIAL();
	}
	
}
