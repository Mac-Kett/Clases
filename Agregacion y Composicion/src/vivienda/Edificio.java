package vivienda;

import java.util.ArrayList;

public class Edificio {

	private ArrayList <Vivienda> viviendas;
	private ArrayList <Mueble> muebles;
	private ArrayList <Persona> personas;
	
	public ArrayList<Vivienda> getViviendas() {
		return viviendas;
	}

	private void setViviendas(ArrayList<Vivienda> viviendas) {
		this.viviendas = viviendas;
	}

	public ArrayList<Mueble> getMuebles() {
		return muebles;
	}

	private void setMuebles(ArrayList<Mueble> muebles) {
		this.muebles = muebles;
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	private void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	public void realizarMudanza(int pisoOriginal, String deptoOriginal, int pisoNuevo, String deptoNuevo) {
		Vivienda viviendaAntigua = buscarVivienda(pisoOriginal, deptoOriginal);
		Vivienda viviendaNueva = buscarVivienda(pisoNuevo, deptoNuevo);
		
		if(viviendaAntigua != null && viviendaNueva != null){
		mudarMuebles (viviendaAntigua, viviendaNueva);
		mudarPersonas (viviendaAntigua, viviendaNueva);
		viviendaAntigua.vaciarDepartamento();
		}
		
	}


	private Vivienda buscarVivienda(int piso, String depto) {
		Vivienda viviendaBuscada = null;
		Vivienda viviendaAux;
		int index = 0;
		
		while (viviendaBuscada == null && index < this.viviendas.size()){
			viviendaAux = this.viviendas.get(index);
			if(viviendaAux.getDireccion().getPiso() == piso 
			&& viviendaAux.getDireccion().getDepartamento().equals(depto)){
				viviendaBuscada = viviendaAux;
			}
			else {
				index++;
			}
		}
		
		return viviendaBuscada;
	}
	
	private void mudarMuebles(Vivienda viviendaAntigua, Vivienda viviendaNueva) {
		for (int i = 0; i < viviendaAntigua.getMueblesCasa().size(); i++){
			Mueble miMueble = viviendaAntigua.getMueblesCasa().remove(i);
			viviendaNueva.agregarMueble(miMueble);
		}
	}
	
	private void mudarPersonas (Vivienda viviendaAntigua, Vivienda viviendaNueva) {
		for (int i = 0; i < viviendaAntigua.getMueblesCasa().size(); i++){
			Persona miPersona = viviendaAntigua.getPersonasViviendo().remove(i);
			viviendaNueva.agregarPersona(miPersona);
		}
	}
	
	@Override
	public String toString() {
		return "Edificio [viviendas=" + viviendas + "]";
	}
	
}
