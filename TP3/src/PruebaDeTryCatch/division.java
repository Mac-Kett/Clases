package PruebaDeTryCatch;
import java.util.Scanner;
public class division {
static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		double z = 0;
		
		try {
// Codigo que aún no sé si tiene un error-----------------------------------------------
			
		
		
		System.out.println("Dame un primer valor:");
		x = scanner.nextInt();
		
		System.out.println("Dame un segundo valor:");
		y = scanner.nextInt();
		
		z = x / y;
		
		}catch(Exception e) {
//Comportamiento del programa cuando sucede un error no previsto------------------------
		
		System.out.println("Error" + e);
		}finally {

		}
		
		System.out.println("La división es igual a: " + z);

		
		
	}
	
}
