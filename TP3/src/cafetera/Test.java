package ejercicio4;

public class Test {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Cafetera cafetera1 = new Cafetera();
		Cafetera cafetera2 = new Cafetera(500);
		Cafetera cafetera3 = new Cafetera(750, 500);
	
		testearCafetera(cafetera1);
		testearCafetera(cafetera2);
		testearCafetera(cafetera3);
	}

		public static void testearCafetera (Cafetera caf) {
			int nuevoSob = 0;
			int capAct = 0;
			capAct = caf.getCantidadActual();
			System.out.println("Capacidad Actual: "+capAct);
			nuevoSob = caf.agregarCafe(100);
			System.out.println("Caf� sobrante: "+nuevoSob);
			System.out.println("Capacidad Actual: "+caf.getCantidadActual());
		}
		
}