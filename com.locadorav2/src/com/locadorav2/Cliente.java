package com.locadorav2;

import java.util.ArrayList;

public class Cliente {
	//ATTRIBUTES
	private int codigo;
	private String nome;
	private String telefone;
	//CONSTRUCTOR
	public Cliente(int codigo, String nome, String telefone) {
		setCodigo(codigo);
		setNome(nome);
		setTelefone(telefone);
	}
	//METHODS
	public static Cliente cadastraClnt() {
		Cliente tmp = new Cliente(
				View.solicitarDadosInt("Cliente", "Informe um codigo para o cliente: "),
				View.solicitarDadosString("Cliente", "Agora informe o nome: "),
				View.solicitarDadosString("Cliente", "E por ultimo informe o telefone: ")
		);
		
		return tmp;
	}
	public static String listaClnts(ArrayList<Cliente> clnts) {
		int count = 0;
		String tmp = null;
		StringBuilder builder = new StringBuilder();
		for (Cliente clnt : clnts) {
			builder.append((count+1)+" - "+clnt.getNome()+"\n");
			count++;
		}
		tmp = builder.toString();
		return tmp;
	}
	public static Cliente selecionaClnt(ArrayList<Cliente> clnts) {
		String tmp = listaClnts(clnts);
		int opcao = View.solicitarDadosInt("Selecione um cliente abaixo: ", tmp);
		return clnts.get(opcao-1);
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
