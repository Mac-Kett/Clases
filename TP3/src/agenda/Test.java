package agenda;

public class Test {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Persona pers1 = new Persona ("1","2","3","4","5");
		Persona pers2 = new Persona ("6","7","8","9","10");
		Persona pers3 = new Persona ("11","12","13","14","15");
		Agenda ag = new Agenda();
		prueba1(ag, pers3.getDni());
		
	}

	
	private static void prueba1(Agenda ag, String dni) {
		String dniPers = dni;
		Persona aux = ag.buscarPersona(dniPers);
		System.out.println(aux.toString());
	}
}
