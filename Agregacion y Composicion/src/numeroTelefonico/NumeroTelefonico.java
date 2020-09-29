package numeroTelefonico;

public class NumeroTelefonico {

	private int caracteristica;
	private int numeroDeAbonado;
	private int codigoDePais;
	private TipoDeLinea tipoDeLinea;
	
	public NumeroTelefonico (int caract, int numAbonado, int cod, TipoDeLinea linea) {
		setCaracteristica(caracteristica);
		setNumeroDeAbonado(numAbonado);
		setCodigoDePais(cod);
		setTipoDeLinea(linea);
	}
	
	
	public int getCaracteristica() {
		return caracteristica;
	}


	private void setCaracteristica(int caracteristica) {
		int caractlength = String.valueOf(caracteristica).length();
		if((caractlength > 0) && (caractlength < 5)) {
		this.caracteristica = caracteristica;
		}
	}


	public int getNumeroDeAbonado() {
		return numeroDeAbonado;
	}


	private void setNumeroDeAbonado(int numeroDeAbonado) {
		int numlength = String.valueOf(caracteristica).length();
		if((numlength > 0) && (numlength < 9)) {
		this.numeroDeAbonado = numeroDeAbonado;
	}
	}


	public int getCodigoDePais() {
		return codigoDePais;
	}


	private void setCodigoDePais(int codigoDePais) {
		int codlength = String.valueOf(caracteristica).length();
		if((codlength > 0) && (codlength < 4)) {
		this.codigoDePais = codigoDePais;
		}
	}


	public TipoDeLinea getTipoDeLinea() {
		return tipoDeLinea;
	}


	private void setTipoDeLinea(TipoDeLinea tipoDeLinea) {
		this.tipoDeLinea = tipoDeLinea;
	}

	public String getValor () {
		String valor;
		
		valor = "+" + this.getCodigoDePais() + this.getCaracteristica() + this.getNumeroDeAbonado();
		
		return valor;
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
