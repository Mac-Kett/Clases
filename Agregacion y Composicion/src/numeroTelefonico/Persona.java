package numeroTelefonico;

import java.util.ArrayList;

public class Persona {

	private String nombre;
	private String apellido;
	private ArrayList <NumeroTelefonico> telefonos;
	private ArrayList <Email> emails;
	
	public Persona(String nom, String ap) {
		setNombre(nom);
		setApellido(ap);
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	private void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void mostrarTodo() {
		
		System.out.println(this.nombre + ", " this.apellido);
//Mostrar todos los teléfonos
		for(NumeroTelefonico nt: this.telefonos) {
	System.out.println(nt.getValor());
		}
//Mostrar todos los mails
		for(Email e: this.emails) {
	System.out.println(e.getValor());
		}
	}

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
