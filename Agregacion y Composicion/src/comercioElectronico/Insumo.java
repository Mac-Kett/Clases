package comercioElectronico;

public abstract class Insumo {

	private String nombre;
	private Tipo tipo;
	private double porcentajeGanancia;
	private double precioLista;
	public final int IVA = 21;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public double getPorcentajeGanancia() {
		return porcentajeGanancia;
	}
	public void setPorcentajeGanancia(double porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}
	public double getPrecioLista() {
		return precioLista;
	}
	public void setPrecioLista(double precioLista) {
		this.precioLista = precioLista;
	}
	public int getIVA() {
		return IVA;
	}
	
	public double devolverPrecioFacturacion() {
		//falta
	}
	
}
