package kane.savio.up;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import kane.savio.up.GuardaWord;
import kane.savio.up.entidade.Produtos;

public class Fix05 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String arquivoOrigem = "C:\\_src\\Desenvolvimento-de-Software-\\ExemploEntidades\\src\\kane\\savio\\up\\entidade\\grupos-tabulados.txt";
		/* NA FACULDADE C:\\_src\\ws\\kane\\ExemploEntidades\\src\\kane\\savio\\up\\entidade\\grupos-tabulados.txt
		 NO SETUP DE CASA É ESSE URL C:\_src\Desenvolvimento-de-Software-\ExemploEntidades\src\kane\savio\\entidade\grupos-tabulados.txt*/
		File arquivo = new File(arquivoOrigem);
		Scanner leitor = new Scanner(arquivo);
		
		String arquivoDestino = "C:\\_src\\Desenvolvimento-de-Software-\\ExemploEntidades\\src\\kane\\savio\\up\\entidade\\arquivo-destino.txt";
		Formatter gravador = new Formatter(arquivoDestino);
		
		String relatorioGrupo = "C:\\_src\\Desenvolvimento-de-Software-\\ExemploEntidades\\src\\kane\\savio\\up\\entidade\\relatorio-de-grupo.txt";
		File arquivo1 = new File(relatorioGrupo);
		Formatter gravador2 = new Formatter(relatorioGrupo);
		int grupoA= 0, grupoB= 0, grupoC= 0, grupoD= 0, grupoE= 0, grupoF=0;
		int  soma = 0; 
		leitor.nextLine();
		
		while(leitor.hasNext()) {
			
			String linha = leitor.nextLine();
			String[] Grupos = linha.split("\t");
		
			soma += Integer.parseInt(Grupos[1]);			
			
			// usar o switch para por exemplo
//			case: "A" // ele só vai entregar os valores até A.
			//dai ele retorna a soma só dos valores A.
			
			int valor = Integer.parseInt(Grupos[1]);
			
			switch(Grupos[0]) {
			
			case "A":
				grupoA = grupoA + valor;
				break;
			case "B":
				grupoB = grupoB + valor;
				break;
			case "C":
				grupoC = grupoC + valor;
				break;
			case "D":
				grupoD = grupoD + valor;
				break;
			case "E":
				grupoE = grupoE + valor;
				break;
			case "F":
				grupoF = grupoF + valor;
				break;
			default:
				System.out.println("Opção invalida!");
				break;
				
			}
		}
		
		gravador.format("\nO valor do grupo A:"+grupoA);
		gravador.format("\nO valor do grupo B:"+grupoB);
		gravador.format("\nO valor do grupo C:"+grupoC);
		gravador.format("\nO valor do grupo D:"+grupoD);
		gravador.format("\nO valor do grupo E:"+grupoE);
		gravador.format("\nO valor do grupo F:"+grupoF);
		gravador.format("\nO valor total dos registro é: "+soma);
	
		System.out.println("O resultado da soma e: " + soma);
			
			
			gravador2.format("\nO valor total do grupo B é:"+grupoB);
			gravador2.format("\nO valor total do grupo A é:"+grupoA);
			gravador2.format("\nO valor total do grupo C é:"+grupoC);
			gravador2.format("\nO valor total do grupo D é:"+grupoD);
			gravador2.format("\nO valor total do grupo E é:"+grupoE);
			gravador2.format("\nO valor total do grupo F é:"+grupoF);
			gravador2.format("\nA soma de todos os grupos registrado é: "+soma);
			gravador2.close();
		leitor.close();
		
	}

}
