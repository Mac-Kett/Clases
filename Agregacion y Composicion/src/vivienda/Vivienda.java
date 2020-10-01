package vivienda;

import java.util.ArrayList;

public class Vivienda {

	private  ArrayList <Persona> personasViviendo;
	private ArrayList <Mueble> mueblesCasa;
	
	public Vivienda (String calle, String altura, int piso, String depto,
			String nombre, String apellido, int edad,
			String material, String nombre2, String color) {
		
		Direccion direccion = new Direccion(calle, altura, piso, depto);
		Persona persona = new Persona(nombre, apellido, edad);
		Mueble mueble = new Mueble(material, nombre2, color);
		this.personasViviendo = new ArrayList <Persona>();
		this.mueblesCasa = new ArrayList <Mueble>();
		
		agregarPersona(persona);
		agregarMueble(mueble);
		
	}
	
	public void agregarPersona (Persona p) {
		if(p != null) {
			this.personasViviendo.add(p);
		}
	}
	
	public void agregarMueble (Mueble m) {
		if(m != null) {
			this.mueblesCasa.add(m);
		}
	}
	
	private void mostrarPersonas() {
		String mostrar;
		
		for(int i = 0; i < this.personasViviendo.size() -1; i++) {
			Persona p = this.personasViviendo.get(i);
			if(p != null) {
				mostrar = p.getNombre() + p.getApellido() + p.getEdad();
				System.out.println(mostrar);
			}
		}
	}

	private void mostrarMuebles() {
		String mostrar;
		
		for (int i = 0; i < this.mueblesCasa.size() -1; i++) {
			Mueble m = this.mueblesCasa.get(i);
			if(m != null) {
				mostrar = m.getNombre() + m.getMaterial() + m.getColor();
				System.out.println(mostrar);
			}
		}
	}
	
	private void mostrarDireccion() {
		String mostrar;
		
			mostrar = direccion.getCalle() + direccion.getAltura() + direccion.getPiso() + direccion.getDepartamento();
			System.out.println(mostrar);
		
	}
	
	@Override
	public String toString() {
		return "Vivienda : personasViviendo=" + mostrarPersonas() 
		+ ", muebles=" + mostrarMuebles() + "Direccion " + mostrarDireccion + ".";
	}
	
	
	
}
