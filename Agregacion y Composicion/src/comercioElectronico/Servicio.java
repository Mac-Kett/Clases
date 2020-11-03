package comercioElectronico;

public abstract class Servicio extends Insumo{

	private int cantHoras;
	public static final int VALOR_HORA;
	
	
	public int getCantHoras() {
		return cantHoras;
	}
	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}
	public static int getValorHora() {
		return VALOR_HORA;
	}
	
	public double devolverPrecioFacturacion() {
		//falta
	}
	
	public int getCantHoras() {
		//falta
	}
		
	public abstract double calcularPrecio();
}
