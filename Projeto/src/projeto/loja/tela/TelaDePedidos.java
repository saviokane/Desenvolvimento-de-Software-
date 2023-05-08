package projeto.loja.tela;

import java.util.Scanner;

import projeto.loja.controller.ControlCliente;
import projeto.loja.controller.ControlPedido;
import projeto.loja.controller.ControlProduto;
import projeto.loja.util.Mensagem;

public class TelaDePedidos {
	
	public static void mostrar() {
		
	Scanner leitor = new Scanner(System.in);

	
	System.out.println(Mensagem.TELA_PEDIDOS);
	System.out.println(Mensagem.MSG_ESCOLHA);
	System.out.println("[1] Selecionar Cliente");
	System.out.println("[2] Selecionar Produto");
	System.out.println("[3] Finalizar Pedido");
	System.out.println("[4] Voltar");
	int escolha = leitor.nextInt();
	leitor.nextLine();

	
	switch(escolha) {
	case 1:
		ControlCliente.selecionar();
		// LISTAR NOVO PEDIDO
		break;
	case 2:
		ControlProduto.selecionar();
		// CADASTRAR NOVO PEDIDO
		break;
	case 3:
		ControlPedido.selecionar();
		// EXCLUIR PEDIDO
		break;
	case 4:
		TelaPrincipal.mostrar();
		break;
	}
	leitor.close();
	
}
}