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

}
