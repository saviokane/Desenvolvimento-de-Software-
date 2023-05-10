package projeto.loja.controller;
import projeto.loja.modulos.*;
import projeto.loja.util.Mensagem;

import java.util.List;
import java.util.Scanner;
import projeto.loja.modulos.Pessoa;
import projeto.loja.tela.TelaDeClientes;
import projeto.loja.tela.TelaDePedidos;

public class ControlCliente {

	static String cliente;
	static ListaCliente registro = new ListaCliente();
	static int i;
	public static void cadastrar() {
		

		System.out.println(Mensagem.CADASTRO_CLIENTES);
		Scanner leitor = new Scanner(System.in);
		String nome,cpf,email,telefone;
		String nome1 = "Savio",cpf1= "023.223.673-76",email1= "savioparedao@omelhor.com",telefone1 = "(79) 9 9232 2311";
		String nome2 = "Eduardo",cpf2= "234.756.023-11",email2= "duduzinho@thebest.com",telefone2 = "(41) 9 9324 6674";
		String nome3 = "Maylon",cpf3= "512.51.235-42",email3= "maylonzinhotankudo@gmail.com",telefone3 = "(11) 9 4231 5233";
				
		System.out.println(Mensagem.CADASTRA_NOME);
		nome = leitor.nextLine();
		
		System.out.println(Mensagem.CADASTRA_CPF);
		cpf = leitor.nextLine();
		
		System.out.println(Mensagem.CADASTRA_TELEFONE);
		telefone = leitor.nextLine();
		
		System.out.println(Mensagem.CADASTRA_EMAIL);
		email = leitor.nextLine();
		
		Pessoa cliente = new Pessoa();
		Pessoa savio = new Pessoa();
		Pessoa eduardo = new Pessoa();
		Pessoa maylon = new Pessoa();
		
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setEmail(email);
		cliente.setTelefone(telefone);
		
		// REGISTRAR OS DADOS PADROES 
		
		savio.setNome(nome1);
		savio.setCpf(cpf1);
		savio.setEmail(email1);
		savio.setTelefone(telefone1);
		
		eduardo.setNome(nome2);
		eduardo.setCpf(cpf2);
		eduardo.setEmail(email2);
		eduardo.setTelefone(telefone2);
		
		maylon.setNome(nome3);
		maylon.setCpf(cpf3);
		maylon.setEmail(email3);
		maylon.setTelefone(telefone3);
		
		
		// ===
		
		registro.adicionar(savio);
		registro.adicionar(eduardo);
		registro.adicionar(maylon);
		registro.adicionar(cliente);
		
	
		
		
		System.out.println("\n"+Mensagem.MSG_CLIENTE+nome+"\n");
		
		TelaDeClientes.mostrar();
		leitor.close();
	}

	
	public static void listar() {
		if(registro.getPessoa().size()== 0) {
			System.out.println("\n"+Mensagem.CLIENTE_NULLO+"\n");
			
		}else {
		
			System.out.println("\n"+Mensagem.TELA_LISTA_CLIENTES+"\n");
	
			for(Pessoa registro : registro.getPessoa()) {
			System.out.println(Mensagem.MSG_NOME+ registro.getNome() +
					 		   Mensagem.MSG_CPF + registro.getCpf() +
					 		   Mensagem.MSG_TELEFONE + registro.getTelefone()+
					 		   Mensagem.MSG_EMAIL+ registro.getEmail()+"\n");
			System.out.flush();
			}
		}
		
		TelaDeClientes.mostrar();
	}
	
	public static void excluir() {
	    Scanner leitor = new Scanner(System.in);

	    for (Pessoa registro : registro.getPessoa()) {
	        i++;
	      
	        System.out.println("\nID: ["+i+"]"+Mensagem.MSG_NOME+ registro.getNome() +
	        					 Mensagem.MSG_CPF + registro.getCpf() +
	        					 Mensagem.MSG_TELEFONE + registro.getTelefone()+
	                             Mensagem.MSG_EMAIL+ registro.getEmail());
	    }

	    System.out.println(Mensagem.EXCLUIR_CLIENTE);

	    i = leitor.nextInt();
	    if (i > 0 && i <= registro.getPessoa().size()) {
	        registro.getPessoa().remove(i - 1);
	        System.out.println(Mensagem.REGISTRO_REMOVIDO);
	    } else {
	        System.out.println(Mensagem.OPCAO_INVALIDA);
	    }
	    i=0;
	    ControlCliente.listar();
	    leitor.close();
	}
	
	public static void atualizar() {
	    Scanner leitor = new Scanner (System.in);
	    	    
	    for (int i = 0; i < registro.getPessoa().size(); i++) {
	        Pessoa pessoa = registro.getPessoa().get(i);
	        System.out.println("\nID: ["+ (i + 1) +"] " + pessoa.getNome() + " - " + pessoa.getCpf());
	    }
	    
	    System.out.println(Mensagem.ATUALIZAR_CLIENTE);
	    int escolha = leitor.nextInt();
	    leitor.nextLine();
	    
	    if (escolha < 1 || escolha > registro.getPessoa().size()) {
	        System.out.println(Mensagem.OPCAO_INVALIDA);

	    }
	    
	    Pessoa pessoa = registro.getPessoa().get(escolha - 1);
	    
	    System.out.println(Mensagem.CADASTRA_NOME);
	    String nome = leitor.nextLine();
	    
	    System.out.println(Mensagem.CADASTRA_CPF);
	    String cpf = leitor.nextLine();
	    
	    System.out.println(Mensagem.CADASTRA_TELEFONE);
	    String telefone = leitor.nextLine();
	    
	    System.out.println(Mensagem.CADASTRA_EMAIL);
	    String email = leitor.nextLine();
	    
	    pessoa.setNome(nome);
	    pessoa.setCpf(cpf);
	    pessoa.setTelefone(telefone);
	    pessoa.setEmail(email);
	    
	    System.out.println(Mensagem.MSG_ATUALIZAR);
	    
	    TelaDeClientes.mostrar();
	    leitor.close();
	}
	
	public static List<Pessoa> getClientes() {
	    return registro.getPessoa();
	}
	
}
