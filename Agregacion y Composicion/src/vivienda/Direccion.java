package vivienda;

public class Direccion {

	private String calle;
	private String altura;
	private int piso;
	private String departamento;
	
	public Direccion(String calle, String altura, int piso, String depto) {
		setCalle(calle);
		setAltura(altura);
		setPiso(piso);
		setDepartamento(depto);
	}
	
	public Direccion(int piso, String depto) {
		setPiso(piso);
		setDepartamento(depto);
	}
	
	public String getCalle() {
		return calle;
	}
	private void setCalle(String calle) {
		this.calle = calle;
	}
	public String getAltura() {
		return altura;
	}
	private void setAltura(String altura) {
		this.altura = altura;
	}
	public int getPiso() {
		return piso;
	}
	private void setPiso(int piso) {
		this.piso = piso;
	}
	public String getDepartamento() {
		return departamento;
	}
	private void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
