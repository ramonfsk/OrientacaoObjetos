import java.util.ArrayList;
import java.util.Random;

public class Volta {
	//ATRIBUTES
	private ArrayList<Integer> tempoPilotos = new ArrayList<Integer>();
	//CONSTRUCTOR
	//METHODS
	boolean geraTempoVoltaPilotos(int qtdPilotos, int tempoMedioVolta) {
		Random r = new Random();
		int tempoMax = tempoMedioVolta + 100;
		int tempoMin = tempoMedioVolta - 100;
		for (int count = 0; count < qtdPilotos; count++) {
			tempoPilotos.add(r.nextInt(((tempoMax - tempoMin) + 1) + tempoMin));
		}
		return true;
	}
	//GETTERS & SETTERS
}
