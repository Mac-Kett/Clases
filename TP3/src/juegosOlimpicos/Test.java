package juegosOlimpicos;

public class Test {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Atleta corredor1 = new Atleta(120, "Martin");
		Atleta corredor2 = new Atleta (55.60 , "Jorge");
		
		Carrera carreraOlimpica = new Carrera("CarreraOlimpica", 500);
		
		carreraOlimpica.agregarCompetidor(corredor1);
		carreraOlimpica.agregarCompetidor(corredor2);
		
		Atleta atleta = carreraOlimpica.

		String nombreGanador = atleta.getNombre();
		System.out.println(nombreGanador);
		
	}

}
