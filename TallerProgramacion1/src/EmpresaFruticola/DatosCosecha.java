package EmpresaFruticola;

public class DatosCosecha {
	
	private int nroPlantacion;
	private int nroCosecha;
	private Producto producto;
	private double toneladas;
	private double hectareas;
	
	public DatosCosecha(int nplan, int ncos, Producto p, double ton, double hec) {
		setNroPlantacion(nplan);
		setNroCosecha(ncos);
		setProducto(p);
		setToneladas(ton);
		setHectareas(hec);
	}

	public int getNroPlantacion() {
		return nroPlantacion;
	}

	private void setNroPlantacion(int nroPlantacion) {
		this.nroPlantacion = nroPlantacion;
	}

	public int getNroCosecha() {
		return nroCosecha;
	}

	private void setNroCosecha(int nroCosecha) {
		this.nroCosecha = nroCosecha;
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

	
	
}
