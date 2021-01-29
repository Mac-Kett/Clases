package mundoMarino;

public class Entrenador extends PersonalParque{
	
	private String nombre;
	private int experiencia;
	
	
	
	public Entrenador(String nombre, int experiencia) {
		super();
		this.nombre = nombre;
		this.experiencia = experiencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public double getHoraIngreso(double hora) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}
	
	@Override
	public double getHoraSalida() {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}
	
	public boolean consultarCantAlimentos(Animal a){
		int cantAlimento = a.getAlimento();
		for(Habilidad h: a.habilidades) {
			int stock = h.getCantAlimento();
			if(cantAlimento < stock) {
			pedirTruco(a, h);
		}
		}
		
		
	}
	
	
	public int pedirTruco(Animal a, Habilidad h){
		a.
	}
	
	private void quitarDeStock() {
		//falta
	}
	
	public void mostrarstock() {
		//falta
	}
}
