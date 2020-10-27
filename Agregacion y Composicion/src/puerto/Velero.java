package puerto;

public class Velero extends Embarcacion{

	private int mastiles;

	public Velero(int mastiles) {
		super();
		setMastiles(mastiles);
	}
	
	public int getMastiles() {
		return mastiles;
	}

	public void setMastiles(int mastiles) {
		this.mastiles = mastiles;
	}
	
	public double calcularAdicional() {
		return super.getValorAdicional() * this.mastiles;
	}
	
}
