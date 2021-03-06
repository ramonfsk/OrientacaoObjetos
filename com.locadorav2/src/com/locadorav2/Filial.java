package com.locadorav2;

import java.util.ArrayList;

public class Filial {
	//ATTRIBUTES
	private String nome;
	private ArrayList<Filme> flms = new ArrayList<Filme>();
	private ArrayList<Funcionario> funcs = new ArrayList<Funcionario>();
	private ArrayList<Cliente> clnts = new ArrayList<Cliente>();
	private ArrayList<Locacao> locs = new ArrayList<Locacao>();
	//CONSTRUCTOR
	public Filial(String nome) {
		setNome(nome);
	}
	//METHODS
	public void addFilme(Filme flm) {
		this.flms.add(flm);
	}
	public void addFuncionario(Funcionario func) {
		this.funcs.add(func);
	}
	public void addCliente(Cliente clnt) {
		this.clnts.add(clnt);
	}
	public void addLocacao(Locacao loc) {
		this.locs.add(loc);
	}
	public static Filial cadastrarFilial() {
		Filial tmp = new Filial(
				View.solicitarDadosString("Nova filial", "Informe o nome da filial: ")
		);
		return tmp;
	}
	public static String listaFiliais(ArrayList<Filial> flals) {
		int count = 1;
		String tmp = null;
		StringBuilder builder = new StringBuilder();
		for (Filial filial : flals) {
			builder.append(count+" - "+filial.getNome()+"\n");
			count++;
		}
		tmp = builder.toString();
		return tmp;
	}
	public static Filial selecionaFilial(ArrayList<Filial> flals) {
		String tmp = listaFiliais(flals);
		int opcao = View.solicitarDadosInt("Selecione uma filial abaixo: ", tmp);
		return flals.get(opcao-1);
	}
	//GETTERS & SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		Utils.validaString(nome);
		this.nome = nome;
	}
	public ArrayList<Filme> getFlms() {
		return flms;
	}
	public ArrayList<Cliente> getClnts() {
		return clnts;
	}
	public ArrayList<Funcionario> getFuncs() {
		return funcs;
	}
	public ArrayList<Locacao> getLocs(){
		return locs;
	}
}
