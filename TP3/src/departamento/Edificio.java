package departamento;
import java.util.ArrayList;
public class Edificio {

	private String direccion;
	private int cantDeptos;
	private ArrayList <Departamento> listaDeptos;
	
	public Edificio(String laDirecc, int cuantos) {
		this.setCantDeptos(cuantos);
		this.setDireccion(laDirecc);
		this.listaDeptos = new ArrayList<>();
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantDeptos() {
		return cantDeptos;
	}

	public void setCantDeptos(int cantDeptos) {
		this.cantDeptos = cantDeptos;
	}

	public ArrayList<Departamento> getListaDeptos() {
		return listaDeptos;
	}

	public void setListaDeptos(ArrayList<Departamento> listaDeptos) {
		this.listaDeptos = listaDeptos;
	}
	
	public static Departamento agregarDepartamento(int uni, String nombreProp, String dni, String voto) {
		
		Departamento departamentoAgregar = null;
		int aux=0;

		while (aux<this.cantDeptos && departamentoAgregar == null) {
		if (this.listaDeptos.get(aux).getUnidad() == uni) {
		departamentoAgregar = new Departamento(uni, nombreProp, dni, voto);
		this.listaDeptos.add(departamentoAgregar);
		} else {
		aux++;
		}
		}
		return departamentoAgregar;
		} 
	
	public boolean actualizarVoto (int uni, String voto) {
		int i = 0;
		boolean sePudo = false;
		String aunNoVoto = this.listaDeptos.get(i).getVoto();
		
		while (uni == this.listaDeptos.get(i).getUnidad()) {
			if(this.listaDeptos.get(i).getVoto() == null) {
				aunNoVoto = voto;
				sePudo = true;
			}
			else {
				i++;
			}
		}
		
		return sePudo;
	}
	
	public int porcentajeTotalVotos () {
		int aux = 0;
		int total = 0;
		for (Departamento traeVotosTotales: listaDeptos) {
			String suVoto = Departamento.getVoto();
			if(suVoto != null) {
				aux = aux +1;
			}
		}
		total = aux/cantDeptos;
		return total;
	}
	
	public void mostrarVotosPositivos ()	{
	for (Departamento traeVotosPositivos: listaDeptos) {
		String suVoto = Departamento.getVoto();
		if(suVoto == "si") {
			System.out.println(suVoto);
		}
	}
	}
	}
	

