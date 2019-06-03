package com.hotelv1;

import java.util.ArrayList;

public class Relatorio {
	//METHODS
	public static void geraRelRsrvs(ArrayList<Reserva> rsrvs) {
		String msg = null;
		StringBuilder builder = new StringBuilder();
		for (Reserva rsrv : rsrvs) {
			builder.append("Codigo: "+rsrv.getCodigo()+" | Cliente: "+rsrv.getClnt().getNome()+" | R$ "+rsrv.getValorTotal()+".\n");
		}
		msg = builder.toString();
		View.exibirMsg("Relatorio GERAL", msg);
	}
}
