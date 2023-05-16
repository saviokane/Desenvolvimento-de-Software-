package projeto.loja.controller;


import java.util.List;
import java.util.Scanner;
import projeto.loja.modulos.ListaCliente;
import projeto.loja.modulos.Headset;
import projeto.loja.modulos.ListaPedido;
import projeto.loja.modulos.Mouse;
import projeto.loja.modulos.Pedido;
import projeto.loja.modulos.Pessoa;
import projeto.loja.modulos.ListaProduto;
import projeto.loja.modulos.Teclado;
import projeto.loja.tela.TelaDePedidos;
import projeto.loja.tela.TelaDeProdutos;
import projeto.loja.tela.TelaPrincipal;
import projeto.loja.util.Mensagem;


public class ControlPedido {
	static 	ListaPedido listaPedido = new ListaPedido();
		public static void selecionar() {
		Scanner leitor = new Scanner (System.in);
		int opcao = 0,i = 0;


		
		List<Pessoa> clientes = ControlCliente.getClientes();
		List<Teclado> teclado = ControlProduto.getTecladoLista();
		List<Mouse> mouse = ControlProduto.getMouseLista();
		List<Headset> headset = ControlProduto.getHeadsetLista();
		Pedido pedido = new Pedido();
	
		System.out.println("[1] Selecionar Cliente e Produto\n"
				+ "[2] Voltar");
		opcao = leitor.nextInt();
		leitor.nextLine();
		
		
		switch(opcao) {
		case 1:
			 for (Pessoa registro : clientes) {
			        i++;
			        System.out.println("\n[" + i +"]" +Mensagem.MSG_NOME + registro.getNome() +
			                            Mensagem.MSG_CPF  + registro.getCpf() +
			                            Mensagem.MSG_TELEFONE + registro.getTelefone()+
			                            Mensagem.MSG_TELEFONE + registro.getEmail());
			    }
			 
			    System.out.println("\n"+Mensagem.EXCLUIR_CLIENTE);
			    opcao = leitor.nextInt();
			    leitor.nextLine();
				Pessoa pessoa = new Pessoa ();

				
			    if (opcao > 0 && opcao <= clientes.size()) {
			    	pessoa.setNome(clientes.get( opcao - 1 ).getNome());
			    	
			    	pedido.setPessoa(pessoa);
			    	  

			    	System.out.println("\n"+Mensagem.CLIENTE_SELECIONADO + pessoa.getNome()+"\n");
			     

			    }
			
			


				  System.out.println(Mensagem.MSG_ESCOLHA);
				  System.out.println(Mensagem.MSG_TECLADO+
						       "\n"+ Mensagem.MSG_HEADSET+ 
						       "\n"+ Mensagem.MSG_MOUSE);
				  int escolha = leitor.nextInt();  
				  leitor.nextLine();  
				  
				  int eduardo = 0;
				  int savio = 0;
				  int rafael = 0;
				  
				  switch (escolha) {
				  
				  case 1:
					  int id=0;
				   if(teclado.size()==0) {
					   System.out.println(Mensagem.ADD_PRODUTO);

				   }else {
		 
				    for (Teclado teclados : teclado) {
				        id++;
				        
				        System.out.println("\nID: ["+id+"]\n"+Mensagem.MSG_MARCA + teclados.getNome() +
				                            		   Mensagem.MSG_VALOR + teclados.getValor());
				      
				    }
				    
				    System.out.println(Mensagem.EXCLUIR_CLIENTE);
				   opcao = leitor.nextInt();
				   leitor.nextLine(); 
				   
				   Teclado teclados = new Teclado();
				    if (opcao > 0 && opcao <= teclado.size()) {
				    	
				    	
				       teclados.setNome(teclado.get(opcao - 1).getNome());
				       teclados.setValor(teclado.get(opcao - 1).getValor());
				        
			
				       pedido.setTeclado(teclados);
				    	eduardo = 1;
				       
					   System.out.println(Mensagem.MSG_PRODUTO_SELECIONADO + teclados.getNome());
					       
				    }
				    
				    i=0;
				  id=0;
				   }    

				  break;
				  case 2:
					  int id_headsets=0;
					   if(headset.size()==0) {
						   System.out.println(Mensagem.ADD_PRODUTO);
					   }else {
			 
					    for (Headset headsets : headset) {
					        id_headsets++;
					        System.out.println("\nID: ["+id_headsets+"]\n"+Mensagem.MSG_MARCA + headsets.getNome() +
					                            		   Mensagem.MSG_VALOR + headsets.getValor());
					    }
	
					    System.out.println(Mensagem.EXCLUIR_CLIENTE);
					    opcao = leitor.nextInt();
					    leitor.nextLine();
					    
						Headset headsets = new Headset();
					    if (opcao > 0 && opcao <= headset.size()) {
					       
					    	headsets.setNome(headset.get(opcao - 1).getNome());
					    	headsets.setValor(headset.get(opcao - 1).getValor());
					    	
					    	pedido.setHeadset(headsets);	
	
					    	rafael = 2;
						       System.out.println(Mensagem.MSG_PRODUTO_SELECIONADO+ headsets.getNome());
					    }
					    i = 0;
						   id_headsets=0;
					   }
					  break;
				  	  case 3:
				  		  int id_mouse =0;
					   if(mouse.size()==0) {
						   System.out.println(Mensagem.ADD_PRODUTO);

					   }else {
						   
					    for (Mouse mouses : mouse) {
					        id_mouse++;
					       
					        System.out.println("\nID: ["+id_mouse+"]\n"+Mensagem.MSG_MARCA + mouses.getNome() +
					                                   Mensagem.MSG_VALOR + mouses.getValor());
					    }
	
					    System.out.println(Mensagem.EXCLUIR_CLIENTE);
					    opcao = leitor.nextInt();
					    leitor.nextLine();
					    
					    Mouse mouses = new Mouse();
					    if (opcao > 0 && opcao <= mouse.size()) {
					    	
					    	
					    	
					       mouses.setNome( mouse.get(opcao - 1).getNome());
					       mouses.setValor( mouse.get(opcao - 1).getValor());
	
					       pedido.setMouse(mouses);
							  
					       savio = 3;
					       
					       System.out.println(Mensagem.MSG_PRODUTO_SELECIONADO + mouses.getNome());
					    }
					    i = 0;
					  
					   id_mouse=0;
					   }
					   

				  break;

			 }
				  
				  listaPedido.adicionar(pedido);
				  
				  System.out.println("[1]Finalizar pedido"
				  					+ "\n[2] Voltar menu");
				  escolha = leitor.nextInt();
				  leitor.nextLine();
				  
				  
				 if(escolha == 1) { 
				 	int id_Pedido=0;
					  System.out.println(Mensagem.TELA_PEDIDO_REALIZADO);
						
					  
					  if(eduardo == 1) {
						  for (Pedido pedidos : listaPedido.getPedido()) {
					  
							id_Pedido++;
								System.out.println(id_Pedido+" Nome: " + pedidos.getPessoa().getNome()+" Produto " + pedidos.getTeclado().getNome()+ " Valor " + pedidos.getTeclado().getValor()+"\n" );	
						}
					  }
					if(rafael == 2) {
					  for (Pedido pedidos : listaPedido.getPedido()) {
							id_Pedido++;
							System.out.println(id_Pedido+" Nome: " + pedidos.getPessoa().getNome()+" Produto " + pedidos.getHeadset().getNome()+ " Valor " + pedidos.getHeadset().getValor()+"\n" );

						}
					}
					if(savio == 3) {
					for (Pedido pedidos : listaPedido.getPedido()) {
							id_Pedido++;
							System.out.println(id_Pedido+" Nome: " + pedidos.getPessoa().getNome()+" Produto " + pedidos.getMouse().getNome()+ " Valor " + pedidos.getMouse().getValor()+"\n" );
						}
					}
						id_Pedido=0;
						TelaPrincipal.mostrar();
						
				 }else {
					 	listaPedido.remover(pedido);
					 	TelaPrincipal.mostrar();
				 }
				 
				
				 break;
				  case 2:

						TelaPrincipal.mostrar();
						break;
						
			}
		
		
		
	}
}


		


