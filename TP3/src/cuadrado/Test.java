package cuadrado;

public class Test {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Cuadrado cuadrado1 = new Cuadrado(10);
		
		testearCuadrado(cuadrado1);
	}

	
	public static void testearCuadrado (Cuadrado cuadrado) {
		int aux = cuadrado.setLado(40);
		System.out.println(cuadrado.getLado());
	}
}
