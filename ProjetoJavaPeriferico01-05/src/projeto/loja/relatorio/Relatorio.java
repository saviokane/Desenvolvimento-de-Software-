package projeto.loja.relatorio;

import projeto.loja.modulos.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Formatter;

public class Relatorio {
	
	public Relatorio(Cadastro registro , Produto produto , Cliente cliente) {
		
		try {
			File arquivo = new File("C:\\_src\\ws\\Escopo\\src\\projeto\\loja\\relatorio\\Compras.txt");// 
			Formatter gravador = new Formatter(arquivo);
			
			
			   gravador.format("===Clientes cadastrados!===\n\n");
			   
		
			   
			for(Cliente clientes : registro.getCliente()) {
		        gravador.format("Nome:"+clientes.getNome()
		        +"\nCpf:" +clientes.getCpf()+
		        "\nEmail:" + clientes.getEmail()+
		        "\nTelefone:" + clientes.getTelefone()+
		        "\n"+"\n");
		   
		    }

				System.out.println();
			   gravador.format("===Lista de produtos===\n\n");
			   gravador.format("===Teclados===\n\n");
			for(Teclado teclados : produto.getTeclados()) {
				   gravador.format("Nome:"+teclados.getNome()+
		    		"\nValor:" +teclados.getValor()+"\n");

		}

				System.out.println();
			   gravador.format("===Mouses===\n\n");	
			for(Mouse mouses : produto.getMouse()) {
				   gravador.format("Nome:"+mouses.getNome()+
		    		"\nValor:" +mouses.getValor()+"\n" + "\n");

		}

			System.out.println();
			   gravador.format("===Headsets===\n\n");
			for(Headset headsets : produto.getHeadsets()) {
				   gravador.format("Nome:"+headsets.getNome()+
		    		"\nValor:" +headsets.getValor()+"\n\n");

		}
		
			
			gravador.close();
			
		}catch(Exception e) {
			
			System.out.println("nao foi dessa vez! " + e.getMessage());
			
		}
		
		
	}
	
	
}
