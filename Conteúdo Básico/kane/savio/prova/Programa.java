package kane.savio.prova;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Programa {
public static void main(String[] args) throws FileNotFoundException {
	String arquivoOrigem = "C:\\_src\\ws\\kane\\ExemploEntidades\\src\\kane\\savio\\prova\\clientes.csv";
	File Arquivo = new File(arquivoOrigem);
	Scanner leitor = new Scanner(Arquivo);
	Scanner reader = new Scanner(System.in);

	
	double valorInicial, valorFinal, creditos;
	int valorEncontrado = 0;
	
	System.out.println("Informe primeiro valor: ");
	valorInicial = reader.nextDouble();
	
	System.out.println("Informe o segundo valor: ");
	valorFinal = reader.nextDouble();
	leitor.nextLine();
	
	String arquivoGravador = "C:\\_src\\ws\\kane\\ExemploEntidades\\src\\kane\\savio\\prova\\clientes-"+valorInicial+"a"+valorFinal+".txt";
	Formatter gravador = new Formatter(arquivoGravador);
	gravador.format("\nOs valores encontrado entre "+valorInicial+" e "+valorFinal+" é: ");
	
	while(leitor.hasNext()) {
		String linha = leitor.nextLine();
		String[] campos = linha.split(";");
		
		campos[3] = campos[3].replace(",",".");
		creditos = Double.parseDouble(campos[3]);
		
			if(valorInicial< creditos && valorFinal>creditos) {
				valorEncontrado = 1;
				System.out.println(creditos);
				
				gravador.format("\n"+creditos);
			
		}
	}
	
if(valorEncontrado == 0) {
	System.out.println("Nenhum valor encontrado: ");
	
}
	
	gravador.close();
	leitor.close();
	reader.close();
	}
}
