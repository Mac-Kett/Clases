package estacionesDePeaje;

import java.util.ArrayList;

public class Cabina {

	private String id;
	private MedioDePago medioPago;
	private ArrayList<Empleado> empleados;
	
	public Cabina(String id, MedioDePago medioPago) {
		setId(id);
		setMedioPago(medioPago);
	}
	
	public String getId() {
		return id;
	}
	private void setId(String id) {
		this.id = id;
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
	
	public double cobrar(Vehiculo v) {
		double costoFinal;
		
		costoFinal = v.getTarifa();
		
		if(esHoraPico()) {
			costoFinal = costoFinal + costoFinal * 8 / 100;
		}
		
		return costoFinal - costoFinal * this.medioPago.getDescuento() / 100;
	}
	
	private boolean esHoraPico() {
		double horaActual = EstacionPeaje.dameHoraActual();
		
		return horaActual >= 6 && horaActual <= 10 || horaActual >= 17 && horaActual <= 20;
	}
	
}
