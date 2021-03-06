package com.locadorav2;

import java.util.ArrayList;

public class Funcionario {
	//ATTRIBUTES
	private int codigo;
	private String nome;
	private String telefone;
	//CONSTRUCTOR
	public Funcionario(int codigo, String nome, String telefone) {
		setCodigo(codigo);
		setNome(nome);
		setTelefone(telefone);
	}
	//METHODS
	public static Funcionario cadastraFunc() {
		Funcionario tmp = new Funcionario(
				View.solicitarDadosInt("Funcionario", "Informe um codigo para o funcionario: "),
				View.solicitarDadosString("Funcionario", "Agora informe o nome: "),
				View.solicitarDadosString("Funcionario", "E por ultimo informe o telefone: ")
		);
		
		return tmp;
	}
	public static String listaFuncs(ArrayList<Funcionario> funcs) {
		int count = 0;
		String tmp = null;
		StringBuilder builder = new StringBuilder();
		for (Funcionario func : funcs) {
			builder.append((count+1)+" - "+func.getNome()+"\n");
			count++;
		}
		tmp = builder.toString();
		return tmp;
	}
	public static Funcionario selecionaFunc(ArrayList<Funcionario> funcs) {
		String tmp = listaFuncs(funcs);
		int opcao = View.solicitarDadosInt("Selecione um funcionario abaixo: ", tmp);
		return funcs.get(opcao-1);
	}
	//GETTERS & SETTERS
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		Utils.validaCodigo(codigo);
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		Utils.validaString(nome);
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		Utils.validaTelefone(telefone);
		this.telefone = telefone;
	}
}
