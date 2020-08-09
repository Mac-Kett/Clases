package cine;

import java.util.ArrayList;

public class Cine {

	private String nombre;
	ArrayList <Entrada> entradas;
	ArrayList <Funcion> funciones;
	
	public ArrayList<Entrada> getEntradas() {
		return entradas;
	}

	public void setEntradas(ArrayList<Entrada> entradas) {
		this.entradas = entradas;
	}

	public void setFunciones(ArrayList<Funcion> funciones) {
		this.funciones = funciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Entrada> getFunciones() {
		return entradas;
	}

	public boolean procesarEntradas (ArrayList <Entrada> entradas) {
		boolean pudo = false;
		
		
		return pudo;
	}
	
	
	public Funcion buscarFuncion (String dia, String horaInicio) {
		Funcion funcionBuscada = null;
		int i = 0;
		
		while (i < funciones.size() && funcionBuscada == null) {
			if(funciones.get(i).getDia().equals(dia)
				&& funciones.get(i).getHoraInicio()== horaInicio) {
				
				funcionBuscada = funciones.get(i);
			}
			else {
				i++;
			}
		}
		return funcionBuscada;
	}
	
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}

