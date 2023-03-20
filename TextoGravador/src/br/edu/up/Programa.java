package br.edu.up;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Formatter;

public class Programa {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//Leitura do arquivo
		String arquivoOrigem = "C:\\_ws\\dev2e4\\ws\\ExemploTexto\\src\\arquivo.txt";
		File arquivo = new File(arquivoOrigem);
		Scanner leitor = new Scanner(arquivo);
		
		//Gravação do arquivos
		String arquivoDestino = "C:\\_ws\\dev2e4\\ws\\ExemploTexto\\src\\destino.txt";
		Formatter gravador = new Formatter(arquivoDestino);
		
		while(leitor.hasNextLine()) {
			String linha = leitor.nextLine();
			String[] vetor = linha.split(" ");
			
			//Imprimir no console/terminal
			System.out.println("Nome completo: " + linha);
			System.out.println("Primeiro nome: " + vetor[0]);
			System.out.println("Sobrenome: " + vetor[1]);
			
			//Gravar no arquivo de destino
			gravador.format("Nome completo: " + linha + "\n");
			gravador.format("Primeiro nome: " + vetor[0] + "\n");
			gravador.format("Sobrenome: " + vetor[1] + "\n");
			gravador.format("\n");
			
//			for(int i = 0; i < linha.length(); i++) {
//				char caractere = linha.charAt(i);
//				System.out.println("Caractere: " + caractere);
//			}			
//			
//			System.out.println("Tamanho:" + linha.length());
			System.out.println();
		}

		leitor.close();
		gravador.close();
		
	}

}
