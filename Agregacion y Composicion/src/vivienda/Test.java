package vivienda;

public class Test {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Vivienda vivienda1 = new Vivienda("Motañeses", "1234", 4, "C",
				"Arturo", "Roman", 53,
				"Madera", "Mesa", "Negro");
		
		Mueble mesada = new Mueble ("Mármol", "Mesada", "Rojo");
		Mueble perchero = new Mueble ("Metal", "Perchero", "Negro");
		Mueble sillon = new Mueble ("Cuero", "Silón", "Azul"); 
		
		vivienda1.agregarMueble(mesada);
		vivienda1.agregarMueble(perchero);
		vivienda1.agregarMueble(sillon);
		
		vivienda1.toString();
	}

}
