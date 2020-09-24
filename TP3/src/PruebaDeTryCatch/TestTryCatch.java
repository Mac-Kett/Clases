package PruebaDeTryCatch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTryCatch {
static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		int x;
		
		System.out.println("Ingrese un número: ");
		
		try {
			x = scanner.nextInt();
			System.out.println(x);
		}
		catch(InputMismatchException e) {
			System.out.println("No es un valor numérico.");
		}
		finally {
			System.out.println("Proceso terminado");
		}
		
	}

}
