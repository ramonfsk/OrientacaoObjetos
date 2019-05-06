package com.carAgency;

import java.util.ArrayList;

public class CarAgency {
	private static int maxAgencys = 3;
	private String name;
	private ArrayList<Branch> brnchs = new ArrayList<Branch>();
	
	public CarAgency(String name) {
		setName(name);
	}

	public static CarAgency registerCarAgency() {
		CarAgency tmpCarAgency = new CarAgency(
				View.solicitarDadosString(null, "Qual o nome da agencia: ")
		);
		return tmpCarAgency;
	}
	
	public void addBranch(Branch brnch) {
		if(Branch.getNumBranchs() > maxAgencys) {
			View.exibirMsgErro("O maximo de filiais foi atingido!");
		} else
			brnchs.add(brnch);
	}
	
	public static int getMaxAgencys() {
		return maxAgencys;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		Utils.validaString(name);
		this.name = name;
	}

	public ArrayList<Branch> getBrnchs() {
		return brnchs;
	}
}
