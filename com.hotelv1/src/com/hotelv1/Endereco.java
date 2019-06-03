package com.hotelv1;

public abstract class Endereco {
	//ATTRIBUTES
	private int cep;
	private String logradouro;
	private String bairro;
	private String uf;
	//CONSTRUCTOR
	public Endereco(){};
	//METHODS
	//GETTERS & SETTERS
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
}
