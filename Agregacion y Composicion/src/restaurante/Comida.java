package restaurante;

public class Comida extends Alimento{

	private String descripcion;
	private boolean indiceVegano;
	private boolean indiceVegetariano;
	
	public Comida(String descripcion, boolean vegan, boolean veggie) {
		super();
		setDescripcion(descripcion);
		setIndiceVegano(vegan);
		setIndiceVegetariano(veggie);
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isIndiceVegano() {
		return indiceVegano;
	}
	public void setIndiceVegano(boolean indiceVegano) {
		this.indiceVegano = indiceVegano;
	}
	public boolean isIndiceVegetariano() {
		return indiceVegetariano;
	}
	public void setIndiceVegetariano(boolean indiceVegetariano) {
		this.indiceVegetariano = indiceVegetariano;
	}
	
	
	
}
