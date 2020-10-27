package puerto;

public abstract class Embarcacion {

	private String matricula;
	private int eslora;
	private int anio;
	private String duenio;
	private double valorBase;
	private double valorAdicional;
	
	public Embarcacion(String matri, int eslora, int anio, String duenio. double base, double adicional) {
		setMatricula(matri);
		setEslora(eslora);
		setAnio(anio);
		setDuenio(duenio);
		setValorBase(base);
		setValorAdicional(adicional);
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getEslora() {
		return eslora;
	}
	public void setEslora(int eslora) {
		this.eslora = eslora;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getDuenio() {
		return duenio;
	}
	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}
	public double getValorBase() {
		return valorBase;
	}
	public void setValorBase(double valorBase) {
		this.valorBase = valorBase;
	}
	public double getValorAdicional() {
		return valorAdicional;
	}
	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public double calcularValorBase() {
		return this.valorBase * eslora;
	}
	
	public abstract void calcularAdicional();
	
	public double getValorAdicional() {
		//falta
	}
	
}
