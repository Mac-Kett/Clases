package trabajosPracticos;

import java.lang.reflect.Array;

public class Grupo {

	private String nombre;
	Integrante [] integrantes;
	
	public Grupo (String nom) {
		this.nombre(nom);
	}
	
	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadIntegrantes() 
	{
		int cant = 0;
		
		cant = this.integrantes.length;
		
		return cant;
	}
	
	public Integrante buscarIntegrante (String nombre) {
		Integrante integranteEncontrado = null;
		Integrante integranteAux;
		int i = 0;
		
		while(integranteEncontrado == null && i <= this.getCantidadIntegrantes) {
			integranteAux = this.integrantes[i];
					if (integranteAux.getNombre() == nombreIntegrante) {
						integranteEncontrado = integranteAux;
					}
					else {
						i++;
					}
		}
		return integranteEncontrado;
	}
	
	private Array ampliarArray () {
		int tamanio;
		
		tamanio = this.integrantes.length;
		Integrante [] misIntegrantes = new [tamanio + 1];
		for (int i = 0, tamanio - 1, 1) {
			misIntegrantes[i] = this.integrantes[i];
		}
		
		return misIntegrantes;
	}
	
	public void agregarIntegrante(String nombreIntegrante) {
		
		Array Integrante[] miArray;
		
		Integrante integrante = buscarIntegrante(nombreIntegrante);
		if (integrante != null) {
			miArray = ampliarArray();
			miArray.add[integrante];
		}
		
	}
	
	private int obtenerPosicionIntegrante (String nombreIntegrante) {
		Integrante integranteAux == null;
		int i = 0;
		int aux;
		
		while(integranteAux == null && i <= this.getCantidadIntegrantes) {
			integranteAux = this.integrantes[i];
					if (integranteAux.getNombre() == nombreIntegrante) {
						aux = i;
					}
					else {
						i++;
					}
		}
		return aux;
	}
	
	public String obtenerIntegrante(int posicion) {
		
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
