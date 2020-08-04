package pedido;

public class Pedido {
	
	private int numeroPedido;
	private int codigoArticulo;
	private int cantidadPedida;
	private double importe;
	private int cantidadPendiente;
	private String estadoPedido;
	private int cantidadEntregada;
	
	public Pedido(int num, int codigo, int cantidadPedida, double importe, int cantPendiente, String estado, int cantEnt) {
		setNumeroPedido(num);
		setCodigoArticulo(codigo);
		setCantidadPedida(cantidadPedida);
		setImporte(importe);
		setCantidadPendiente(cantidadPendiente);
		setEstadoPedido("P");
		setCantidadEntregada(cantEnt);
		
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	private void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public int getCodigoArticulo() {
		return codigoArticulo;
	}

	private void setCodigoArticulo(int codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public int getCantidadPedida() {
		return cantidadPedida;
	}

	private void setCantidadPedida(int cantidadPedida) {
		this.cantidadPedida = cantidadPedida;
	}

	public double getImporte() {
		return importe;
	}

	private void setImporte(double importe) {
		this.importe = importe;
	}

	public int getCantidadPendiente() {
		return cantidadPendiente;
	}

	private void setCantidadPendiente(int cantidadPendiente) {
		this.cantidadPendiente = cantidadPendiente;
	}

	public String getEstadoPedido() {
		return estadoPedido;
	}

	private void setEstadoPedido(String estadoPedido) {
		this.estadoPedido = estadoPedido;
	}


	public int getCantidadEntregada() {
		return cantidadEntregada;
	}

	public void setCantidadEntregada(int cantidadEntregada) {
		this.cantidadEntregada = cantidadEntregada;
	}
	
	public void entregar () {
		int aux;
		aux = pedidoModificar();
			if ((aux <= this.cantidadPedida) && (aux <= this.cantidadPendiente)) {
					this.estadoPedido = "P";
			}
		else {
			this.estadoPedido = "E";
			}
		}
	
	public int pedidoModificar() {

		int cantidadEntregadaActual = this.cantidadPedida - this.cantidadEntregada;
		if(this.cantidadEntregada <= this.cantidadPendiente) {
			cantidadEntregadaActual = cantidadEntregadaActual + this.cantidadEntregada;
	}
		
	return cantidadEntregadaActual;
}

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}
	
}
