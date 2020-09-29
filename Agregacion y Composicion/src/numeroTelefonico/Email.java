package numeroTelefonico;

public class Email {

	private String cuenta;
	private String dominio;
	
	public Email (String email) {
		separar(email);
	}
	
	
	
	public String getCuenta() {
		return cuenta;
	}



	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}



	public String getDominio() {
		return dominio;
	}



	private void setDominio(String dominio) {
		this.dominio = dominio;
	}



	private void separar(String email) {
		
		String[] partes = email.split("@");
		String cuenta = partes[0];
		String dominio = partes[1];
				
		setCuenta(cuenta);
		setDominio(dominio);
		
	}
	
	public String getValor() {
		String reconstruido = this.cuenta + "@" + this.dominio;
		return reconstruido;
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
