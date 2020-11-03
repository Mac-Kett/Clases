package estacionesDePeaje;

import java.util.ArrayList;

public class EstacionPeaje {

	private String id;
	private String descripcion;
	private ArrayList<Cabina> cabinas;
	
	public EstacionPeaje(String id, String descripcion) {
		setId(id);
		setDescripcion(descripcion);
	}
	
	public ArrayList<Cabina> getCabinas() {
		return cabinas;
	}

	public void setCabinas(ArrayList<Cabina> cabinas) {
		this.cabinas = cabinas;
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
	
	public double cobrar(Vehiculo v) {
		double tarifa = 0;
		Cabina cabinaEncontrada = null;
		Vehiculo vehiculo;
		Cabina cabina;
		TipoVehiculo tipo;
		int i = 0;
		
		while(cabinaEncontrada == null && i < this.cabinas.size()) {
			cabina = this.cabinas.get(i);
			
			if(vehiculo != null) {
				tipo = vehiculo.getTipo();
				tarifa = vehiculo.TipoVehiculo.getTarifa(vehiculo);
				
			}
			else {
				i++;
			}
		}
		
		return tarifa;
	}
	
	public ArrayList<Cabina> cabinasConEfectivo(){
		ArrayList<Cabina> cabinasEfectivo = null;
		MedioDePago medioP;
		
		for(Cabina c: this.cabinas) {
			medioP = c.getMedioPago();
					
				if(medioP instanceof Efectivo) {
					if(c != null) {
					cabinasEfectivo.add(c);
					}
				}
		}
		return cabinasEfectivo;
	}
	
	public double promedioDemora() {
		int contador = 0;
		int sumador = 0;
		
		for(Cabina c: this.cabinas) {
			MediosElectronicos medioPago = c.getMedioPago();
			
			if(medioPago instanceof MediosElectronicos) {
				sumador = sumador + medioPago.getDemora();
				contador++;
			}
		}
		
		return sumador / contador;
	}
	
	public static double dameHoraActual() {
		return 0;
		//Lo hardcodeé. Falta implementar
	}
	
}
