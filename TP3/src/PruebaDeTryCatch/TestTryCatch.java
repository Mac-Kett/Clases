package PruebaDeTryCatch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTryCatch {
static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente

		int x;
		
		System.out.println("Ingrese un n�mero: ");
		
		try {
			x = scanner.nextInt();
			System.out.println(x);
		}
		catch(InputMismatchException e) {
			System.out.println("No es un valor num�rico.");
		}
		finally {
			System.out.println("Proceso terminado");
		}
		
	}

}
