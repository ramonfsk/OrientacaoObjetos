/* Hotel_v1
 * Esse sistema tem como finalidade gerenciar todo o sistema de reserva de quartos para os clientes.
 */

package com.hotelv1;

import java.util.ArrayList;

public class Executor {
	public static void main(String[] args) {
		int option = 1;
		try {
			Hotel htl = Hotel.registrarHotel();
			do {
				option = View.lerDadoInt("MENU", "Selecione uma opcao:\n"
						+"1 - Cadastrar um Quarto\n"
						+"2 - Cadastrar um Recepcionista\n"
						+"3 - Cadastrar um Cliente\n"
						+"4 - Realizar uma Reserva\n"
						+"5 - Relatorios...\n"
						+"0 - Sair.."
				);
				switch (option) {
					case 0:
						option = 0;
						break;
					case 1:
						try {
							Quarto qrtTmp = Quarto.registrarQuarto();
							htl.addQrt(qrtTmp);
						} catch (Exception e) {
							View.exibirMsgErro("ERROR", e.getMessage());
						}
						break;
					case 2:
						try {
							Recepcionista recpTmp = Recepcionista.registrarRecepcionista();
							htl.addRecep(recpTmp);
						} catch (Exception e) {
							View.exibirMsgErro("ERROR", e.getMessage());
						}
						break;
					case 3:
						try {
							Cliente clntTmp = Cliente.registrarCliente();
							htl.addClnt(clntTmp);
						} catch (Exception e) {
							View.exibirMsgErro("ERROR", e.getMessage());
						}
						break;
					case 4:
						if(htl.getQrts().size() == 0 || htl.getRecps().size() == 0 || htl.getClnts().size() == 0)
							View.exibirMsgErro("ERROR", "Nao existem quartos, recepcionistas ou clientes cadastrados!");
						else {
							try {
								Reserva rsrvTmp = Reserva.registrarReserva(htl.getClnts(), htl.getRecps(), htl.getQrts());
								htl.addRsvr(rsrvTmp);
							} catch (Exception e) {
								View.exibirMsgErro("ERROR", e.getMessage());
							}
						}
						break;
					case 5:
						if(htl.getQrts().size() == 0 || htl.getRecps().size() == 0 || htl.getClnts().size() == 0)
							View.exibirMsgErro("ERROR", "Nao existem quartos, recepcionistas ou clientes cadastrados!");
						else
							menuRelatorios(htl.getRsrvs());
						break;
					default:
						View.exibirMsgErro("ERROR", "Opcao invalida!");
						break;
				}
			} while (option != 0);
		} catch (Exception e) {
			View.exibirMsgErro("ERROR", e.getMessage());
		}
	}
	
	public static void menuRelatorios(ArrayList<Reserva> rsrvs) {
		int option = 1;
		do {
			option = View.lerDadoInt("RELATORIOS", "Selecione uma opcao:\n"
					+"1 - Relatorio GERAL\n"
					+"0 - Voltar.."
			);
			switch (option) {
				case 0:
					option = 0;
					break;
				case 1:
					Relatorio.geraRelRsrvs(rsrvs);
					break;
				default:
					View.exibirMsgErro("ERROR", "Opcao invalida!");
					break;
			}
		} while (option != 0);
	}
}