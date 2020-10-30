package comercioElectronico;

public class Reparacion extends Servicio{

	private int dificultad;
	public static final int PORCENTAJE_INCREMENTO = 25;
	
	public Reparacion(int dif) {
		setDificultad(dif);
	}
	
	public int getDificultad() {
		return dificultad;
	}
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	public static int getPorcentajeIncremento() {
		return PORCENTAJE_INCREMENTO;
	}
	
	@Override
	public double calcularPrecio() {
		//falta
	}
	
	private double calcularIncremento() {
		//falta
	}
	
	@Override
	public double devolverPrecioFacturacion() {
		return (super.getPrecioLista() + super.getPorcentajeGanancia()) * (super.IVA / 2) / 100;
	}
}
