package trabajosPracticos;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		String mensaje1 = "Se agregó a: ";
		String mensaje2 = " al grupo ";

		Grupo grupo1 = new Grupo ("Los Mejores");
		String grup = grupo1.getNombre();

		String erik =  "Erik M.";
		grupo1.agregarIntegrante("Erik M.");
		mostrarMensaje(mensaje1, mensaje2, erik, grup);
		
		String macarena = "Macarena Q.";
		grupo1.agregarIntegrante("Macarena Q.");
		mostrarMensaje(mensaje1, mensaje2, macarena, grup);
	
		String mariana = "Mariana B.";
		grupo1.agregarIntegrante("Mariana B.");
		mostrarMensaje(mensaje1, mensaje2, mariana, grup);
		
		String ignacio = "Juan Ignacio B.";
		grupo1.agregarIntegrante("Juan Ignacio B.");
		mostrarMensaje(mensaje1, mensaje2, ignacio, grup);
		
		String ficticio = "ficticio";
		grupo1.agregarIntegrante("ficticio");
		mostrarMensaje(mensaje1, mensaje2, ficticio, grup);
		
		boolean verificar1 = verificarSiSeAgrego("Macarena Q.");
		System.out.println(verificar1);
		boolean verificar2 = verificarSiSeAgrego("Otro ficticio");
		System.out.println(verificar2);
		
		System.out.println("Los datos del grupo son: " + grupo1.getNombre());
		
		String integranteFalso = grupo1.removerIntegrante("ficticio");
		System.out.println("Se eliminó a " + integranteFalso + " del grupo " + grup);
		
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
		String persona = grupo1.buscarIntegrante(nombre);
		if(persona != null) {
			pudo = true;
		}
		
		return pudo;
	}

}

