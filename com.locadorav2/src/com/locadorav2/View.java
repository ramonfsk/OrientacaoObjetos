package com.locadorav2;

import javax.swing.JOptionPane;

public class View {
	//Exibir mensagem simples
	public static void exibirMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	//Exibir mensagem de erro
	public static void exibirMsgErro(String msg) {
		JOptionPane.showMessageDialog(null, msg, "ERROR", JOptionPane.ERROR_MESSAGE);
	}
	//Solicitar dados em string
	public static String solicitarDadosString(String titulo, String msg) {
		String str = JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.INFORMATION_MESSAGE);
		return str;
	}
	//Solicitar dados em inteiro
	public static int solicitarDadosInt(String titulo, String msg) {
		String str = JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.INFORMATION_MESSAGE);
		return Integer.parseInt(str);
	}
	//Solicitar dados em double
	public static double solicitarDadosDouble(String titulo, String msg) {
		String str = JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.INFORMATION_MESSAGE);
		return Double.parseDouble(str);
	}
}
