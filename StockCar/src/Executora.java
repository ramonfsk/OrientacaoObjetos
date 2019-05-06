public class Executora {
	public static void main(String[] args) {
		Piloto plt1 = new Piloto(1, "Ayrton Senna", 35, "Lotus", "Brasileiro");
		Piloto plt2 = new Piloto(2, "Michael Schumacher", 27, "Ferrari", "Alemao");
		Piloto plt3 = new Piloto(3, "Juan Manuel Fangio", 22, "Alfa Romeu", "Argentino");
		Piloto plt4 = new Piloto(4, "Alain Marie Pascal Prost", 40, "McLaren", "Frances");
		Piloto plt5 = new Piloto(5, "Andreas Nikolaus Lauda", 30, "March", "Austriaco");
		
		Corrida crd1 = new Corrida("GP de Monaco", "Franca", "Monaco", 3337, 10, 300);
		Corrida crd2 = new Corrida("GP de Interlagos", "Brasil", "Sao Paulo", 4309, 10, 550);
		Corrida crd3 = new Corrida("GP da Australia", "Australia", "Melbourne", 5303, 10, 650);
		
		Campeonato cmp1 = new Campeonato("F1 Revolutions");
		cmp1.adicionarPiloto(plt1);
		cmp1.adicionarPiloto(plt2);
		cmp1.adicionarPiloto(plt3);
		cmp1.adicionarPiloto(plt4);
		cmp1.adicionarPiloto(plt5);
		cmp1.adicionarCorrida(crd1);
		cmp1.adicionarCorrida(crd2);
		cmp1.adicionarCorrida(crd3);
		cmp1.geraClassificacaoCorridas();
		//cmp1.geraClassificacaoGeral();
	}
}
