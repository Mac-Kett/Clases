package ejercicio4;

public class Cafetera {

	private int capacidadMaxima;
	private int cantidadActual;
	
	public Cafetera() {
		setCapacidadMaxima(1000);
		setCantidadActual(0);
	}
	
	public Cafetera(int capacidadMax) {
		setCantidadActual(0);
		setCapacidadMaxima(capacidadMax);
	}
	
	public Cafetera(int capMax, int cantAct) {
		setCapacidadMaxima(capMax);
		setCantidadActual(cantAct);
	}
	
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		if(capacidadMaxima<250) {
			this.capacidadMaxima=250;
		}
	}


	public int getCantidadActual() {
		return cantidadActual;
	}


	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
		if(cantidadActual<0) {
			this.cantidadActual=0;
		}
		else if(cantidadActual>this.capacidadMaxima)
		{this.cantidadActual=this.capacidadMaxima;
		}
	}
	
	public void llenar() {
		this.cantidadActual=this.capacidadMaxima;
	}
	
	public void servirTaza(int mililitros) {
		
		int sobrante = this.cantidadActual - mililitros;
		if(sobrante >= 0) {
			this.cantidadActual = sobrante;
		}
		else {
			vaciar();
			
		}
	}
	
	public void vaciar() {
		this.cantidadActual = 0;
	}
	
	public int agregarCafe(int cafeAniadido) {
		int sobrante =0;
		
		int capacidadTotal = this.cantidadActual + cafeAniadido;
		
		
		if(capacidadTotal > this.capacidadMaxima) {
			sobrante = capacidadTotal - this.capacidadMaxima;
			setCantidadActual(capacidadMaxima);
		} else {
			sobrante = 0;
			setCantidadActual(capacidadTotal);
		}
	
		return sobrante;
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
