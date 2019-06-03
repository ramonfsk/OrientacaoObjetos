package com.hotelv1;

import java.util.ArrayList;

public class Recepcionista extends Funcionario {
	//ATTRIBUTES
	private static int qtdRececpcionistas = 0;
	//CONSTRUCTOR
	public Recepcionista(String nome, int idade, String cpf, int cep, String logradouro, String bairro, String uf) {
		setNome(nome);
		setIdade(idade);
		setCpf(cpf);
		setCep(cep);
		setLogradouro(logradouro);
		setBairro(bairro);
		setUf(uf);
		setCodigo(getCodigo()+100);
		setQtdRececpcionistas(getQtdRececpcionistas()+1);
	}
	//METHODS
	public static Recepcionista registrarRecepcionista() {
		String title = "Cadstro de Recepcionista";
		Recepcionista tmp = new Recepcionista(
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
	public static String listarRecepcionistas(ArrayList<Recepcionista> recps) {
		int count = 0;
		StringBuilder builder = new StringBuilder();
		for (Recepcionista recp : recps) {
			builder.append((count+1)+" - "+recp.getNome()+".");
			count++;
		}
		String listaRecepcionistas = builder.toString();
		return listaRecepcionistas;
	}
	public static Recepcionista selecionaRecepcionista(ArrayList<Recepcionista> recps) {
		String msg = listarRecepcionistas(recps);
		return recps.get((View.lerDadoInt("Lista de Recepcionistas", "Selecione um recepcionista: \n"+msg)-1));
	}
	//GETTERS & SETTERS
	public static int getQtdRececpcionistas() {
		return qtdRececpcionistas;
	}
	public static void setQtdRececpcionistas(int qtdRececpcionistas) {
		Recepcionista.qtdRececpcionistas = qtdRececpcionistas;
	}
}
