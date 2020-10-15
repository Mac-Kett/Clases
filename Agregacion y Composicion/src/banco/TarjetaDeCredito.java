package banco;

public class TarjetaDeCredito extends ProductoBancario{

	private double limDeCredito;
	
	public TarjetaDeCredito(String id, String cliente, double saldo, double tasaInteres, double limDeCredito) {
		super(id, cliente, saldo, tasaInteres);
		setLimDeCredito(limDeCredito);
	}
	
	public double getLimDeCredito() {
		return limDeCredito;
	}

	private void setLimDeCredito(double limDeCredito) {
		this.limDeCredito = limDeCredito;
	}


	@Override
	public double depositar(double monto) {
		double total;
		if(monto > 0) {
		if(monto == this.getSaldo()) {
			total = this.getSaldo() - monto;
		}
		else {
			
		}
		}
		
	}
	
	@Override
	public double retirar(double monto) {
		
	}
	
}
