
import java.util.Scanner;
public class Test {
private static Scanner imput = new Scanner (System.in);
	public static void main(String[] args) {
		
		Empresa miEmpresa = new Empresa("mi boliche s.a.");
		
		String nombreIngresado;
		double sueldoIngresado;
		int antigIngresada;
		String dniIngresado;
		boolean pudoIngresar;
		
		pudoAgregar = false;
		
		dniIngresado = pedirAlfanum ("Ingrese el dniF = fin");
		
		while (!dniIngresado.contentEquals("F")) {
			nombreIngresado = pedirAlfanum("Ingrese el nombre del empleado");
			
			System.out.println("Ingrese el sueldo del empleado");
			sueldoIngresado = imput.nextDouble();
			
			System.out.println("Ingrese la antiguedad del empleado");
			antiIngresada = imput.nextInt();
			imput.nextLine();
			
			pudoAgregar = miEmpresa.agregarEmpleado(nombreIngresado, sueldoIngresado, antiIngresada, dniIngresado);
			if (pudoAgregar) {
				System.out.println("Empleado agregado con éxito!");
				
			} else {
				System.out.println("El empleado ya existía. No se pudo agregar");
			}
			dniIngresado = pedirAlfanum("Ingrese el dni (F=fin)");
		}
		
		miEmpresa.listaEmpleados(10000);
	}

	private static String pedirAlfanum(String elMensajito) {
		String elTexto="";
		
	}
	
}
