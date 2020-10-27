package puerto;

import java.util.ArrayList;

public class Puerto {

	ArrayList<Amarra> amarras;
	
	
public int barcosConAlquilerMayorA(double importe) {
	int contador = 0;
	Amarra amarra;
	Embarcacion embarcacion;
	int total;
	
	for(Amarra a: this.amarras) {
		amarra = this.amarras.get(a);
		
		for(Embarcacion e: a.embarcaciones) {
			embarcacion = a.get(e);
			
			total = e.calcularValorBase() + e.calcularAdicional();
			
			if(total > importe) {
				contador++;
			}
		}
	}
	
	return contador;
}

}
