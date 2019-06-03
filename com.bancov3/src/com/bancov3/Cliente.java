package com.bancov3;

public class Cliente extends Pessoa {
	//ATTRIBUTES
	//CONSTRUCTOR
	public Cliente() {
		super.setNivelAgencia(true);
	}
	//METHODS
	public static Cliente cadastroCliente() {
		String title = "Cadastro de Cliente";
		Cliente tmpClnt = new Cliente(
				View.requestString(title, "Informe o nome do cliente: "),
				View.requestInt(title, ""),
				View.requestInt(title, ""),
				View.requestInt(title, ""),
				View.requestInt(title, "")
		);
		return tmpClnt;
	}
	//GETTERS & SETTERS
}
