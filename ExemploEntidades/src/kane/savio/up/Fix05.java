package kane.savio.up;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import kane.savio.up.GuardaWord;
import kane.savio.up.entidade.Produtos;

public class Fix05 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String arquivoOrigem = "C:\\_src\\ws\\kane\\ExemploEntidades\\src\\kane\\savio\\up\\entidade\\grupos-tabulados.txt";
		File arquivo = new File(arquivoOrigem);
		Scanner leitor = new Scanner(arquivo);
		
		String arquivoDestino = "C:\\_src\\ws\\kane\\ExemploEntidades\\src\\kane\\savio\\up\\entidade\\arquivo-destino.txt";
		Formatter gravador = new Formatter(arquivoDestino);
				
		int  soma = 0; 
		leitor.nextLine();
		
		while(leitor.hasNext()) {
			
			String linha = leitor.nextLine();
			String[] Grupos = linha.split("\t");
		
			soma += Integer.parseInt(Grupos[1]);			
			
				
		}
		
		while(leitor.hasNext()) {
			
			String linha = leitor.nextLine();
			String[] Grupos = linha.split("B");
			
				System.out.println(Grupos[0]);
				soma += Integer.parseInt(Grupos[1]);			
			
				
		}
		
//		System.out.println("O resultado da soma e: " + soma);
			leitor.close();
			
			
						

		
	
	}

}
