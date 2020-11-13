package mundoMarino;

public enum Habilidad {
	
	TRUCO1,
	TRUCO2;
	
	int cantAlimento;
	
	private Habilidad(int cant) {
		setCantAlimento(cant);
	}

	public int getCantAlimento() {
		return cantAlimento;
	}

	public void setCantAlimento(int cantAlimento) {
		this.cantAlimento = cantAlimento;
	}
	
	
}
