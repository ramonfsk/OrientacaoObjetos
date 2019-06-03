package com.bancov3;

import javax.swing.JOptionPane;

public class View {
	//Exibir mensagem simples na tela
	public static void showMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	//Exibir mensagem de erro na tela
	public static void showErrorMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg, "ERROR", JOptionPane.ERROR_MESSAGE);
	}
	//Solicitar dados em String
	public static String requestString(String title, String msg) {
		String tmpIput = JOptionPane.showInputDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
		return tmpIput;
	}
	//Solicitar dados em Int
	public static int requestInt(String title, String msg) {
		String tmpInput = JOptionPane.showInputDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
		return Integer.parseInt(tmpInput);
	}
	//Solicitar dados em Double
	public static double requestDouble(String title, String msg) {
		String tmpInput = JOptionPane.showInputDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
		return Double.parseDouble(tmpInput);
	}
}
