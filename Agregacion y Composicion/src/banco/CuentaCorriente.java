package banco;

public class CuentaCorriente extends ProductoBancario{

	private double limDescubierto;
	
	public CuentaCorriente(String id, String cliente, double saldo, double tasaInteres, double limDescubierto) {
		super(id, cliente, saldo, tasaInteres);
		setLimDescubierto(limDescubierto);
		
	}

	public double getLimDescubierto() {
		return limDescubierto;
	}

	private void setLimDescubierto(double limDescubierto) {
		this.limDescubierto = limDescubierto;
	}
	
}
