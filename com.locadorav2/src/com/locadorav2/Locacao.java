package com.locadorav2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Locacao {
	//ATTRIBUTES
	private Cliente clnt;
	private Funcionario func;
	private ArrayList<Filme> filmes = new ArrayList<Filme>();
	private String strDataHora;
	private static Date date = new Date();
	private static DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm");
	//CONSTRUCTOR
	public Locacao(Cliente clnt, Funcionario func) {
		setClnt(clnt);
		setFunc(func);
		strDataHora = dateFormat.format(date);
	}
	//METHODS
	public void addFilme(Filme flm) {
		this.filmes.add(flm);
	}
	public static Locacao cadastrarLocs(ArrayList<Cliente> clnts, ArrayList<Funcionario> funcs, ArrayList<Filme> flms) {
		Locacao tmp = new Locacao(
				Cliente.selecionaClnt(clnts),
				Funcionario.selecionaFunc(funcs)
		);
		tmp.addFilme(Filme.selecionaFlm(flms));
		int opcao = View.solicitarDadosInt("Deseja alugar mais algum filme?", 
				"1 - Sim\n"
				+"2 - Nao"
		);
		if(opcao == 1)
			tmp.addFilme(Filme.selecionaFlm(flms));
		return tmp;
	}
	//GETTERS & SETTERS
	public Cliente getClnt() {
		return clnt;
	}
	public void setClnt(Cliente clnt) {
		this.clnt = clnt;
	}
	public Funcionario getFunc() {
		return func;
	}
	public void setFunc(Funcionario func) {
		this.func = func;
	}
	public ArrayList<Filme> getFlms() {
		return filmes;
	}
	public String getDataHora() {
		return strDataHora;
	}
}
