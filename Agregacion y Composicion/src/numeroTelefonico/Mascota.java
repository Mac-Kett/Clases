package numeroTelefonico;
public class Mascota {

	private String nombre;
	private String tipo;
	
	public Mascota (String nom, String tipo) {
		setNombre(nom);
		setTipo(tipo);
	}
	
	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	private void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void mostrarDatos() {
		System.out.println(nombre + tipo);
	}

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
