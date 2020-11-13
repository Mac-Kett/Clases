package mundoMarino;

import java.util.ArrayList;

public class Cuidador extends PersonalParque{

	private String nombre;
	private int animalesCuidadosMaximo;
	ArrayList <Animal> animales;
	
	public Cuidador(String nom, int maxAnimales) {
		setNombre(nom);
		setAnimalesCuidadosMaximo(maxAnimales);
		ArrayList<Animal> animales = new ArrayList<Animal>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnimalesCuidadosMaximo() {
		return animalesCuidadosMaximo;
	}

	public void setAnimalesCuidadosMaximo(int animalesCuidadosMaximo) {
		this.animalesCuidadosMaximo = animalesCuidadosMaximo;
	}

	@Override
	public double getHoraIngreso() {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}

	@Override
	public double getHoraSalida() {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}
	
}
