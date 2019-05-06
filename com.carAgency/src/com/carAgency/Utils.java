package com.carAgency;

public class Utils {
	public static void validaString(String str) {
		if(str.isEmpty())
			throw new IllegalArgumentException("Nome vazio!");
		if(!str.matches("^[ a-zA-Z¡¬√¿«… Õ”‘’⁄‹·‚„‡ÁÈÍÌÛÙı˙¸]*$"))
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
	
	public static void validaEmail(String email) {
		if(email.isEmpty())
			throw new IllegalArgumentException("Numero vazio!");
		if(!email.matches("^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$"))
			throw new IllegalArgumentException("Email invalido!");
	}
	
	public static void validaInt(int num) {
		if(num <= 0)
			throw new IllegalArgumentException("Numero invalido!");
	}
	
	public static void validaDouble(double num) {
		if(num <= 0)
			throw new IllegalArgumentException("Numero invalido!");
	}
}
