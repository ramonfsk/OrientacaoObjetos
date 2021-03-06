package com.locadorav2;

public class Executora {
	public static void main(String[] args) {
		
		Locadora lcdr = new Locadora("MATRIX");
		
		int opcao = 0;
		do {
			opcao = View.solicitarDadosInt("Selecione uma opcao: ",
					"1 - Cadastrar filial\n"
					+"2 - Listar filiais\n"
					+"3 - Selecionar uma filial\n"
					+"0 - Sair.."
			);
			switch (opcao) {
			case 0:
				opcao = 0;
				break;
			case 1:
				try {
					Filial fTmp = Filial.cadastrarFilial();
					lcdr.addFilial(fTmp);
				} catch (Exception e) {
					View.exibirMsgErro(e.getMessage());
				}
				break;
			case 2:
				if(lcdr.getFlais().size() != 0) {
					String tmp = null;
					tmp = Filial.listaFiliais(lcdr.getFlais());
					View.exibirMsg(tmp);
				} else
					View.exibirMsgErro("Nao existem filiais cadastradas!");
				break;
			case 3:
				if(lcdr.getFlais().size() != 0) {
					subMenuFilial(Filial.selecionaFilial(lcdr.getFlais()));
				} else
					View.exibirMsgErro("Nao existem filiais cadastradas!");
				break;
			default:
				View.exibirMsgErro("Opcao invalida!");
				break;
			}
		} while (opcao != 0);
	}
	
	public static void subMenuFilial(Filial flal) {
		int opcao = 0;
		do {
			opcao = View.solicitarDadosInt(flal.getNome(),
					"1 - Cadastrar um filme\n"
					+"2 - Cadastrar um cliente\n"
					+"3 - Cadastrar um funcionario\n"
					+"4 - Realizar uma locacao\n"
					+"0 - Sair.."
			);
			switch (opcao) {
			case 0:
				opcao = 0;
				break;
			case 1:
				try {
					Filme flm = Filme.cadastraFilme();
					flal.addFilme(flm);
					//System.out.println(Filme.getCountFilmes());
				} catch (Exception e) {
					View.exibirMsgErro(e.getMessage());
				}
				break;
			case 2:
				try {
					Cliente clnt = Cliente.cadastraClnt();
					flal.addCliente(clnt);
				} catch (Exception e) {
					View.exibirMsgErro(e.getMessage());
				}
				break;
			case 3:
				try {
					Funcionario func = Funcionario.cadastraFunc();
					flal.addFuncionario(func);
				} catch (Exception e) {
					View.exibirMsgErro(e.getMessage());
				}
				break;
			case 4:
				try {
					if((flal.getFlms().size() > 0) && (flal.getFuncs().size() > 0) && (flal.getClnts().size() > 0)) {
						int countFilmesDisponveis = 0;
						for (Filme filme : flal.getFlms()) {
							if(!filme.getEstaAlugado())
								countFilmesDisponveis++;
						}
						if(countFilmesDisponveis == 0)
							View.exibirMsgErro("Nao existem filmes disponiveis para serem alugados!");
						else {
							Locacao loc = Locacao.cadastrarLocs(flal.getClnts(), flal.getFuncs(), flal.getFlms());
							flal.addLocacao(loc);
							System.out.println("Filme: "+flal.getLocs().get(0).getFlms().get(0).getTitulo());
							System.out.println("Funcionario: "+flal.getLocs().get(0).getFunc().getNome());
							System.out.println("Cliente: "+flal.getLocs().get(0).getClnt().getNome());
							System.out.println("Data: "+flal.getLocs().get(0).getDataHora());
						}
					} else
						View.exibirMsgErro("Nao existem filmes, clientes ou funcionarios cadastrados!");
				} catch (Exception e) {
					View.exibirMsgErro(e.getMessage());
				}
				break;
			default:
				break;
			}
		} while (opcao != 0);
	}
}
