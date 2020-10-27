package Asalariados;

public class Empleado {

	
	private String nombre;
	private int edad;
	
	public Empleado(String edad2, int sueldo) {
		setNombre(edad2);
		setEdad(sueldo);
	}
	
	public Empleado() {
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public float calcularPago() {
		return 0;
	}

}
