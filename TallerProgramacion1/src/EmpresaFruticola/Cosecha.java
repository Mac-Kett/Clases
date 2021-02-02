package EmpresaFruticola;

public class Cosecha {

	private int nro;
	private Producto producto;
	private double toneladas;
	private double hectareas;
	
	public Cosecha(DatosCosecha datos) {
		
		if(datos.getNroCosecha() == 0) {
			throw new IllegalArgumentException ("El número de hectárea no puede ser nulo.");
		}
		else{
		setNro(datos.getNroCosecha());
		}
		
		
		try {
		setProducto(datos.getProducto());
		} catch(NullPointerException npe) {
			System.out.println("El producto no puede ser nulo.");
		}
		
		
		if (datos.getToneladas() <= 0) {
		throw new IllegalArgumentException("La cantidad de toneladas no puede ser menor a cero.");
		}
		else {
			setToneladas(datos.getToneladas());
		}
		
		if(datos.getHectareas() <= 0) {
			throw new IllegalArgumentException("La cantidad de hectareas no puede ser menor a cero.");
		} else {
		setHectareas(datos.getHectareas());
		}
	}

	public int getNro() {
		return nro;
	}

	private void setNro(int nro) {
		if(nro <= 0) {
			throw new IllegalArgumentException ("El número de hectárea no puede ser nulo.");
		}
		else{
			this.nro = nro;

		}
		
	}

	public Producto getProducto() {
		return producto;
	}

	private void setProducto(Producto producto) {
		if(producto == null) {
			throw new NullPointerException ("El producto no puede ser nulo.");
		}
		else{
		this.producto = producto;
		}
	}

	public double getToneladas() {
		return toneladas;
	}

	private void setToneladas(double toneladas) {
		if(toneladas <= 0) {
			throw new IllegalArgumentException ("El número de toneladas no puede ser nulo.");
		}
		else{
		this.toneladas = toneladas;
		}
	}

	public double getHectareas() {
		return hectareas;
	}

	private void setHectareas(double hectareas) {
		if(hectareas <= 0) {
			throw new IllegalArgumentException ("Las hectáreas no pueden ser nulas.");
		}
		else{
		this.hectareas = hectareas;
		}
	}

	@Override
	public String toString() {
		return "Cosecha [nro=" + nro + ", toneladas=" + toneladas + ", hectareas=" + hectareas + "]";
	}
	
	public double obtenerRendimiento() {
		//TODO
		double resultado = 0;
		try {
		resultado = this.toneladas/this.hectareas;
		} catch (ArithmeticException ae) {
			System.out.println("Ésta división no está permitida");
		}
		return resultado;
	}
	
	public void imprimirResultadoCosecha() {
		//TODO
		System.out.println("Los resultados de la cosecha fueron: "+ obtenerRendimiento());
	}
	
}
