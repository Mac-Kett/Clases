package ejercitacionParcial;
import java.util.Scanner;
public class Test {

	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		Edificio edificio = new Edificio("Caballito, CABA", 8);
		
		yaNoTengoInspiracionParaNombres();
		
	}
		
	public static void yaNoTengoInspiracionParaNombres () {
		Departamento aux;
		aux = Edificio.agregarDepartamento(1, "Susana", "123456789", "no");
		aux = Edificio.agregarDepartamento(2, "La mujer del gatito", "2345678", "si");
		aux = Edificio.agregarDepartamento(3, "Vicky", "123456789", "no");
		aux = Edificio.agregarDepartamento(4, "la señora mayor", "12345678", "no");
		aux = Edificio.agregarDepartamento(5, "los nuevos con el bebe", "12345678", "si");
		aux = Edificio.agregarDepartamento(6, "los de abajo", "12345", "si");
		aux = Edificio.agregarDepartamento(7, "Blanco y sra", "123456", "si");
		aux = Edificio.agregarDepartamento(8, "Maca", "123456789", "no");
		
		mostrarMensajes(aux, "Voto registrado con éxito!", "No se registró voto para éste departamento", "El porcentaje total de votos es: ");
	}
	
	public static void mostrarMensajes(Departamento depto, String mensaje1, String mensaje2, String mensaje3) {
		String elVoto;
		elVoto = Departamento.getVoto();
		
		if(elVoto == "si") {
			System.out.println(mensaje1);
		}
		else if (elVoto == "no") {
			System.out.println(mensaje1);
		}
		else (elVoto == null) {
			System.out.println(mensaje2);
		}
		
		int tot = Edificio.porcentajeTotalVotos();
		System.out.println(mensaje3 + tot);
		
		Edificio.mostrarVotosPositivos();
	}
}

