package EmpresaFruticola;

public class EmpresaFruticola {

	private String nombre;
	private ArrayList<DatosCosecha> datosCosecha;
	private ArrayList<Plantacion> plantaciones;
	private int[][] contCosechas;
	private double[][] toneladasAcumuladas;
	
	public EmpresaFruticola(String nom) {
		setNombre(nom);
	}
	
	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
