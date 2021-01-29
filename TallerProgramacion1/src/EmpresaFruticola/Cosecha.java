package EmpresaFruticola;

public class Cosecha {

	private int nro;
	private Producto producto;
	private double toneladas;
	private double hectareas;
	
	public Cosecha(DatosCosecha datos) {
		
	}

	public int getNro() {
		return nro;
	}

	private void setNro(int nro) {
		this.nro = nro;
	}

	public Producto getProducto() {
		return producto;
	}

	private void setProducto(Producto producto) {
		this.producto = producto;
	}

	public double getToneladas() {
		return toneladas;
	}

	private void setToneladas(double toneladas) {
		this.toneladas = toneladas;
	}

	public double getHectareas() {
		return hectareas;
	}

	private void setHectareas(double hectareas) {
		this.hectareas = hectareas;
	}

	@Override
	public String toString() {
		return "Cosecha [nro=" + nro + ", toneladas=" + toneladas + ", hectareas=" + hectareas + "]";
	}
	
}
