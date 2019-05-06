import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Corrida {
	//ATRIBUTES
	private String nome, pais, cidade;
	private int qtdVoltas, tempoMedioVolta, tamanhoPista;
	//CONSTRUCTOR
	public Corrida(String nome, String pais, String cidade, int tamanhoPista, int qtdVoltas, int tempoMedioVolta) {
		setNome(nome);
		setPais(pais);
		setCidade(cidade);
		setTamanhoPista(tamanhoPista);
		setQtdVoltas(qtdVoltas);
		setTempoMedioVolta(tempoMedioVolta);
	}
	//METHODS
	private void geraTempoVoltasPilotos(ArrayList<Piloto> pilotos) {
		int tempoMax = this.tempoMedioVolta + 100;
		int tempoMin = this.tempoMedioVolta - 100;
		for(int count = 0; count < qtdVoltas; count++) {
			for (Piloto plt : pilotos) {
				plt.setSumVoltasCorrida(plt.getSumVoltasCorrida() + new Random().nextInt(((tempoMax - tempoMin) + 1)) + tempoMin);
			}
		}
	}
	void geraColocacoesPilotos(ArrayList<Piloto> pilotos) {
		geraTempoVoltasPilotos(pilotos);
		Collections.sort(pilotos, new Comparator<Piloto>() {
			public int compare(Piloto plt2, Piloto plt1) {
				if(plt1.getSumVoltasCorrida() < plt2.getSumVoltasCorrida()) return +1;
				else if(plt1.getSumVoltasCorrida() > plt2.getSumVoltasCorrida()) return -1;
				else return 0;
			}
		});
		int count = 1;
		for(Piloto plt : pilotos) {
			if(count == 1) {
				plt.setPtsCampeonato(plt.getPtsCampeonato() + 3);
			}else if(count == 2) {
				plt.setPtsCampeonato(plt.getPtsCampeonato() + 2);
			}else {
				plt.setPtsCampeonato(plt.getPtsCampeonato() + 1);
			}
			plt.setSumVoltasCorrida(0);
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
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getQtdVoltas() {
		return qtdVoltas;
	}
	public void setQtdVoltas(int qtdVoltas) {
		this.qtdVoltas = qtdVoltas;
	}
	public int getTempoMedioVolta() {
		return tempoMedioVolta;
	}
	public void setTempoMedioVolta(int tempoMedioVolta) {
		this.tempoMedioVolta = tempoMedioVolta;
	}
	public int getTamanhoPista() {
		return tamanhoPista;
	}
	public void setTamanhoPista(int tamanhoPista) {
		this.tamanhoPista = tamanhoPista;
	}
}
