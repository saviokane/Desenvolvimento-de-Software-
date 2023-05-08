package projeto.loja.controller;
import projeto.loja.modulos.*;
import projeto.loja.util.Mensagem;
import java.util.Scanner;
import projeto.loja.modulos.Pessoa;
import projeto.loja.tela.TelaDeClientes;
import projeto.loja.tela.TelaDePedidos;
import projeto.loja.tela.TelaPrincipal;



public class ControlCliente {

	static String cliente;
	static Cadastro registro = new Cadastro();
	static int i;
	public static void cadastrar() {
		
		System.out.println(Mensagem.CADASTRO_CLIENTES);
		Scanner leitor = new Scanner(System.in);
		String nome,cpf,email,telefone;
		
		System.out.println(Mensagem.CADASTRA_NOME);
		nome = leitor.nextLine();
		
		System.out.println(Mensagem.CADASTRA_CPF);
		cpf = leitor.nextLine();
		
		System.out.println(Mensagem.CADASTRA_TELEFONE);
		telefone = leitor.nextLine();
		
		System.out.println(Mensagem.CADASTRA_EMAIL);
		email = leitor.nextLine();
		
		Pessoa cliente = new Pessoa();
		
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setEmail(email);
		cliente.setTelefone(telefone);
		
		
		registro.adicionar(cliente);
		
		System.out.println("\n"+Mensagem.MSG_CLIENTE+nome+"\n");
		
		TelaDeClientes.mostrar();
		leitor.close();
	}
	
	public static void listar() {
		if(registro.getPessoa().size()== 0) {
			System.out.println("\n"+Mensagem.CLIENTE_NULLO+"\n");
			
		}else {
		
			System.out.println("\n"+Mensagem.TELA_LISTA_CLIENTES);
	
			for(Pessoa registro : registro.getPessoa()) {
			System.out.println("\nNOME: "+registro.getNome()+
							    "\nCPF: "+registro.getCpf()+
							    "\nTELEFONE: "+registro.getEmail()+"\n");
			System.out.flush();
			}
		}
		
		TelaDeClientes.mostrar();
	}
	
	public static void excluir() {
	    Scanner leitor = new Scanner(System.in);

	    for (Pessoa registro : registro.getPessoa()) {
	        i++;
	      
	        System.out.println(i+".NOME: " + registro.getNome() +
	                            "\nCPF: " + registro.getCpf() +
	                            "\nTELEFONE: " + registro.getTelefone()+
	                            "\nEmail: " + registro.getEmail());
	    }

	    System.out.println(Mensagem.EXCLUIR_CLIENTE);

	    i = leitor.nextInt();
	    if (i > 0 && i <= registro.getPessoa().size()) {
	        registro.getPessoa().remove(i - 1);
	        System.out.println("Registro removido com sucesso!");
	    } else {
	        System.out.println("ID inválido, por favor tente novamente.");
	    }
	    i=0;
	    ControlCliente.listar();
	    leitor.close();
	}
	
	public static void atualizar() {
	    Scanner leitor = new Scanner (System.in);
	    
//	    System.out.println(Mensagem.ATUALIZAR_CLIENTE);
	    
	    for (int i = 0; i < registro.getPessoa().size(); i++) {
	        Pessoa pessoa = registro.getPessoa().get(i);
	        System.out.println((i + 1) + ". " + pessoa.getNome() + " - " + pessoa.getCpf());
	    }
	    
	    System.out.println(Mensagem.ATUALIZAR_CLIENTE);
	    int escolha = leitor.nextInt();
	    leitor.nextLine();
	    
	    if (escolha < 1 || escolha > registro.getPessoa().size()) {
	        System.out.println("Opção inválida!");

	    }
	    
	    Pessoa pessoa = registro.getPessoa().get(escolha - 1);
	    
	    System.out.println("Digite o novo nome do cliente:");
	    String nome = leitor.nextLine();
	    
	    System.out.println("Digite o novo CPF do cliente:");
	    String cpf = leitor.nextLine();
	    
	    System.out.println("Digite o novo telefone do cliente:");
	    String telefone = leitor.nextLine();
	    
	    System.out.println("Digite o novo e-mail do cliente:");
	    String email = leitor.nextLine();
	    
	    pessoa.setNome(nome);
	    pessoa.setCpf(cpf);
	    pessoa.setTelefone(telefone);
	    pessoa.setEmail(email);
	    
	    System.out.println("Cliente atualizado com sucesso!");
	    
	    TelaDeClientes.mostrar();
	    leitor.close();
	}

		
	public static void selecionar() {
		Scanner leitor = new Scanner (System.in);
	
		    for (Pessoa registro1 : registro.getPessoa()) {
		        i++;
		      
		        System.out.println("\n" + i+".NOME: " + registro1.getNome() +
		                            "\nCPF: " + registro1.getCpf() +
		                            "\nTELEFONE: " + registro1.getTelefone()+
		                            "\nEmail: " + registro1.getEmail());
		    }

		    System.out.println(Mensagem.EXCLUIR_CLIENTE);
		    i = leitor.nextInt();
		    
		    if (i > 0 && i <= registro.getPessoa().size()) {
		     cliente = registro.getPessoa().get(i-1).getNome();
		     System.out.println("Cliente " + cliente + " Selecionado!");
		     
		    i=0;
		    TelaDePedidos.mostrar();
		    leitor.close();
		   
		    }
		    
	}
	
}
	

