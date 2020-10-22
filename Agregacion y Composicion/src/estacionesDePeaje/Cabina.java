package estacionesDePeaje;

import java.util.ArrayList;

public class Cabina {

	private String id;
	private boolean promocionada;
	private MedioDePago medioPago;
	private ArrayList<Empleado> empleados;
	
	public Cabina(String id, MedioDePago medioPago) {
		setId(id);
		setPromocionada(false);
		setMedioPago(medioPago);
	}
	
	public String getId() {
		return id;
	}
	private void setId(String id) {
		this.id = id;
	}
	public boolean isPromocionada() {
		return promocionada;
	}
	private void setPromocionada(boolean promocionada) {
		this.promocionada = promocionada;
	}

	public MedioDePago getMedioPago() {
		return medioPago;
	}

	private void setMedioPago(MedioDePago medioPago) {
		this.medioPago = medioPago;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	private void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
}
