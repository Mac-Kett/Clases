package restaurante;

import java.util.ArrayList;

public class Mesa {

	private int numero;
	private int capacidad;
	private boolean estaOcupada;
	private ArrayList <Pedido> pedidos;
	
	public Mesa(int num, int cap, boolean ocu) {
		setNumero(num);
		setCapacidad(cap);
		setEstaOcupada(ocu);
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public boolean isEstaOcupada() {
		return estaOcupada;
	}
	public void setEstaOcupada(boolean estaOcupada) {
		this.estaOcupada = estaOcupada;
	}
	
	public Pedido getPedido() {
		//falta
	}
	
	private void vaciarMesa() {
		this.setEstaOcupada(false);
	}
	
}
