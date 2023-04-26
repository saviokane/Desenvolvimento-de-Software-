package projeto.loja.tela;
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
		
		switch(opcao) {
		case 1:{
			TelaDePedidos.mostrar();
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
		
		
		// Lista de produtos
		// Lista de clientes
		// Lista de pedidos
//		while(!opcao == 4) {
//			
//		}
		
	}
	
}

