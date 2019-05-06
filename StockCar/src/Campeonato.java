import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Campeonato {
	//ATRIBUTES
	private String nome;
	private ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
	private ArrayList<Corrida> corridas = new ArrayList<Corrida>();
	private HashMap<Integer, String> colocacoes = new HashMap<Integer, String>();
	//CONSTRUCTOR
	public Campeonato(String nome) {
		setNome(nome);
	}
	//METHODS
	void adicionarPiloto(Piloto piloto) {
		pilotos.add(piloto);
	}
	void removerPiloto(Piloto piloto) {
		pilotos.remove(piloto);
	}
	void adicionarCorrida(Corrida corrida) {
		corridas.add(corrida);
	}
	void removerCorrida(Corrida corrida) {
		corridas.remove(corrida);
	}
	void geraClassificacaoCorridas() {
		for(Corrida crd : corridas) {
			crd.geraColocacoesPilotos(pilotos);
			int count = 1;
			for(Piloto plt : pilotos) {
				System.out.println(
						"O piloto "+ plt.getNome() +
						" terminou o "+ crd.getNome() +" na "+ count +
						"ª coloacao com "+ plt.getSumVoltasCorrida() +
						"s de prova e somou "+ plt.getPtsCampeonato() +" pontos no campeonato!"
				);
			}
		}
	}
	void geraClassificacaoGeral() {
		for(Corrida crd : corridas) {
			crd.geraColocacoesPilotos(pilotos);
		}
		Collections.sort(pilotos, new Comparator<Piloto>() {
			public int compare(Piloto plt2, Piloto plt1) {
				if(plt1.getPtsCampeonato() > plt2.getPtsCampeonato()) return +1;
				else if(plt1.getPtsCampeonato()  < plt2.getPtsCampeonato()) return -1;
				else return 0;
			}
		});
		int count = 1;
		System.out.println("+-------------------------------+------+");
		System.out.println("| Nº | Piloto                   | Pts. |");
		System.out.println("+----+--------------------------+------+");
		for(Piloto plt : this.pilotos) {
			this.colocacoes.put(count, plt.getNome());
			System.out.printf("|%-4d|%-26s|%6d|\n", count, plt.getNome(), plt.getPtsCampeonato());
			System.out.println("+----+--------------------------+------+");
			count++;
		}
	}
	//GETTERS & SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Corrida> getCorridas() {
		return corridas;
	}
}
