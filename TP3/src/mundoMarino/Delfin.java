package mundoMarino;

import java.util.ArrayList;

public class Delfin extends Animal{

	private String nombre;
	private double peso;
	private double tamanio;
	ArrayList <Habilidad> habilidades;
	private Alimento alimento;
	private Entrenador entrenador;
	private Cuidador cuidador;
	
	public Delfin(String nombre, double peso, double tamanio, ArrayList<Habilidad> habilidades, Alimento alimento,
			Entrenador entrenador, Cuidador cuidador) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.tamanio = tamanio;
		this.habilidades = habilidades;
		this.alimento = alimento;
		this.entrenador = entrenador;
		this.cuidador = cuidador;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getTamanio() {
		return tamanio;
	}
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	public ArrayList<Habilidad> getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(ArrayList<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}
	public Alimento getAlimento() {
		return alimento;
	}
	public void setAlimento(Alimento alimento) {
		this.alimento = alimento;
	}
	public Entrenador getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	public Cuidador getCuidador() {
		return cuidador;
	}
	public void setCuidador(Cuidador cuidador) {
		this.cuidador = cuidador;
	}
	
	
}
