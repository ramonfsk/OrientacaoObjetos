package com.bancov3;

import java.util.ArrayList;

public class Banco {
	//ATTRIBUTES
	private String nome;
	private ArrayList<Cliente> clnts = new ArrayList<Cliente>();
	private ArrayList<Funcionario> funcs = new ArrayList<Funcionario>();
	private ArrayList<Gerente> grnts = new ArrayList<Gerente>();
	private ArrayList<Diretor> drtrs = new ArrayList<Diretor>();
	//CONSTRUCTOR
	public Banco(String nome) {
		setNome(nome);
	}
	//METHODS
	public static Banco cadastraBanco() {
		Banco tmpBnc = new Banco(
				View.requestString("Infome o nome do banco: ", "Cadastro de Banco")
		);
		return tmpBnc;
	}
	public void addCliente(Cliente clnt) {
		this.clnts.add(clnt);
	}
	public void addFuncionario(Funcionario func) {
		this.funcs.add(func);
	}
	public void addGerente(Gerente grnt) {
		this.grnts.add(grnt);
	}
	public void addDiretor(Diretor drtr) {
		this.drtrs.add(drtr);
	}
	//GETTERS & SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Cliente> getClnts() {
		return clnts;
	}
	public ArrayList<Funcionario> getFuncs() {
		return funcs;
	}
	public ArrayList<Gerente> getGrnts() {
		return grnts;
	}
	public ArrayList<Diretor> getDrtrs() {
		return drtrs;
	}
}
