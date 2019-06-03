package com.hotelv1;

public abstract class Funcionario extends Pessoa {
	//ATTRIBUTES
	private static int codigo = 0;
	//CONSTRUCTOR
	public Funcionario(){};
	//METHODS
	//GETTERS & SETTERS
	public static int getCodigo() {
		return codigo;
	}
	public static void setCodigo(int codigo) {
		Funcionario.codigo = codigo;
	}
}
