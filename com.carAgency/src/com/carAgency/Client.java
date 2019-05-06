package com.carAgency;

import java.util.ArrayList;

public class Client {
	private static int numClients = 0;
	private String name;
	private String phone;
	private String email;
	
	public Client(String name, String phone, String email) {
		setName(name);
		setPhone(phone);
		setEmail(email);
		numClients++;
	}
	
	public static Client registerClient() {
		Client tmpClient = new Client(
				View.solicitarDadosString(null, "Qual o nome do cliente: "),
				View.solicitarDadosString(null, "E o telefone: "),
				View.solicitarDadosString(null, "E por ultimo, qual o email: ")
		);
		return tmpClient;
	}
	
	public static String listClients(ArrayList<Client> clnts) {
		int count = 0;
		String list = null;
		StringBuilder builder = new StringBuilder();
		for (Client client : clnts) {
			builder.append((count+1)+" - "+client.getName()+"\n");
			count++;
		}
		list = builder.toString();
		return list;
	}
	
	public static Client selectClient(ArrayList<Client> clnts) {
		String msg = listClients(clnts);
		int option = View.solicitarDadosInt("Selecione um cliente abaixo: ", msg);
		return clnts.get(option-1);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		Utils.validaString(name);
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		Utils.validaTelefone(phone);
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		Utils.validaEmail(email);
		this.email = email;
	}

	public static int getNumClients() {
		return numClients;
	}
}
