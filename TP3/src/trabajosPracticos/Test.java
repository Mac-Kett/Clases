package trabajosPracticos;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		String mensaje1 = "Se agregó a: ";
		String mensaje2 = " al grupo ";
		// TODO Apéndice de método generado automáticamente

		ArrayList <Grupo> grupo1;
		String grup = grupo1.getNombre();

		String erik = new Integrante ("Erik M.");
		grupo1.agregarIntegrante("Erik M.");
		String integ = grupo1.buscarIntegrante(erik);
		mostrarMensaje(mensaje1, mensaje2, integ, grup);
		
		String macarena = new Integrante ("Macarena Q.");
		grupo1.agregarIntegrante("Macarena Q.");
		String integ = macarena.getNombre();
		mostrarMensaje(mensaje1, mensaje2, integ, grup);
		
		String mariana = new Integrante ("Mariana B.");
		grupo1.agregarIntegrante("Mariana B.");
		String integ = mariana.getNombre();
		mostrarMensaje(mensaje1, mensaje2, integ, grup);
		
		String ignacio = new Integrante ("Juan Ignacio B.");
		grupo1.agregarIntegrante("Juan Ignacio B.");
		String integ = ignacio.getNombre();
		mostrarMensaje(mensaje1, mensaje2, integ, grup);
		
		String ficticio = new Integrante ("ficticio");
		grupo1.agregarIntegrante("ficticio");
		String integ = ficticio.getNombre();
		mostrarMensaje(mensaje1, mensaje2, integ, grup);
		
		boolean verificar1 = verificarSiSeAgrego("Macarena Q.");
		System.out.println(verificar1);
		boolean verificar2 = verificarSiSeAgrego("Otro ficticio");
		System.out.println(verificar2);
		
		System.out.println("Los datos del grupo son: " + grupo1.getNombre());
		
		String integranteFalso = grupo1.removerIntegrante("ficticio");
		System.out.println("Se eliminó a " + integranteFalso.getNombre() + " del grupo " + grup);
		
		String otroIntegranteFalso = grupo1.removerIntegrante("ficticio");
		
		System.out.println(grupo1.getCantidadIntegrantes());
		grupo1.vaciar();
		System.out.println(grupo1.getCantidadIntegrantes());
	}
	
	public static void mostrarMensaje (String mensaje1, String mensaje2, String nombreInt, String nombreGrup) {
		System.out.println(mensaje1 + nombreInt + mensaje2 + nombreGrup);
	}
	
	public static boolean verificarSiSeAgrego (String nombre) {
		boolean pudo = false;
		Integrante persona = grupo1.buscarIntegrante(nombre);
		if(persona != null) {
			pudo = true;
		}
		
		return pudo;
	}

}

