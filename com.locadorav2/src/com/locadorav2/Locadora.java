package com.locadorav2;

import java.util.ArrayList;

public class Locadora {
	//ATTRIBUTES
	private static int maxFiliais = 2;
	private String nome;
	private ArrayList<Filial> flais = new ArrayList<Filial>();
	//CONSTRUCTOR
	public Locadora(String nome) {
		setNome(nome);
	}
	//METHODS
	public void addFilial(Filial flal) {
		if(getFlais().size() > maxFiliais) {
			View.exibirMsgErro("O limite e de apenas"+maxFiliais+"filiais!");
		} else
			this.flais.add(flal);
	}
	//GETTERS & SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Filial> getFlais() {
		return flais;
	}
}
