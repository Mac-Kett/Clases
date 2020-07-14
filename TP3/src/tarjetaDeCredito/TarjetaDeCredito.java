package ejercicio3;

public class TarjetaDeCredito {

	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual;
	
	
	public TarjetaDeCredito(String numero, String titular, double limiteCompra) {
		setNumero(numero);
		setTitular(titular);
		setLimiteDeCompra(limiteCompra);
		this.acumuladoActual = 0;
	}


	public String getNumero() {
		return numero;
	}


	private void setNumero(String numero) {
		this.numero = numero;
	}


	public String getTitular() {
		return titular;
	}


	private void setTitular(String titular) {
		this.titular = titular;
	}


	public double getLimiteDeCompra() {
		return limiteDeCompra;
	}

	
	private void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}


	public double getAcumuladoActual() {
		return acumuladoActual;
	}



	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", limiteDeCompra=" + limiteDeCompra
				+ ", acumuladoActual=" + acumuladoActual + ", toString()=" + super.toString() + "]";
	}
	
	
	public double montoDisponible() {
		double actualDisponible = this.limiteDeCompra - this.acumuladoActual;
		if (actualDisponible < 0) {
			actualDisponible = 0;
		}
		return actualDisponible;
	}
	
	private boolean compraPosible(double montoDisponible, double montoCompra) {
		
		if(montoDisponible >= montoCompra) {
		return true;
		}
		else {
			return false;
		}
	}
	
	public void actualizarLimite(double limiteNuevo) {
		this.limiteDeCompra = limiteNuevo;
	}
	
	private double acumularGastoActual(double montoCompra) {
		double gastoActual = this.acumuladoActual + montoCompra;
		return gastoActual;
		
	}
	
	public boolean realizarCompra(double montoCompra) {
		double tot= this.limiteDeCompra - montoCompra;
		if(tot >= 0) {
			this.actualizarLimite(limiteNuevo);
		}
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
