package projeto.loja.tela;

import java.util.Scanner;

import projeto.loja.controller.ControlCliente;
import projeto.loja.controller.ControlPedido;
import projeto.loja.controller.ControlProduto;
import projeto.loja.util.Mensagem;

public class TelaDePedidos {
	
	public static void mostrar() {
		
	Scanner leitor = new Scanner(System.in);

//	tem que arrumar aqui tbm meu parça !!
	
	System.out.println(Mensagem.TELA_PEDIDOS);
	System.out.println(Mensagem.MSG_ESCOLHA);
	System.out.println("[1] "+Mensagem.MSG_SELECIONAR_CLIENTE);
	System.out.println("[2]" + Mensagem.MSG_LISTAR);
	System.out.println("[3] "+Mensagem.MSG_VOLTAR);
	int escolha = leitor.nextInt();
	leitor.nextLine();

	switch(escolha) {
	case 1:
		ControlPedido.selecionar();
		break;
	case 2:
		
		break;
	case 3:
		TelaPrincipal.mostrar();
		break;
	}
	leitor.close();
	
}
}