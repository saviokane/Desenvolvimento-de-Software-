package projeto.loja.tela;

import java.util.Scanner;
import projeto.loja.controller.ControlProduto;
import projeto.loja.util.Mensagem;

public class TelaDeProdutos {
	static int id=0;
	public static void mostrar() {
		
		Scanner leitor = new Scanner(System.in);
		int opcao ;
		
	if(id == 0) {	
		
		System.out.println(Mensagem.TELA_PRODUTOS);
	}
		System.out.println(Mensagem.MSG_ESCOLHA);
		System.out.println("[1] "+Mensagem.MSG_LISTAR);
		System.out.println("[2] "+Mensagem.MSG_CADASTRAR);
		System.out.println("[3] "+Mensagem.MSG_EXCLUIR);
		System.out.println("[4] "+Mensagem.MSG_ALTERACAO);
		System.out.println("[5] "+Mensagem.MSG_VOLTAR);
		opcao = leitor.nextInt();
		id++;
		
		switch(opcao) {
		case 1: 
			ControlProduto.listar();
			break;
		case 2:
			ControlProduto.cadastrar();
			break;
		case 3: 
			ControlProduto.excluir();
			break;
		case 4:
			ControlProduto.atualizar();
			break;
		case 5: 
			id=id-id;
			TelaPrincipal.mostrar();
			break;
	}
		leitor.close();
		
	}
	

}
