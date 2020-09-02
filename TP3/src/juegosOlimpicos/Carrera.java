package juegosOlimpicos;

import java.lang.reflect.Array;

import trabajosPracticos.Integrante;

public class Carrera {

	private String juego;
	private int distancia;
	Atleta [] atletas;
	Atleta [] primerPuesto;
	Atleta [] segundoPuesto;
	Atleta [] tercerPuesto;
	
	public Carrera (String juego, int dist) {
		this.setJuego(juego);
		this.setDistancia(dist);
	}

	public String getJuego() {
		return juego;
	}

	public void setJuego(String juego) {
		this.juego = juego;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	
	
	public void buscarAtletaMejorTiempo () {
		Atleta competidorEncontrado = null;
		Atleta competidorAux;
		int i = 0;
		double nuevoMejorTiempo = 0;
		double aux = 5000000;

		while(competidorEncontrado == null) {
			competidorAux = this.atletas[i];
					if (competidorAux.getSegundos() <= aux) {
						competidorEncontrado = competidorAux;
						nuevoMejorTiempo = competidorEncontrado.getSegundos();
						agregarGanadores(competidorEncontrado);
					}
					else {
						i++;
					}
		}
	}
	public void buscarAtletaSegundoMejorTiempo () {
		Atleta competidorEncontrado = null;
		Atleta competidorAux;
		int i = 0;
		double nuevoMejorTiempo = 0;
		double aux = 5000000;

		while(competidorEncontrado == null) {
			competidorAux = this.atletas[i];
					if (competidorAux.getSegundos() <= aux) {
						competidorEncontrado = competidorAux;
						nuevoMejorTiempo = competidorEncontrado.getSegundos();
						agregarGanadores(competidorEncontrado);
					}
					else {
						i++;
					}
	}
	

	
	//éste va a ser el que agrega a la lista de ganadores
	private void agregarGanadores (Atleta persona) {
		int longitud = 0;
		double nuevoMejorTiempo = 500000000;

		if(persona.getSegundos() > nuevoMejorTiempo) {
			
		}
		
		
		if() {
		primerPuesto = new Atleta
		primerPuesto.add(persona);
		}
		else if () {
		segundoPuesto = new Atleta[longitud + 1];
			segundoPuesto.add(persona);
				
		}
		else if () {
		tercerPuesto = new Atleta[longitud + 1];
			tercerPuesto.add(persona);
		}		
		}
	}
	
	//Método itera por cada ganador del Array y lo imprime
	
	public void mostrarGanadores(double nuevoMejorTiempo) {
		int i = 0;
		while(i <= ganadores.length) {
			Atleta aux = ganadores[i];
		System.out.println(aux.getNombre());
		System.out.println(nuevoMejorTiempo);
		}
	}

}
