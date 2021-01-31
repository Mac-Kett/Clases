package EmpresaFruticola;

public class Cosecha {

	private int nro;
	private Producto producto;
	private double toneladas;
	private double hectareas;
	
	public Cosecha(DatosCosecha datos) {
		setNro(datos.getNroCosecha());
		setProducto(datos.getProducto());
		setToneladas(datos.getToneladas());
		setHectareas(datos.getHectareas());
		
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
	
	public double obtenerRendimiento() {
		//TODO
		double resultado = 0;
		
		resultado = this.toneladas/this.hectareas;
		
		return resultado;
	}
	
	public void imprimirResultadoCosecha() {
		//TODO
		System.out.println("Los resultados de la cosecha fueron: "+ obtenerRendimiento());
	}
	
}
