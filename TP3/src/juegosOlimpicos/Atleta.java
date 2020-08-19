package juegosOlimpicos;

public class Atleta {

	private double segundos;
	private String nombre;
	
	public Atleta (double seg, String nombre) {
		this.setSegundos(seg);
		this.setNombre(nombre);
	}
	
	public double getSegundos() {
		return segundos;
	}

	public void setSegundos(double segundos) {
		this.segundos = segundos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
