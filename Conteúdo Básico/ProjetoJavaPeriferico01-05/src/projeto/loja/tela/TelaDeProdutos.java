package projeto.loja.tela;

import java.util.Scanner;

import projeto.loja.modulos.Headset;
import projeto.loja.modulos.Mouse;
import projeto.loja.modulos.Produto;
import projeto.loja.modulos.Teclado;
import projeto.loja.util.Mensagem;

public class TelaDeProdutos {

	public static void mostrar() {
		
		Scanner leitor = new Scanner(System.in);
		int opcao = leitor.nextInt();
		
		System.out.println(Mensagem.TELA_PRODUTOS);
		System.out.println(Mensagem.MSG_ESCOLHA);
		System.out.println("[1] "+Mensagem.MSG_LISTAR);
		System.out.println("[2] "+Mensagem.MSG_CADASTRAR);
		System.out.println("[3] "+Mensagem.MSG_EXCLUIR);
		System.out.println("[4] "+Mensagem.MSG_VOLTAR);
		opcao = leitor.nextInt();
		
		switch(opcao) {
		case 1: {
			TelaDeProdutos.listar();
			break;
		}
		case 2: {
			// CADASTRAR NOVO PRODUTO
			break;
		}
		case 3: {
			// EXCLUIR PRODUTO
			break;
		}
		case 4: {
			TelaPrincipal.mostrar();
			break;
		}
		}
		leitor.close();
		
	}
	
	public static void listar() {
		Scanner leitor = new Scanner(System.in);
		
		
		
		Mouse MouseRazer = new Mouse("Mouse Razer",640.80);
		Mouse MouseHyperx = new Mouse("Mouse Hyperx",150.87);
		Mouse MouseDragon = new Mouse("Mouse Red Dragon",150.87);
		Mouse MouseLogTech = new Mouse("Mouse LogTech",150.87);
		
		Teclado TecladoRazer = new Teclado("Teclado Razer",345.78);
		Teclado TecladoHyperx = new Teclado("Teclado Hyperx",339.99);
		Teclado TecladoDragon = new Teclado("Teclado Red Dragon",339.99);
		Teclado TecladoLogTech = new Teclado("Teclado LogTech",339.99);
		
		
		Headset HeadsetRazer = new Headset("Headset Cobra",178.68);
		Headset HeadsetDragon = new Headset("Headset Red Dragon",500.56);
		Headset HeadsetHyperx = new Headset("Headset Hyperx",563.56);
		Headset HeadsetLogTech = new Headset("Headset LogTech ",430.00);
		
		//Adicionando o produto na lista
		Produto produto = new Produto();
		
		
		//Mouses
		produto.adicionar(MouseRazer);//item 0
		produto.adicionar(MouseHyperx);
		produto.adicionar(MouseDragon);
		produto.adicionar(MouseLogTech);
		
		//Teclados
		produto.adicionar(TecladoRazer);//item 0
		produto.adicionar(TecladoHyperx);
		produto.adicionar(TecladoDragon);
		produto.adicionar(TecladoLogTech);
		
//		Headsets
		produto.adicionar(HeadsetRazer);//item 0
		produto.adicionar(HeadsetDragon);
		produto.adicionar(HeadsetHyperx);
		produto.adicionar(HeadsetLogTech);
		
		
		System.out.println("===Lista de produtos===\n");
		System.out.println("===Teclados===\n");
		for(Teclado teclados : produto.getTeclados()) {
	    System.out.println("Nome:"+teclados.getNome()+
	    		"\nValor:" +teclados.getValor()+"\n");

	}

		System.out.println("===Mouses===\n");	
		for(Mouse mouses : produto.getMouse()) {
	    System.out.println("Nome:"+mouses.getNome()+
	    		"\nValor:" +mouses.getValor()+"\n");

	}

		System.out.println("===Headsets===\n");
		for(Headset headsets : produto.getHeadsets()) {
	    System.out.println("Nome:"+headsets.getNome()+
	    		"\nValor:" +headsets.getValor()+"\n");

	}
		System.out.println(""+Mensagem.MSG_ESCOLHA);
		System.out.println("[1] "+Mensagem.MSG_VOLTAR);
		System.out.println("[2] Sair");
		int opcao = leitor.nextInt();
		
		
		switch(opcao) {
		case 1:{
			TelaPrincipal.mostrar();
	}
		case 2: {
			System.out.println(Mensagem.MSG_ENCERRANDO);
		}
		}
		
				
	}
	
}
