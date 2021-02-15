package restaurante;

public class Chef extends Empleado{

	private String titulo;

	public Chef(String titulo) {
		super();
		setTitulo(titulo);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
}
