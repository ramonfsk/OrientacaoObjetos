package com.hotelv1;

import java.util.ArrayList;

public class Quarto {
	//ATTRIBUTES
	private static int qtdQuartos = 0;
	private int codigo = 100;
	private int qtdCamas;
	private int qtdBanheiros;
	private int qtdTelevisores;
	private boolean temGuardaRoupa;
	private boolean temArCondicionado;
	private boolean temMesa;
	private boolean temSofa;
	private boolean temComputador;
	private double valorReserva;
	private boolean estaDisponivel;
	//CONSTRUCTOR
	public Quarto(int qtdCamas, int qtdBanheiros, int qtdTelevisores, boolean temGuardaRoupa, boolean temArCondicionado, boolean temMesa, boolean temSofa, boolean temComputador, double valorReserva){
		setCodigo(getCodigo()+1);
		setQtdCamas(qtdCamas);
		setQtdBanheiros(qtdBanheiros);
		setQtdTelevisores(qtdTelevisores);
		setTemGuardaRoupa(temGuardaRoupa);
		setTemArCondicionado(temArCondicionado);
		setTemMesa(temMesa);
		setTemSofa(temSofa);
		setTemComputador(temComputador);
		setValorReserva(valorReserva);
		setEstaDisponivel(true);
		qtdQuartos++;
	}
	//METHODS
	public static Quarto registrarQuarto() {
		String title = "Cadastro de Quarto";
		Quarto tmp = new Quarto(
				View.lerDadoInt(title, "Existem quantas camas no quarto: "),
				View.lerDadoInt(title, "E quantos banheiros: "),
				View.lerDadoInt(title, "Quantos televisores: "),
				View.lerDadoBoolean(title, "Tem guarda roupa? "),
				View.lerDadoBoolean(title, "Tem ar condicionado? "),
				View.lerDadoBoolean(title, "Tem mesa? "),
				View.lerDadoBoolean(title, "Tem sofa? "),
				View.lerDadoBoolean(title, "E computador? "),
				View.lerDadoDouble(title, "Qual o valor para reservar esse quarto: ")
		);
		return tmp;
	}
	public static String listarQuartos(ArrayList<Quarto> qrts) {
		int count = 0;
		StringBuilder builder = new StringBuilder();
		for (Quarto qrt : qrts) {
			if(qrt.getEstaDisponivel()) {
				builder.append((count+1)+" - "+qrt.getCodigo()+" R$ "+qrt.getValorReserva()+".");
				count++;
			}
		}
		String listaRecepcionistas = builder.toString();
		return listaRecepcionistas;
	}
	public static Quarto selecionaQuarto(ArrayList<Quarto> qrts) {
		String msg = listarQuartos(qrts);
		int option = View.lerDadoInt("Lista de Quartos", "Selecione um quarto: \n"+msg);
		qrts.get(option-1).setEstaDisponivel(false);
		return qrts.get(option-1);
	}
	//GETTERS & SETTERS
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getQtdCamas() {
		return qtdCamas;
	}
	public void setQtdCamas(int qtdCamas) {
		this.qtdCamas = qtdCamas;
	}
	public int getQtdBanheiros() {
		return qtdBanheiros;
	}
	public void setQtdBanheiros(int qtdBanheiros) {
		this.qtdBanheiros = qtdBanheiros;
	}
	public int getQtdTelevisores() {
		return qtdTelevisores;
	}
	public void setQtdTelevisores(int qtdTelevisores) {
		this.qtdTelevisores = qtdTelevisores;
	}
	public boolean isTemGuardaRoupa() {
		return temGuardaRoupa;
	}
	public void setTemGuardaRoupa(boolean temGuardaRoupa) {
		this.temGuardaRoupa = temGuardaRoupa;
	}
	public boolean isTemArCondicionado() {
		return temArCondicionado;
	}
	public void setTemArCondicionado(boolean temArCondicionado) {
		this.temArCondicionado = temArCondicionado;
	}
	public boolean isTemMesa() {
		return temMesa;
	}
	public void setTemMesa(boolean temMesa) {
		this.temMesa = temMesa;
	}
	public boolean isTemSofa() {
		return temSofa;
	}
	public void setTemSofa(boolean temSofa) {
		this.temSofa = temSofa;
	}
	public boolean isTemComputador() {
		return temComputador;
	}
	public void setTemComputador(boolean temComputador) {
		this.temComputador = temComputador;
	}
	public double getValorReserva() {
		return valorReserva;
	}
	public void setValorReserva(double valorReserva) {
		this.valorReserva = valorReserva;
	}
	public boolean getEstaDisponivel() {
		return estaDisponivel;
	}
	public void setEstaDisponivel(boolean estaDisponivel) {
		this.estaDisponivel = estaDisponivel;
	}
	public static int getQtdQuartos() {
		return qtdQuartos;
	}
}
