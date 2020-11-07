package restaurante;

public class Bebida extends Alimento{

	private int tamanio;
	private boolean tieneAlcohol;
	
	public Bebida(int tamanio, boolean alcohol) {
		super();
		setTamanio(tamanio);
		setTieneAlcohol(alcohol);
	}
	
	public int getTamanio() {
		return tamanio;
	}
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	public boolean isTieneAlcohol() {
		return tieneAlcohol;
	}
	public void setTieneAlcohol(boolean tieneAlcohol) {
		this.tieneAlcohol = tieneAlcohol;
	}
	
	
}
