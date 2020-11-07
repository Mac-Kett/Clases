package restaurante;

public class Gerente extends Empleado{

	private int cantPersACargo;
	
	public Gerente(int cant) {
		super();
		setCantPersACargo(cant);
	}

	public int getCantPersACargo() {
		return cantPersACargo;
	}

	public void setCantPersACargo(int cantPersACargo) {
		this.cantPersACargo = cantPersACargo;
	}
	
	
}
