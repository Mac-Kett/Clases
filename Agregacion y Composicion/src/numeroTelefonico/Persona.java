package numeroTelefonico;

import java.util.ArrayList;

public class Persona {

	private String nombre;
	private String apellido;
	private ArrayList <NumeroTelefonico> telefonos;
	private ArrayList <Email> emails;
	private ArrayList <Mascota> mascotas;
	
	public Persona(String nom, String ap, String mail, String mascota, String tipo, int caract, int num, int codigo, TipoDeLinea linea) {
		setNombre(nom);
		setApellido(ap);
		agregarEmail(mail);
		agregarMascotas(mascota, tipo);
		agregarTelefonos(caract, num, codigo, linea);
		
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
		
//Mostrar todos los teléfonos------------------------------------------------------------------------
		for(NumeroTelefonico nt: this.telefonos) {
	System.out.println(nt.getValor());
		}
		
//Mostrar todos los mails----------------------------------------------------------------------------
		for(Email e: this.emails) {
	System.out.println(e.getValor());
		}
	}
	
	public void agregarEmail(String mail) {
		Email email = new Email(mail);
		this.emails.add(email);
		
	}
	
	public void agregarMascotas(String mascota, String tipo) {
		Mascota miMascota = new Mascota(mascota, tipo);
		this.mascotas.add(miMascota);
		
	}
	
	public void agregarTelefonos(int c, int num, int cod, TipoDeLinea linea) {
		NumeroTelefonico miTelefono = new NumeroTelefonico (c, num, cod, linea);
		this.telefonos.add(miTelefono);
		
	}

	public void mostrarTelefonos() {
		for(int i = 0; i == this.telefonos.size() -1; i++) {
			System.out.println(this.telefonos.get(i).getValor());
		}
	}
	
	public void mostrarMascotas() {
		for(int i = 0; i == this.mascotas.size() -1; i++) {
			this.mascotas.get(i).mostrarDatos();
		}
	}
	
	public void mostrarEmails() {
		for(int i = 0; i == this.emails.size() -1; i++) {
			System.out.println(this.emails.get(i).getValor());
		}
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido 
				+ ", telefonos=" + mostrarTelefonos() + ", emails="
				+ mostrarEmails() + ", mascotas=" + mostrarMascotas() + "]";
	}



}
