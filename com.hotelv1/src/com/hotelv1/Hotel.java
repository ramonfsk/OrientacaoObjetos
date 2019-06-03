package com.hotelv1;

import java.util.ArrayList;

public class Hotel extends Endereco {
	//ATTRIBUTES
	private String nome;
	private ArrayList<Quarto> qrts = new ArrayList<Quarto>();
	private ArrayList<Recepcionista> recps = new ArrayList<Recepcionista>();
	private ArrayList<Cliente> clnts = new ArrayList<Cliente>();
	private ArrayList<Reserva> rsrvs = new ArrayList<Reserva>();
	private ArrayList<Relatorio> relts = new ArrayList<Relatorio>();
	//CONSTRUCTOR
	public Hotel(String nome, int cep, String logradouro, String bairro, String uf) {
		setNome(nome);
		setCep(cep);
		setLogradouro(logradouro);
		setBairro(bairro);
		setUf(uf);
	}

	//METHODS
	public static Hotel registrarHotel() {
		String title = "Cadastro de Hotel";
		Hotel tmp = new Hotel(
				View.lerDadoString(title, "Informe um nome para o hotel: "),
				View.lerDadoInt(title, "Agora o numero de CEP: "),
				View.lerDadoString(title, "O logradouro: "),
				View.lerDadoString(title, "O bairro"),
				View.lerDadoString(title, "E por ultimo o UF: ")
		);
		return tmp;
	}
	public void addQrt(Quarto qrt) {
		qrts.add(qrt);
	}
	public void addRecep(Recepcionista recp) {
		recps.add(recp);
	}
	public void addClnt(Cliente clnt) {
		clnts.add(clnt);
	}
	public void addRsvr(Reserva rsrv) {
		rsrvs.add(rsrv);
	}
	public void addRelt(Relatorio relt) {
		relts.add(relt);
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
	public ArrayList<Recepcionista> getRecps() {
		return recps;
	}
	public ArrayList<Quarto> getQrts() {
		return qrts;
	}
	public ArrayList<Reserva> getRsrvs(){
		return rsrvs;
	}
	public ArrayList<Relatorio> getRelts(){
		return relts;
	}
}
