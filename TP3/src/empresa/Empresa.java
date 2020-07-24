package ejercicioDeClaseTP4;
import java.util.ArrayList;
public class Empresa {

	private String nombre;
	private int cantEmpleados;
	private ArrayList <Empleado> listaDeEmpleados = new ArrayList<Empleado>();
	
	public Empresa (string nombreEmp) {
		this.nombre = nombreEmp;
		this.cantEmpleados = 0;
	}
	
	public void setNombre (String nombreEmp) {
		this.nombre = nombreEmp;
	}
	
	public void setCantEmpleados(int cuantos) {
		this.cantEmpleados = cuantos;
	}
	public String getNombre() {
		return nombre;
	}
	public int getCantEmpleados() {
		return cantEmpleados;
	}
	
	public boolean agregarEmpleado(String nombreNue, double sueldoNuev, int antiNue, String dniNue) {
		boolean pudoAgregar = false;
		Empleado nuevoEmpleadoCreado = null;
		nuevoEmpleadoCreado = buscarEmpleado(dniNue):
		if(nuevoEmpleadoCreado==null) {
			nuevoEmpleadoCreado = new Empleado(nombreNue, sueldoNue, antigNue, dniNue)
					this.listaDeEmpleados.add(nuevoEmpleadoCreado);
					this.cantEmpleados++;
					pudoAgregar = true;
		}
		return pudoAgregar;
	}
	
	public boolean Empleado buscarEmpleado(String dniBuscar) {
		Empleado empleadoEncontrado = null;
		int i=0;
		boolean existeEmpleado = false;
		int largoLista = this.listaDeEmpleados.size();
		while (i <largoLista && !existeEmpleado) {
			if(this.listaDeEmpleados.get(i).getDni().equals(dniBuscar)) {
				empleadoEncontrado = this.listaDeEmpleados.get(i);
				existeEmpleado = true
			} else {
				i++;
			}
		}
		return empleadoEncontrado;
	}
	
	public boolean quitarEmpleado(String dniQuitar) {
		boolean pudoQuitar = false;
		Empleado empleadoBuscado = null;
		EmpleadoBorrar = buscarEmpleado(dniQuitar);
		if(empleadoBorrar != null) {
			this.listaDeEmpleados.remove(empleadoBorrar);
			this.cantEmpleados--;
			pudoQuitar = true;
		}
		return pudoQuitar;
	}
	
	public void listaEmpleados(double sueldoMinimo) {
		System.out.println("Listado de empleados");
		for(int i=0; i<this.listaDeEmpleados.size(); i++) {
			if(this.listaDeEmpleados.get(i).getSueldo()>=sueldoMinimo) {
			System.out.println(this.listaDeEmpleados.get(i).toString());
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
	}

}
