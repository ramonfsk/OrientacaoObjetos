package com.hotelv1;

import java.util.ArrayList;

public class Cliente extends Pessoa {
	//ATTRIBUTES
	private static int qtdClientes = 0;
	private static int qtdMaxQuartos = 3;
	private int codigo = 100;
	//CONSTRUCTOR
	public Cliente(String nome, int idade, String cpf, int cep, String logradouro, String bairro, String uf) {
		setNome(nome);
		setIdade(idade);
		setCpf(cpf);
		setCep(cep);
		setLogradouro(logradouro);
		setBairro(bairro);
		setUf(uf);
		setCodigo(getCodigo()+1);
		qtdClientes++;
	}
	//METHODS
	public static Cliente registrarCliente() {
		String title = "Cadastro de Cliente";
		Cliente tmp = new Cliente(
					View.lerDadoString(title, "Informe o nome: "),
					View.lerDadoInt(title, "Agora, a idade: "),
					View.lerDadoString(title, "O numero de CPF: "),
					View.lerDadoInt(title, "Digite o numero de CEP: "),
					View.lerDadoString(title, "Agora informe o logradouro: "),
					View.lerDadoString(title, "O bairro: "),
					View.lerDadoString(title, "E por ultimo, o UF: ")
		);
		return tmp;
	}
	public static String listarClientes(ArrayList<Cliente> clnts) {
		int count = 0;
		StringBuilder builder = new StringBuilder();
		for (Cliente cliente : clnts) {
			builder.append((count+1)+" - "+cliente.getNome()+".");
			count++;
		}
		String listaClientes = builder.toString();
		return listaClientes;
	}
	public static Cliente selecionaCliente(ArrayList<Cliente> clnts) {
		String msg = listarClientes(clnts);
		return clnts.get((View.lerDadoInt("Lista de Clientes", "Selecione um cliente: \n"+msg)-1));
	}
	//GETTERS & SETTERS
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public static int getQtdClientes() {
		return qtdClientes;
	}
	public static int getQtdMaxQuartos() {
		return qtdMaxQuartos;
	}
}
