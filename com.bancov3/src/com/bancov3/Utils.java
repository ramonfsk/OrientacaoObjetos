package com.bancov3;

public class Utils {
	public static boolean validaSenha(Pessoa psoa, int senha) throws IllegalArgumentException{
		if(psoa.getSenha() == senha) {
			System.out.println("Acesso permitido!");
			return true;
		} else {
			throw new IllegalArgumentException("Acesso negado!");
		}
	}
}
