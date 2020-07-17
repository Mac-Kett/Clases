package gato_raton;

public class Raton {

	private int energia;
	private int desgaste;
	
	public Raton (int energia) {
		this.setEnergia(energia);
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public int getDesgaste() {
		return desgaste;
	}

	public void setDesgaste(int desgaste) {
		this.desgaste = desgaste;
		desgaste = 2;
	}

	public int suDesgaste() {
		
		int cuanto = this.energia / this.desgaste;
		
		return cuanto;
	}
	
}
