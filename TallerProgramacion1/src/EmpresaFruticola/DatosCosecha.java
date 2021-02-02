package EmpresaFruticola;

public class DatosCosecha {
	
	private int nroPlantacion;
	private int nroCosecha;
	private Producto producto;
	private double toneladas;
	private double hectareas;
	
	public DatosCosecha(int nplan, int ncos, Producto p, double ton, double hec) {
		
		if(nplan <=0) {
			throw new IllegalArgumentException ("El número de plantación no puede ser cero o negativo");
		} else {
		setNroPlantacion(nplan);
		}
		
		if(ncos <= 0) {
			throw new IllegalArgumentException("El número de Cosecha no puede ser cero o negativo");
		} else {
		setNroCosecha(ncos);
		}
		
		try {
		setProducto(p);
		} catch (NullPointerException npe) {
			System.out.println(" El producto no puede ser nulo");
		}
		
		if(ton <= 0) {
		throw new IllegalArgumentException ("La cantidad de toneladas no puede ser cero o negativo");
		} else {
		setToneladas(ton);
		}
		
		if(hec <= 0) {
			throw new IllegalArgumentException ("Las hectareas no pueden ser cero o negativo");
		} else {
		setHectareas(hec);
		}
	}

	public int getNroPlantacion() {
		return nroPlantacion;
	}

	private void setNroPlantacion(int nroPlantacion) {
		
		if(nroPlantacion <= 0) {
			throw new IllegalArgumentException ("El numero de plantación no puede ser cero");
		} else {
		this.nroPlantacion = nroPlantacion;
		}
	}

	public int getNroCosecha() {
		return nroCosecha;
	}

	private void setNroCosecha(int nroCosecha) {
		if(nroCosecha <= 0) {
			throw new IllegalArgumentException("El numero de cosecha no puede ser negativo o cero");
		} else {
		this.nroCosecha = nroCosecha;
		}
	}

	public Producto getProducto() {
		return producto;
	}

	private void setProducto(Producto producto) {
		
		if (producto == null) {
			throw new ArithmeticException("El producto no puede ser nulo");
		} else {
		this.producto = producto;
		}
	}

	public double getToneladas() {
		return toneladas;
	}

	private void setToneladas(double toneladas) {
		if(toneladas <= 0) {
			throw new IllegalArgumentException("La cantidad de toneladas no puede ser cero o negativo");
		} else {
		this.toneladas = toneladas;
		}
	}

	public double getHectareas() {
		return hectareas;
	}

	private void setHectareas(double hectareas) {
		if(hectareas <= 0) {
			throw new IllegalArgumentException("La cantidad de hectareas no puede ser cero o negativo");
		} else {
		this.hectareas = hectareas;
		}
	}

	@Override
	public String toString() {
		return "DatosCosecha [nroPlantacion=" + nroPlantacion + ", nroCosecha=" + nroCosecha + ", toneladas="
				+ toneladas + ", hectareas=" + hectareas + "]";
	}
	
}
