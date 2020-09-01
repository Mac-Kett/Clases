package trabajosPracticos;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Grupo {

	private String nombre;
	ArrayList <String> integrantes;
	
	public Grupo (String nom) {
		this.setNombre(nom);
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
		
		cant = this.integrantes.size();
		
		return cant;
	}
	
	public String buscarIntegrante (String nombre) {
		String integranteEncontrado = "";
		String integranteAux;
		int i = 0;
		
		while(integranteEncontrado == "" && i <= this.integrantes.size()) {
			integranteAux = this.integrantes.get(i);
					if (integranteAux.equals(nombre)) {
						integranteEncontrado = integranteAux;
					}
					else {
						i++;
					}
		}
		return integranteEncontrado;
	}
	
	
	
	public void agregarIntegrante(String nombreIntegrante) {
				
		String integrante = buscarIntegrante(nombreIntegrante);
		if (integrante != null) {
			integrantes.add(integrante);
		}
		
	}
	
	private int obtenerPosicionIntegrante (String nombreIntegrante) {
		String integranteAux = "";
		int i = 0;
		int aux = 0;
		
		while(integranteAux == null && i <= this.getCantidadIntegrantes()) {
			integranteAux = this.integrantes.get(i);
					if (integranteAux.equals(nombreIntegrante)) {
						aux = i;
					}
					else {
						i++;
					}
		}
		return aux;
	}
	
	public String obtenerIntegrante(int posicion) {
		String integranteBuscado = integrantes.get(posicion);
		return integranteBuscado;
	}
	
	public String removerIntegrante(String nombreIntegrante) {
		
			int pos = obtenerPosicionIntegrante (nombreIntegrante);
			String integrante = this.integrantes.remove(pos);
			
		return integrante;
	}
	
	private void mostrarIntegrantes() {
		System.out.println("La cantidad de integrantes es: " + this.getCantidadIntegrantes());
		for(Integrante a: Array) {
			System.out.println(a.getNombre());
		}
	}
	
	public void mostrar() {
		System.out.println("El nombre del grupo es: " + this.nombre)
		System.out.println(this.mostrarIntegrantes());
	}
	
	public void vaciar() {
		for(Integrante a: Array) {
			this.removerIntegrante(a);
		}
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
