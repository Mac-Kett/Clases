package gastos_anuales;

public class Rubro {

	private final int TOTAL_MESES = 12;
	private String nombre;
	private double[][] gastosPorMes;
	private double importes[];	
	
	public Rubro(String nombre) {
		this.setNombre(nombre);
		inicializarGastos();
	}
	
	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void inicializarGastos() {
		this.gastosPorMes = new double[TOTAL_MESES][this.importes.length];

	}
	
	private void agregarGasto(Mes mesAux, double importe) {
		
		//recorrer primera posici�n de matriz con While
		//hasta que coincida con el mes par�metro. Esa posici�n de i
		//va a ser mi par�metro para buscar con un while[i] con un if
		//qu� posici�n == null, entonces asignarle par�metro importe
		
		int i = 0;
		int j = 0;
		double posAux = 0;
		double lugarVacio;
		
		while(i < this.gastosPorMes.length && posAux == 0) {
		posAux = this.gastosPorMes[i];
			if(posAux == mesAux) {
				
			while(j < this.gastosPorMes[i].length && lugarVacio != 0) {
				lugarVacio = this.gastosPorMes[i][j];
				
				if() {
					
				}
				else {
					j++;
				}
			}
		}
			
			}
			
	}
	
	private double getTotalGastos(Mes ***) {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente

	}

}
