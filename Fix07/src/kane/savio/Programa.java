package kane.savio;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;

public class Programa {
public static void main(String[] args) throws FileNotFoundException {
	try {
	
	String matriculaAlunos = "C:\\_src\\Desenvolvimento-de-Software-\\Fix07\\src\\kane\\savio\\entidades\\alunos.txt";
	File arquivo = new File(matriculaAlunos);
	Scanner leitor = new Scanner(arquivo);
	
	String resultadosAlunos = "C:\\_src\\Desenvolvimento-de-Software-\\Fix07\\src\\kane\\savio\\entidades\\alunosAprovados.txt";
	Formatter gravador = new Formatter(resultadosAlunos);
	
	int aprovados = 0;
	int reprovados = 0;
	int quant_alunos = 0;
	double menor_nota = 9;
	double maior_nota = 1;
	double mediaGeral = 0;
	leitor.nextLine();
	String matricula;
	String nome;
	
	while(leitor.hasNext()) {
		// Quantidade de alunos
		quant_alunos++;
		
		String linha = leitor.nextLine();
		String[] campos = linha.split(";");
		// Campos 0 recebe MATRICULA
				// Campos 1 recebe NOME
				// Campos 2 recebe NOTA
		// Converte todas as ',' do texto em '.' para o Eclipse poder aceitar
		campos[2] = campos[2].replace(",","."); 
		
		// Demonstrar todos as notas armazenadas.
		double notas = Double.parseDouble(campos[2]);
		
		// Verifica quais foram aprovados e reprovados
		if(notas>=6) {
			aprovados++;
		}else {
			reprovados++;
		}

		
		// Media geral
		mediaGeral += Double.parseDouble(campos[2]);
		
		//  Maior e menor nota
		
		if(notas < menor_nota) {
			menor_nota = notas;
		}else {
			maior_nota = notas;
		}
	}
	
	mediaGeral = mediaGeral / quant_alunos;
	DecimalFormat df = new DecimalFormat("#.##");
	String formatacao = df.format(mediaGeral);
	
				// Prina os dados que serão enviados ao gravador
				System.out.println("\nA quantidade de total de alunos é: "+quant_alunos+".");
				System.out.println("\nA quantidade de alunos aprovados é: "+ aprovados+".");
				System.out.println("\nA quantidade de alunos aprovados é: "+ reprovados+".");
				System.out.println("\nA menor nota é: "+menor_nota+".");
				System.out.println("\nA maior nota é: "+maior_nota+".");
				System.out.println("\nA média geral dos alunos é "+formatacao+".");
				
				// Armazena todos os dados no arquivo AlunosAprovados
				
				gravador.format("\nA quantidade de total de alunos é: "+quant_alunos+".");
				gravador.format("\nA quantidade de alunos aprovados é: "+ aprovados+".");
				gravador.format("\nA quantidade de alunos aprovados é: "+ reprovados+".");
				gravador.format("\nA menor nota é: "+menor_nota+".");
				gravador.format("\nA maior nota é: "+maior_nota+".");
				gravador.format("\nA média geral dos alunos é "+formatacao+".");
				
				
				
	
	leitor.close();
	gravador.close();
	}catch(FileNotFoundException e) {
		System.out.println("Arquivo não encontrado !!!");
	}
	
	
	
	
}
}
