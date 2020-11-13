package mundoMarino;

public enum Alimento {

		CALAMARES,
		PULPOS,
		CANGREJOS
		
		int stock;
	
	private Alimento(int stock) {
		setStock(stock);
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	new CALAMARES (50);
	new PULPOS (30);
	new CANGREJOS (25);
}
