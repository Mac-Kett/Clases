package comercioElectronico;

public class Armado extends Servicio{

	public double calcularPRecio() {
		//falta
	}
	
	@Override
	public double devolverPrecioFacturacion() {
		return (super.getPrecioLista() + super.getPorcentajeGanancia()) * (super.IVA / 2) / 100;
	}
	
}
