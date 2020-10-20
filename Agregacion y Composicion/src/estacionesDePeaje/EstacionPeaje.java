package estacionesDePeaje;

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
		
	}
	
	public double promedioDemora() {
		
	}
	
	public ArrayList<Cabina> cabinasConEfectivo(){
		
	}
}
