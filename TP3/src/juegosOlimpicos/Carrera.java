package juegosOlimpicos;

import java.lang.reflect.Array;

import trabajosPracticos.Integrante;

public class Carrera {

	private String juego;
	private int distancia;
	Atleta [] atletas;
	
	public Carrera (String juego, int dist) {
		this.setJuego(juego);
		this.setDistancia(dist);
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

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
	
	
	
	public Atleta buscarAtleta (String nombre) {
		Atleta competidorEncontrado = null;
		Atleta competidorAux;
		int i = 0;
		
		while(competidorEncontrado == null) {
			competidorAux = this.atletas[i];
					if (competidorAux.getNombre() == nombre) {
						competidorEncontrado = competidorAux;
					}
					else {
						i++;
					}
		}
		return competidorEncontrado;
	}
	
	
	
	
	private Array ampliarArray () {
		int tamanio;
		
		tamanio = this.atletas.length;
		Atleta [] misAtletas = new [tamanio + 1];
		for (int i = 0, tamanio - 1, 1) {
			misAtletas[i] = this.atletas[i];
		}
		
		return misIntegrantes;
	}
	
	
	public void agregarCompetidor(String nombre) {
		
		Atleta[] arrAuxiliar;
		
		Atleta atleta = buscarAtleta(nombre);
		if (atleta != null) {
			arrAuxiliar = ampliarArray();
			arrAuxiliar.add[atleta];
		}
		
	}




}
