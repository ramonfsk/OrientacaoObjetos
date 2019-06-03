package com.bancov3;

public class Pessoa extends Acesso {
	//ATTRIBUTES
	private String nome;
	private int idade;
	private int cpf;
	private int telefone;
	private int senha;
	//CONSTRUCTOR
	public Pessoa(){};
	public Pessoa(String nome, int idade, int cpf, int telefone, int senha) {
		setNome(nome);
		setIdade(idade);
		setCpf(cpf);
		setTelefone(telefone);
		setSenha(senha);
	}
	//METHODS
	public int nivelAcesso() {
		return 0;
	}
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
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
