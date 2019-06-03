package com.hotelv1;

public abstract class Pessoa extends Endereco {
	//ATTRIBUTES
	private String nome;
	private int idade;
	private String cpf;
	//CONSTRUCTOR
	public Pessoa(){};
	//METHODS
	//GETTERS & SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
