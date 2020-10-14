package banco;

public abstract class ProductoBancario {

	private String id;
	private String cliente;
	private double saldo;
	private double tasaInteres;
	
	public ProductoBancario(String id, String cliente, double saldo, double tasaInteres) {
		setId(id);
		setCliente(cliente);
		setSaldo(saldo);
		setTasaInteres(tasaInteres);
	}
	
	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	private void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getTasaInteres() {
		return tasaInteres;
	}

	private void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	public abstract void depositar(double monto);
	
	public abstract void retirar(double monto);
	
}
