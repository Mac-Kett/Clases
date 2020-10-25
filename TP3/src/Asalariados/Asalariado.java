package Asalariados;

public class Asalariado extends Empleado{

	private float sueldo;
	
	public Asalariado() {
	}
	
	public Asalariado(String nombre, int edad, float sueldo) {
		super();
		setNombre(nombre);
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Asalariado [sueldo=" + sueldo + "]";
	}
	
	@Override
	public float calcularPago() {
		return this.sueldo;
	}
	
}
