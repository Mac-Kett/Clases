package otraPractica;

import java.util.ArrayList;

public class Consultorio {

	private String nombre;
	private int turnosDisponibles;
	private int turnosYaAsignados;
	private String horarioDeAtencion;
	private ArrayList <Paciente> listaPacientes;
	private ArrayList <Paciente> listaAusentes;
	
	public Consultorio (String nombre, int turnosDelDia, String horario) {
		this.setNombre(nombre);
		this.setTurnosDisponibles(turnosDelDia);
		this.setHorarioDeAtencion(horario);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTurnosDisponibles() {
		return turnosDisponibles;
	}

	public void setTurnosDisponibles(int turnosDisponibles) {
		this.turnosDisponibles = turnosDisponibles;
	}
	
	public int getTurnosYaAsignados() {
		return turnosYaAsignados;
	}

	public void setTurnosYaAsignados(int turnosYaAsignados) {
		this.turnosYaAsignados = turnosYaAsignados;
	}
	
	public String getHorarioDeAtencion() {
		return horarioDeAtencion;
	}

	public void setHorarioDeAtencion(String horarioDeAtencion) {
		this.horarioDeAtencion = horarioDeAtencion;
	}
	
	public ArrayList<Paciente> getListaPacientes() {
		return listaPacientes;
	}

	public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}

	public ArrayList<Paciente> getListaAusentes() {
		return listaAusentes;
	}

	public void setListaAusentes(ArrayList<Paciente> listaAusentes) {
		this.listaAusentes = listaAusentes;
	}
	
	private Paciente buscarPaciente (String dniP) {
		Paciente pEncontrado = null;
		int i=0;
		boolean existeP = false;
		
		while (i<this.listaPacientes.size() && !existeP) {
		if (this.listaPacientes.get(i).getDni().equals(dniP)) {
		pEncontrado = this.listaPacientes.get(i);
		existeP = true;
		} else {
		i++;
		}
		}
		return pEncontrado;
	} 
	
	public void registrarTurno (String nombre, String apellido, String dni, String tel, String genero) {
		Paciente nuevoPaciente = null;
		nuevoPaciente = buscarPaciente(dni);
		boolean dniBuscado = buscarDni(dni);
		int i = 0;
		
		while(i <= this.listaPacientes.size() && dniBuscado == true) {
		if (nuevoPaciente==null && this.turnosDisponibles>=this.turnosYaAsignados) {
		
		nuevoPaciente = new Paciente(nombre, apellido, dni, tel, genero);
		this.listaPacientes.add(nuevoPaciente);
		this.turnosYaAsignados++;
		listarTurnos();
			}
		else {
			i++;
		}
		
		}

	}
	
		private boolean buscarDni (String dni) {
			boolean loEncontro = false;
			
			for (Paciente b : listaPacientes) {
				Paciente pacienteEncontrado = b;
				String a = pacienteEncontrado.getDni();
				if(a == dni) {
					loEncontro = true;
				}
			}
			
			return loEncontro;
		}
		
		private void listarTurnos() {
			String m= "El doctor atiende en los horarios: ";
			mostrarMensaje(m);
			mostrarMensaje(horarioDeAtencion);
			for (Paciente p : listaPacientes) {
				Paciente pacienteEncontrado = p;
				
				String o ="Turnos asignados: " + this.turnosYaAsignados;
				
				mostrarMensaje(o);
				
				String a = pacienteEncontrado.getNombre();
				String b = pacienteEncontrado.getApellido();
				String c = pacienteEncontrado.getDni();
				mostrarMensaje(a);
				mostrarMensaje(b);
				mostrarMensaje(c);
				

			}
		}
		
		private void mostrarMensaje (String mensaje) {
			System.out.println(mensaje);
		}
		
		public void darPresente(String dni) {
			
				Paciente pacienteEncontrado = buscarPaciente(dni);

				if (pacienteEncontrado != null) {
				boolean a = pacienteEncontrado.isPresente();
				a = true;
				}
				else {
					String mensaje1 = "Paciente no encontrado";
					mostrarMensaje(mensaje1);
				}
		}
		
		public void anularTurno(String dni) {
			
			for (int i=0;i<this.listaPacientes.size();i++) {
				
			if (this.listaPacientes.get(i).getDni()==dni) {
				
			this.listaPacientes.remove(i);
				}
			}
		
		} 
		
		public ArrayList <Paciente> listarAusentes (boolean pres, String dni){
			
			Paciente nuevoPacienteAusente = buscarPaciente(dni);
			
			if (nuevoPacienteAusente.isPresente()==false) {
			this.listaAusentes.add(nuevoPacienteAusente); 
			}
			
			return listaAusentes;
		}
	

	@Override
	public String toString() {
		return "Consultorio [turnosDisponibles=" + turnosDisponibles + ", turnosYaAsignados=" + turnosYaAsignados
				+ ", listaPacientes=" + listaPacientes + "]";
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}
}
