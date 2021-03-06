package com.locadorav2;

public class Utils {
	
	public static void validaCodigo(int codigo) {
		if(codigo < 0)
			throw new IllegalArgumentException("Codigo de filme invalido!");
	}
	
	public static void validaString(String str) {
		if(str.isEmpty())
			throw new IllegalArgumentException("Nome vazio!");
		if(!str.matches("^[ a-zA-Z��������������������������]*$"))
			throw new IllegalArgumentException("Nao e permitido inserir numeros nesse campo!");
	}
	
	public static void validaTelefone(String telefone) {
		if(telefone.isEmpty())
			throw new IllegalArgumentException("Numero vazio!");
		/*if(telefone.length() < 12 || telefone.length() > 12)
			throw new IllegalArgumentException("Numero de telefone invalido!");*/
		if(!telefone.matches("^[0-9]*$"))
			throw new IllegalArgumentException("Nao e permitido inserir letras nesse campo!");
	}
}
