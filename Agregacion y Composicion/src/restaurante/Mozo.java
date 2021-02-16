package restaurante;

public class Mozo extends Empleado{

	private Categoria categoria;
	
	public Mozo(Categoria cat) {
		super();
		setCategoria(cat);
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
