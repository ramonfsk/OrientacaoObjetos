package com.locadorav2;

import java.util.ArrayList;

public class Filme {
	//ATTRIBUTES
	private static int countFilmes = 0;
	private int codigo;
	private String titulo;
	private String diretor;
	private boolean estaAlugado;
	//CONSTRUCTOR	
	public Filme(int codigo, String titulo, String diretor) {
		setCodigo(codigo);
		setTitulo(titulo);
		setDiretor(diretor);
		estaAlugado = false;
		countFilmes++;
	}
	//METHODS
	public static int getCountFilmes() {
		return countFilmes;
	}
	public static Filme cadastraFilme() {
		Filme tmp = new Filme(
				View.solicitarDadosInt("Filme", "Informe o codigo do filme: "), 
				View.solicitarDadosString("Filme", "Agora, informe o titulo do filme: "), 
				View.solicitarDadosString("Filme", "E por ultimo, informe o diretor: ")
		);
		
		return tmp;
	}
	public static String listaFlms(ArrayList<Filme> flms) {
		int count = 0;
		String tmp = null;
		StringBuilder builder = new StringBuilder();
		for (Filme filme : flms) {
			if(!filme.getEstaAlugado()) {
				builder.append((count+1)+" - "+filme.getTitulo()+"\n");
				count++;
			}
		}	
		tmp = builder.toString();
		return tmp;
	}
	public static Filme selecionaFlm(ArrayList<Filme> flms) {
		String tmp = listaFlms(flms);
		int opcao = View.solicitarDadosInt("Selecione um filme abaixo: ", tmp);
		flms.get(opcao-1).setEstaAlugado(true);
		return flms.get(opcao-1);
	}
	//GETTERS & SETTERS
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		Utils.validaCodigo(codigo);
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		Utils.validaString(titulo);
		this.titulo = titulo;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		Utils.validaString(diretor);
		this.diretor = diretor;
	}
	public boolean getEstaAlugado() {
		return estaAlugado;
	}
	public void setEstaAlugado(boolean estaAlugado) {
		this.estaAlugado = estaAlugado;
	}
}
