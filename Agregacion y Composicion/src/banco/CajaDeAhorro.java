package banco;

public class CajaDeAhorro extends ProductoBancario {

	
	private double saldo;
	
	public CajaDeAhorro(String id, String cliente, double saldo, double tasaInteres) {
		super(id, cliente, saldo, tasaInteres);
		setSaldo(saldo);
		
	}
	
	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		if(saldo >= 0) {
		this.saldo = saldo;
		}
	}

	@Override
	public double depositar(double monto) {
		
		double total;
		total = this.saldo + monto;
		
		return total;
	}
	
	@Override
	public double retirar(double monto) {
		
		double total;
		if(monto <= this.saldo) {
		total = this.saldo - monto;
		}
		else {
			total = this.saldo;
		}
		return total;
	}
}
