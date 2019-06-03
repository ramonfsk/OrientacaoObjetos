package com.bancov3;

public class Gerente extends Funcionario {
	//ATTRIBUTES
	//CONSTRUCTOR
	public Gerente() {
		super.setNivelAgencia(true);
		super.setNivelCaixa(true);
		super.setNivelSalaReuniao(true);
		super.setNivelArquivos(true);
	}
	//METHODS
	//GETTERS & SETTERS
}
