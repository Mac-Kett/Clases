package estacionesDePeaje;

import java.util.ArrayList;

public class EstacionPeaje {

	private String id;
	private String descripcion;
	
	public EstacionPeaje(String id, String descripcion) {
		setId(id);
		setDescripcion(descripcion);
	}
	
	public String getId() {
		return id;
	}
	private void setId(String id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	private double dameHoraActual() {
		
	}
	
	public double cobrar(Vehiculo v) {
		double tarifa = 0;
		Cabina cabinaEncontrada = null;
		Vehiculo vehiculo;
		Cabina cabina;
		TipoVehiculo tipo;
		int i = 0;
		
		while(cabinaEncontrada == null && i < this.cabinas().size()) {
			cabina = this.cabinas().get(i);
			
			if(vehiculo != null) {
				tipo = vehiculo.getTipo();
				tarifa = vehiculo.costo(vehiculo);
				
			}
			else {
				i++;
			}
		}
		
		return tarifa;
	}
	
	public double promedioDemora() {
		
	}
	
	public ArrayList<Cabina> cabinasConEfectivo(){
		int descuento;
		ArrayList<Cabina> cabinasEfectivo = new ArrayList<Cabina>();
		
		for(Cabina c: this.cabinas) {
			descuento = c.getMedioDePago().getDescuento();
			
			if(descuento == 0) {
				cabinasEfectivo.add(c);
			}
		}
		return cabinasEfectivo;
	}
}
