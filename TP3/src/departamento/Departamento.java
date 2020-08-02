package departamento;

public class Departamento {

	private int unidad;
	private String nombreProp;
	private String dniProp;
	private static String voto;
	
	public Departamento(int suUnidad, String suDuenio, String suDni, String voto) {
		setUnidad(suUnidad);
		setNombreProp(suDuenio);
		setDniProp(suDni);
		setVoto(voto);
	}
	
	public int getUnidad() {
		return unidad;
	}

	public void setUnidad(int unidad) {
		this.unidad = unidad;
	}

	public String getNombreProp() {
		return nombreProp;
	}

	public void setNombreProp(String nombreProp) {
		this.nombreProp = nombreProp;
	}

	public String getDniProp() {
		return dniProp;
	}

	public void setDniProp(String dniProp) {
		this.dniProp = dniProp;
	}

	public static String getVoto() {
		return voto;
	}

	public void setVoto(String voto) {
		this.voto = voto;
	}

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
	}
	
}
