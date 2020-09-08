package instituto;

public class Comision {

	private Alumno alumnos[];
	private char presentismo[];
	public static MINIMO_PRESENTISMO;
	public static PORCENTAJE_RENDIR_FINAL;

	
	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public char[] getPresentismo() {
		return presentismo;
	}

	public void setPresentismo(char[] presentismo) {
		this.presentismo = presentismo;
	}

	public static void getMINIMO_PRESENTISMO() {
		return MINIMO_PRESENTISMO;
	}

	public static void setMINIMO_PRESENTISMO(void mINIMO_PRESENTISMO) {
		MINIMO_PRESENTISMO = mINIMO_PRESENTISMO;
	}

	public static void getPORCENTAJE_RENDIR_FINAL() {
		return PORCENTAJE_RENDIR_FINAL;
	}

	public static void setPORCENTAJE_RENDIR_FINAL(void pORCENTAJE_RENDIR_FINAL) {
		PORCENTAJE_RENDIR_FINAL = pORCENTAJE_RENDIR_FINAL;
	}

	
	
	public void mostrarAlumnosHabilitadosParaRendirFinal() {
		int cantidadAlumnos;
		double presentismo;
		
		cantidadAlumnos = this.presentismo.length;
		for(int a = 0, a < cantidadAlumnos, a++) {
			presentismo = calcularPresentismo(a);
			if(presentismo >= MINIMO_PRESENTISMO) {
				System.out.println(this.alumnos.get[a].getNombre() + " " + presentismo);
			}
		}
	}
	
	public double obtenerPromedioDeEdadDeAlumnosInhabilitados() {
		double prom;
		int cantAlumnos;
		double asistenciaAlumno;
		
		int aux = 0;
		int contadorAlumnos = 0;
		cantAlumnos = this.presentismo.length;
		
		for(int i = 0, cantAlumnos, i++) {
			asistenciaAlumno = cancularPorcentajeDeAsistencia(i);
			if(asistenciaAlumno < PORCENTAJE_RENDIR_FINAL) {
				contadorAlumnos = contadorAlumnos + this.alumnos[i].getEdad();
				aux++;
			}
			if(aux > 0) {
				prom = contadorAlumnos / aux;
				return prom;
			}
		}
	}
	
	public void mostrarClasesConPresentismo() {
		
		int presente = 0;
		double porcentaje = 0;
		
		for(int c = 0, c < this.presentismo[0].length, c++) {
			for(int f = 0, f < this.presentismo.length, f++) {
				char valor = this.presentismo[f][c];
				if(valor == "P" || valor == "T") {
					presente++;
				}
			}
			
			porcentaje = presente / this.presentismo.length
			System.out.println( "Clase: " + (c + 1) ": " + porcentaje);
		}
		
	}
	
	public int obtenerPorcentajeAsistenciaPerfecta () {
		int cantClases = this.presentismo[0].length;
		int contador = 0;
		
		for(int i = 0, i < cantClases, i++) {
			if (this.esClaseConAsistenciaPerfecta(i) == true) {
				contador++;
			}
		}
		
		return contador;
	}
	
	
	private boolean enClaseConAsistenciaPerfecta (int numClase) {
		int cantAlumnos = 0;
		boolean presentismoPerfecto = true;
		
		int i = 0;
		cantAlumnos = this.presentismo.length;
		
		while ((presentismoPerfecto == true) && (i < cantAlumnos)) {
			if(presentismo[i][numClase] == "A") {
				presentismoPerfecto = false;
			}
			else {
				i++;
			}
		}
		
		return presentismoPerfecto;
	}
	
	
	public int totalLlegadasTarde() {
		int contador = 0;
		char presente;
		int cantAlumnos = this.presentismo.length;
		int cantClases = this.presentismo[0].length;
		
		for(i = 0, i < cantAlumnos, i++) {
			for (int j = 0, i < cantClases, j++) {
				presente = this.presentismo[i][j];
				if(presente == "T") {
					contador++;
				}
			}
		}
		
		return contador;
	}
	
	
	private double calcularPorcentajeDeAsistencia (int numAlumnos) {
		
		int cantClases;
		double contador;
		double porcentajeAsistencia;
		
		cantClases = this.presentismo[numAlumno].length;
		contador = cantClases;
		
		for(int i = 0, cantClases, i++) {
			if(this.presentismo[numAlumno][i] == "A") {
				contador = contador - 1;
			}
			else if(this.presentismo[numAlumno][i] == "T") {
				contador = contador - 0.5;
			}
		}
		
		porcentajeAsistencia = (contador/cantClases) * 100;
		return porcentajeAsistencia;
		
	}
	
}
