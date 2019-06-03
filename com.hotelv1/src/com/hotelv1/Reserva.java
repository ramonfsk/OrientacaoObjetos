package com.hotelv1;

import java.util.ArrayList;

public class Reserva {
	//ATTRIBUTES
	private static int qtdReservas = 0;
	private int codigo = 100;
	private Cliente clnt;
	private Recepcionista recp;
	private ArrayList<Quarto> qrts = new ArrayList<Quarto>();
	private double desconto;
	private double valorTotal;
	//CONSTRUCTOR
	public Reserva(Cliente clnt, Recepcionista recp, double desconto) {
		setCodigo(getCodigo()+1);
		setClnt(clnt);
		setRecp(recp);
		setDesconto(desconto);
		setValorTotal(0);
		qtdReservas++;
	}
	//METHODS
	public void addQuarto(Quarto qrt) {
		this.qrts.add(qrt);
	}
	public static Reserva registrarReserva(ArrayList<Cliente> clnts, ArrayList<Recepcionista> recps, ArrayList<Quarto> qrts) {
		String title = "Cadastro de Reserva";
		Reserva tmp = new Reserva(
				Cliente.selecionaCliente(clnts),
				Recepcionista.selecionaRecepcionista(recps),
				View.lerDadoDouble(title, "Informe o valor de desconto: ")
		);
		boolean option = false;
		int qtdQuartosReservados = 0;
		do {
			tmp.addQuarto(Quarto.selecionaQuarto(qrts));
			qtdQuartosReservados++;
			if(View.lerDadoBoolean("Opcao", "Deseja reservar mais algum quarto? ") == false || qtdQuartosReservados == Cliente.getQtdMaxQuartos())
				option = false;
			else
				option = true;
		} while (option);
		for (Quarto qrt : qrts)
			tmp.setValorTotal(tmp.getValorTotal() + (tmp.getValorTotal() + qrt.getValorReserva()));
		tmp.setValorTotal(tmp.getValorTotal() - tmp.getDesconto());
		return tmp;
	}
	//GETTERS & SETTERS
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Cliente getClnt() {
		return clnt;
	}
	public void setClnt(Cliente clnt) {
		this.clnt = clnt;
	}
	public Recepcionista getRecp() {
		return recp;
	}
	public void setRecp(Recepcionista recp) {
		this.recp = recp;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public ArrayList<Quarto> getQrts() {
		return qrts;
	}
	public static int getQtdReservas(){
		return qtdReservas;
	}
}
