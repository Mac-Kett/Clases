package restaurante;

public class Cocinero extends Empleado{

	private int aniosExperiencia;
	private int legajo;
	
	public Cocinero(int anios, int legajo) {
		super();
		setAniosExperiencia(anios);
		setLegajo(legajo);
	}
	
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	
	
}
