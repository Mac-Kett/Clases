package puerto;

public class Yate extends Embarcacion{

	private int camarotes;
	
	public Yate(int cant) {
		super();
		setCamarotes(cant);
	}

	public int getCamarotes() {
		return camarotes;
	}

	public void setCamarotes(int camarotes) {
		this.camarotes = camarotes;
	}
	
	public double calcularAdicional() {
		super.getValorAdicional() * this.camarotes;
	}
	
}
