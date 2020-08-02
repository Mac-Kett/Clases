package cuadrado;

public class Cuadrado {

	private int lado;

	public Cuadrado(int lado) {
		setLado(lado);
	}
	
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

	public int getLado() {
		return lado;
	}

	public int setLado(int lado) {
		this.lado = lado;
	}

	public int perimetro() {
		int  aux;
		aux = this.lado * 4;
		return aux;
	}
	
	public int superficie() {
		int aux;
		aux = this.lado * this.lado;
		return aux;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", getLado()=" + getLado() + ", perimetro()=" + perimetro()
				+ ", superficie()=" + superficie() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
