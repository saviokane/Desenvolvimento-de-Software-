package projeto.loja.tela;
import projeto.loja.controller.ControlPedido;
import projeto.loja.util.*;
import java.util.Scanner;
public class TelaPrincipal{
	
	public static void mostrar() {
		int opcao;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(Mensagem.TELA_PRINCIPAL);
		System.out.println(Mensagem.MSG_ESCOLHA);
		System.out.println("[1] "+Mensagem.MENU_PEDIDOS);
		System.out.println("[2] "+Mensagem.MENU_CLIENTES);
		System.out.println("[3] "+Mensagem.MENU_PRODUTOS);
		System.out.println("[4] "+Mensagem.MSG_SAIR );
		
		opcao = leitor.nextInt();
		leitor.nextLine();
		switch(opcao) {
		case 1:{
		ControlPedido.selecionar();
			break;
		}
		case 2:{
			TelaDeClientes.mostrar();
			break;
		}
		case 3: {
			TelaDeProdutos.mostrar();
			break;
		}
		case 4: {
			System.out.println(Mensagem.MSG_ENCERRANDO);
			break;
		}
	}
		leitor.close();
		
	}
	
}

