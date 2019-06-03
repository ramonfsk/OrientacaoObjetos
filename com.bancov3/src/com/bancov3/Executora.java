package com.bancov3;

public class Executora {
	public static void main(String[] args) {
		Banco bnc = Banco.cadastraBanco();
		Cliente clnt = Cliente.cadastroCliente();
		bnc.addCliente(clnt);
		//String opcoes[] = {"Cliente", "Funcionario", "Gerente", "Diretor"}; 
		int opcao = 0;

		do {
			opcao = View.requestInt("Selecao de Perfil", 
					"1 - Cliente\n"
					+"2 - Funcionario\n"
					+"3 - Gerente\n"
					+"4 - Diretor\n"
					+"0 - Sair.."
			);
			switch (opcao) {
				case 0:
					opcao = 0;
					break;
				case 1:
					Utils.validaSenha(clnt, 1234);
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				default:
					View.showErrorMsg("Opcao invalida!");
					break;
				}
		} while (opcao != 0);
	}
}
