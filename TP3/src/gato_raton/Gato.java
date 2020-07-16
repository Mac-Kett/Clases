package gato_raton;

public class Gato {

	private int energia;
	private int desgaste;
	
	public Gato (int energia){
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
		desgaste = 1;
	}

	public boolean alcanzar(Raton raton, int distancia) {
		boolean loAlcanzo = false;
		
		int loQueCorreRaton = raton.suDesgaste();
		int loQueCorreGato = this.energia / this.desgaste;
		
		if (loQueCorreRaton >= loQueCorreGato) {
			loAlcanzo = true;
		}
		
		return loAlcanzo;
	}
	
}
