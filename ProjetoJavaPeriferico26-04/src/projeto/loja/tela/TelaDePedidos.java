package projeto.loja.tela;

import java.util.Scanner;

import projeto.loja.util.Mensagem;

public class TelaDePedidos {
	
	public static void mostrar() {
		
	Scanner leitor = new Scanner(System.in);
	int opcao = leitor.nextInt();
	
	System.out.println(Mensagem.TELA_PEDIDOS);
	System.out.println(Mensagem.MSG_ESCOLHA);
	System.out.println("[1] "+Mensagem.MSG_LISTAR);
	System.out.println("[2] "+Mensagem.MSG_CADASTRAR);
	System.out.println("[3] "+Mensagem.MSG_EXCLUIR);
	System.out.println("[4] "+Mensagem.MSG_VOLTAR);
	opcao = leitor.nextInt();
	
	switch(opcao) {
	case 1:
		// LISTAR NOVO PEDIDO
		break;
	case 2:
		// CADASTRAR NOVO PEDIDO
		break;
	case 3:
		// EXCLUIR PEDIDO
		break;
	case 4:
		TelaPrincipal.mostrar();
		break;
	}
	leitor.close();
	
}
}