package automovil;

public class Automovil {

	private String marca;
	private String modelo;
	private String patente;
	private double CAPACIDADTANQUE;
	private double cantidadDeCombustible;
	private double rendimientoPorLitro;
	
	public Automovil (String marca, String modelo, String patente, double capacidadCombustible) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPatente(patente);
		this.setCantidadDeCombustible(capacidadCombustible);
	}
	
	public String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPatente() {
		return patente;
	}

	private void setPatente(String patente) {
		this.patente = patente;
	}

	public double getCapacidadTanque() {
		return CAPACIDADTANQUE;
	}

	private void setCapacidadTanque(double capacidadTanque) {
		Automovil.CAPACIDADTANQUE = capacidadTanque;
	}

	public double getCantidadDeCombustible() {
		return cantidadDeCombustible;
	}

	private void setCantidadDeCombustible(double cantidadDeCombustible) {
		this.cantidadDeCombustible = cantidadDeCombustible;
	}

	public double getRendimientoPorLitro() {
		return rendimientoPorLitro;
	}

	private void setRendimientoPorLitro(double rendimientoPorLitro) {
		this.rendimientoPorLitro = rendimientoPorLitro;
	}
	
	public double viajar(double kilometros) {
		
	}
	
	private double consumirCombustible(double km) {
		
	}
	
	public boolean cargarCombustible(double cant) {
		double espacioActual = espacioDisponible();
		boolean pudo = false;
		
		if ((cant <= 0) && (cant > espacioActual)) {
			cant = cant + this.cantidadDeCombustible;
			setCantidadDeCombustible(cant);
			pudo = true;
		}
		return pudo;
	}
	
	private double espacioDisponible () {
		double cuantoQueda;
		
		cuantoQueda = this.CAPACIDADTANQUE - this.cantidadDeCombustible;
		
		return cuantoQueda;
	}
	
	public boolean pocoCombustible() {
		boolean quedaPoco = false;
		double quincePorciento = 15 * this.CAPACIDADTANQUE / 100;
		
		if(this.cantidadDeCombustible < quincePorciento) {
			quedaPoco = true;
		}
		return quedaPoco;
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", capacidadTanque="
				+ capacidadTanque + ", cantidadDeCombustible=" + cantidadDeCombustible + ", rendimientoPorLitro="
				+ rendimientoPorLitro + "]";
	}

}
