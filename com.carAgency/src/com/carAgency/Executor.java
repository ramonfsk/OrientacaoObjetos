package com.carAgency;

public class Executor {
	public static void main(String[] args) {
		try {
			int option = 1;
			
			CarAgency carAgency = CarAgency.registerCarAgency();
			
			do {
				option = View.solicitarDadosInt("Selecione uma opcao: ",
						"1 - Cadastrar filial\n"
						+"2 - Listar filiais\n"
						+"3 - Selecionar uma filial\n"
						+"4 - Relatorio GERAL\n"
						+"0 - Sair.."
				);
				switch (option) {
				case 0:
					option = 0;
					break;
				case 1:
					if(Branch.getNumBranchs() == CarAgency.getMaxAgencys())
						View.exibirMsgErro("O maximo de filiais foi atingido!");
					else {
						try {
							Branch brnch = Branch.registerBranch();
							carAgency.addBranch(brnch);
						} catch (Exception e) {
							View.exibirMsgErro(e.getMessage());
						}
					}
					break;
				case 2:
					if(Branch.getNumBranchs() == 0)
						View.exibirMsgErro("Nao existem filiais cadastradas!");
					else {
						String msg = Branch.listBranchs(carAgency.getBrnchs());
						View.exibirMsg(msg);
					}
					break;
				case 3:
					if(Branch.getNumBranchs() == 0)
						View.exibirMsgErro("Nao existem filiais cadastradas!");
					else {
						subMenuBranch(Branch.selectBranch(carAgency.getBrnchs()));
					}
					break;
				case 4:
					if(Branch.getNumBranchs() == 0 || Sale.getNumSales() == 0)
						View.exibirMsgErro("Nao existem registros de venda!");
					else {
						Report.buildReportAll(carAgency.getBrnchs());
					}
					break;
				default:
					View.exibirMsgErro("Opcao invalida!");
					break;
				}
			} while (option != 0);
		} catch (Exception e) {
			View.exibirMsgErro(e.getMessage()+"\nO programa sera finalizado!");
		}
	
	}
	
	public static void subMenuBranch(Branch brnch) {
		int option = 1;
		
		do {
			option = View.solicitarDadosInt(brnch.getStoreName(), 
					"1 - Cadastrar um carro\n"
					+"2 - Cadastrar um cliente\n"
					+"3 - Realizar uma venda\n"
					+"4 - Gerar relat�rio de vendas\n"
					+"0 - Voltar.."
			);
			switch (option) {
			case 0:
				option = 0;
				break;
			case 1:
				try {
					Car car = Car.registerCar();
					brnch.addCar(car);
				} catch (Exception e) {
					View.exibirMsgErro(e.getMessage());
				}
				break;
			case 2:
				try {
					Client clnt = Client.registerClient();
					brnch.addClient(clnt);
				} catch (Exception e) {
					View.exibirMsgErro(e.getMessage());
				}
				break;
			case 3:
				if(Car.getNumCars() == 0 && Client.getNumClients() == 0)
					View.exibirMsgErro("N�o existem carros nem clientes cadastrados!");
				else {
					int amountCarsAvailable = 0;
					for (Car car : brnch.getCars()) {
						if(!car.getIsItsSold())
							amountCarsAvailable++;
					}
					if(amountCarsAvailable == 0)
						View.exibirMsgErro("Nao ha carros disponiveis para vender!");
					else {
						if(!Sale.approveCredit(0, 3))
							View.exibirMsgErro("Desculpe, a agencia nao aprovou o credito!");
						else {
							try {
								Sale sale = Sale.registerSale(brnch.getCars(), brnch.getClnts());
								brnch.addSale(sale);
							} catch (Exception e) {
								View.exibirMsgErro(e.getMessage());
							}
						}
					}
				}
				break;
			case 4:
				if(Sale.getNumSales() == 0)
					View.exibirMsgErro("Nao existem vendas registradas!");
				else
					Report.buildReportBranch(brnch);
				break;
			default:
				View.exibirMsgErro("Opcao invalida!");
				break;
			}
		} while (option != 0);
	}
}
