package agenda;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Persona> personas = new ArrayList();
	
	
public boolean quitarPersona (String dni) {
		
		Persona persEncontrada = buscarPersona(dni);
		
		boolean aux = false;
		
		if(persEncontrada != null) {
			personas.remove(persEncontrada);
			aux = true;
		}
		return aux;
	}

	public boolean agregarPersona (String nom, String ap, String dni, String tel, String mail) {
		
		Persona persEncontrada = buscarPersona(dni);
		
		boolean aux = false;
		
		if(persEncontrada == null) {
			persEncontrada = new Persona(nom, ap, dni, tel, mail);
			personas.add(persEncontrada);
			aux = true;
		}
		return aux;
	}
	
	public Persona buscarPersona(String dni) {
		Persona personaEncontrada = null;
		int contador = 0;
		
		while((contador < personas.size()) && (personaEncontrada == null)) {
			if(this.personas.get(contador).getDni().equals(dni)) {
				personaEncontrada = this.personas.get(contador);
			}
			else {
				contador ++;
			}
		}
		return personaEncontrada;
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}

