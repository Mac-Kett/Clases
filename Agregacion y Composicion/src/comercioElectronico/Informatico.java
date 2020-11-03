package comercioElectronico;

public class Informatico extends Insumo{

	@Override
	public double devolverPrecioFacturacion() {
		return (super.getPrecioLista() + super.getPorcentajeGanancia()) * super.IVA / 100;
	}
	
}
