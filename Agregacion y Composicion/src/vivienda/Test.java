package vivienda;

public class Test {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente

		Vivienda vivienda1 = new Vivienda("Mota�eses", "1234", 4, "C",
				"Arturo", "Roman", 53,
				"Madera", "Mesa", "Negro");
		
		Mueble mesada = new Mueble ("M�rmol", "Mesada", "Rojo");
		Mueble perchero = new Mueble ("Metal", "Perchero", "Negro");
		Mueble sillon = new Mueble ("Cuero", "Sil�n", "Azul"); 
		
		vivienda1.agregarMueble(mesada);
		vivienda1.agregarMueble(perchero);
		vivienda1.agregarMueble(sillon);
		
		vivienda1.toString();
	}

}
