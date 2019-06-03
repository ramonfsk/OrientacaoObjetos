package com.hotelv1;

import javax.swing.JOptionPane;

public class View {
	//Exibir mensagem simples
	public static void exibirMsg(String title, String msg) {
		JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
	}
	//Exibir mensagem de erro
	public static void exibirMsgErro(String title, String msg) {
		JOptionPane.showMessageDialog(null, msg, title, JOptionPane.ERROR_MESSAGE);
	}
	//Solicitar dados String
	public static String lerDadoString(String title, String msg) {
		String tmpData = null;
		boolean flag = false;
		do {
			try {
				tmpData = JOptionPane.showInputDialog(null, msg, title, JOptionPane.QUESTION_MESSAGE);
				if(tmpData == null)
					throw new NullPointerException();
				Utils.validaString(tmpData);
				flag = true;
			} catch (Exception e) {
				View.exibirMsgErro("ERROR", e.getMessage());
			}
		} while (!flag);
		return tmpData;
	}
	//Solicitar dados Int
	public static int lerDadoInt(String title, String msg) {
		String tmpData = null;
		boolean flag = false;
		do {
			try {
				tmpData = JOptionPane.showInputDialog(null, msg, title, JOptionPane.QUESTION_MESSAGE);
				if(tmpData == null)
					throw new NullPointerException();
				Utils.validaInt(Integer.parseInt(tmpData));
				flag = true;
			} catch (Exception e) {
				View.exibirMsgErro("ERROR", e.getMessage());
			}
		} while (!flag);
		return Integer.parseInt(tmpData);
	}
	//Solicitar dados em Double
	public static double lerDadoDouble(String title, String msg) {
		String tmpData = null;
		boolean flag = false;
		do {
			try {
				tmpData = JOptionPane.showInputDialog(null, msg, title, JOptionPane.QUESTION_MESSAGE);
				if(tmpData == null)
					throw new NullPointerException();
				Utils.validaDouble(Double.parseDouble(tmpData));
				flag = true;
			} catch (Exception e) {
				View.exibirMsgErro("ERROR", e.getMessage());
			}
		} while (!flag);
		
		return Double.parseDouble(tmpData);
	}
	//Solicitar dado boolean
	public static boolean lerDadoBoolean(String title, String msg) {
		if(JOptionPane.showConfirmDialog(null, msg, title, JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
			return false;
		else
			return true;
	}
}
