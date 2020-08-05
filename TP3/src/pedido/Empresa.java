package pedido;

import java.util.ArrayList;

import practicaParcial.Persona;

public class Empresa {

	private ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
	private ArrayList<Pedido> listaPendientes = new ArrayList<Pedido>();
	
	public Pedido buscarPedido(int numPedido) {
		Pedido pedidoQueMeDevuelve = null;
		int aux=0;
		boolean existeMiPedido = false;
		while (aux<this.listaPedidos.size() && !existeMiPedido) {
		if (this.listaPedidos.get(aux).getNumeroPedido()==(numPedido)) {
		pedidoQueMeDevuelve = this.listaPedidos.get(aux);
		existeMiPedido = true;
		} else {
		aux++;
		}
		}
		return pedidoQueMeDevuelve;
		} 

	public boolean ingresarPedido(int numPed, int codigo, int cant, double importe, int pend, String estado, int entregado) {
		boolean loLogro = false;
		Pedido pedidoNuevo = null;
		pedidoNuevo = buscarPedido(numPed);
		if (pedidoNuevo==null) {
		pedidoNuevo = new Pedido (numPed, codigo, cant, importe, pend, estado, entregado);
		this.listaPedidos.add(pedidoNuevo);
		loLogro = true;
		}
		return loLogro; 
		}

	public boolean agregaObjetosAListaPedidosPendientes (int numPedido) {
		
		//agregar sólo si cumple con algunas condiciones
		
		
		boolean loAgrego = false;
		Pedido miPedidoNuevo = null;
		
		miPedidoNuevo = buscarPedido(numPedido);
		miPedidoNuevo = new Pedido();
		if (miPedidoNuevo==null) && (miPedidoNuevo.getCantidadPendiente()<miPedidoNuevo.getCantidadEntregada()) {
		this.listaPendientes.add(miPedidoNuevo);
		miPedidoNuevo.getEstadoPedido()
		loAgrego = true;
		}
		
		return loAgrego;
}
	
	public Pedido pedidoImporteMayor(ArrayList listaPedidos)) {
		//definir num 0
		//definir int elMayor
		//for each para recorrerlos por su monto
		//if es mayor a un num muy chico, entonces es el nuevo más grande
		//llamar al método buscar pedido, le tengo que pasar un num y me devuelve un objeto
		
		double aux = 0;
		
		for (double importe: listaPedidos) {
			if(importe > aux) {
				aux = importe;
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
