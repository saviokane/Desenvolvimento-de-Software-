package projeto.loja.tela;

import java.util.Scanner;

import projeto.loja.util.Mensagem;

public class TelaDeClientes {

	public static void mostrar() {
		
		Scanner leitor = new Scanner(System.in);
		int opcao = leitor.nextInt();
		
		
		System.out.println(Mensagem.TELA_CLIENTES);
		System.out.println(Mensagem.MSG_ESCOLHA);
		System.out.println("[1] "+Mensagem.MSG_LISTAR);
		System.out.println("[2] "+Mensagem.MSG_CADASTRAR);
		System.out.println("[3] "+Mensagem.MSG_EXCLUIR);
		System.out.println("[4] "+Mensagem.MSG_VOLTAR);
		
		switch(opcao) {
		case 1:
			// LISTAR NOVO 
			break;
		case 2:
			// CADASTRAR NOVO PRODUTO
			break;
		case 3:
			// EXCLUIR PRODUTO
			break;
		case 4:
			TelaPrincipal.mostrar();
			break;
		}
	}
}
