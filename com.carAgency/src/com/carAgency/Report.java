package com.carAgency;

import java.util.ArrayList;

public class Report {
	
	public static void buildReportAll(ArrayList<Branch> brnchs) {
		int countCars, countClnts, countSales, countBrnchs = 0;
		double totalSales = 0.0;
		StringBuilder builder = new StringBuilder();
		for (Branch brnch : brnchs) {
			builder.append((countBrnchs+1)+" - Filial: "+brnch.getStoreName()+"\n");
			for (countClnts = 0; countClnts < Client.getNumClients(); countClnts++)
				builder.append("Cliente: "+brnch.getSales().get(countClnts).getClnt().getName()+"\n");
			for (countCars = 0; countCars < Car.getNumCars(); countCars++)
				builder.append("Carro: "+brnch.getSales().get(countCars).getCar().getModel()+"\n");
			for (countSales = 0; countSales < Sale.getNumSales(); countSales++) {
				builder.append("Valor: R$ "+brnch.getSales().get(countSales).getCar().getValue()+"\n");
				totalSales += brnch.getSales().get(countSales).getCar().getValue();
			}
			builder.append("\n\n");
			countBrnchs++;
		}
		builder.append("\nQtd. Clientes: "+Client.getNumClients()+"\n");
		builder.append("Qtd. Vendas"+Sale.getNumSales()+"\n");
		builder.append("\nTOTAL: R$"+totalSales);
		String msg = builder.toString();
		View.exibirMsg("Relatorio Geral\n"+msg);
	}
	
	public static void buildReportBranch(Branch brnch) {
		int countCars, countClnts, countSales;
		double totalSales = 0.0;
		StringBuilder builder = new StringBuilder();
		for (countClnts = 0; countClnts < brnch.getClnts().size(); countClnts++)
			builder.append("Cliente: "+brnch.getSales().get(countClnts).getClnt().getName()+"\n");
		for (countCars = 0; countCars < Car.getNumCars(); countCars++)
			builder.append("Carro: "+brnch.getSales().get(countCars).getCar().getModel()+"\n");
		for (countSales = 0; countSales < Sale.getNumSales(); countSales++) {
			builder.append("Valor: R$ "+brnch.getSales().get(countSales).getCar().getValue()+"\n");
			totalSales += brnch.getSales().get(countSales).getCar().getValue();
		}
		builder.append("\nQtd. Clientes: "+Client.getNumClients()+"\n");
		builder.append("Qtd. Vendas"+Sale.getNumSales()+"\n");
		builder.append("\nTOTAL: R$"+totalSales);
		String msg = builder.toString();
		View.exibirMsg("Relatorio Geral\n"+msg);
	}
}
