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
		this.importes = new double[TOTAL_MESES];

	}
	
	public void agregarGasto(Mes mesAux, double importe) {
		
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
	
	private double getTotalGastos(Mes mes) {
		//llama al constrcutor de GastosAnuales
		
		int index = 0;
		Mes mesEncontrado = null;
		Mes auxMes;
		double auxiliarGastos = 0;
		double totalGastos = 0;
		
		while(index < this.gastosPorMes.length && mesEncontrado == null) {
			auxMes = this.gastosPorMes[index];
			if(auxMes == mes) {
				mesEncontrado = auxMes;
				for(int i = 0; i < this.gastosPorMes[index].length; i++) {
					auxiliarGastos = this.gastosPorMes[index][i];
					
					totalGastos = totalGastos + auxiliarGastos;
				}
			}
		}
		
		return totalGastos;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
