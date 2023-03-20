package br.edu.up;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class Programa {
	
	public static void main(String[] args) throws FileNotFoundException {
		
	//Leitura de arquivos	
	
	
	File arquivo = new File("C:\\_src\\ws\\kane\\ExemploLeituraTexto\\src\\arquivo.txt") ;
	
	Scanner leitor = new Scanner(arquivo);
	
	// Gravação de arquivos
//	String
	String arquivoDestino = 
	Formatter gravador = new Formatter("C:\\_src\\ws\\kane\\ExemploLeituraTexto\\src\\destino.txt");
	
	
	while(leitor.hasNextLine()) {
		
		String linha = leitor.nextLine();
		String[] vetor = linha.split(" ");
				
		System.out.println("Primeiro nome: "+ vetor[0]);
		System.out.println("Texto: " + linha);
		for (int i = 0; i < linha.length(); i++) {
			char caracter = linha.charAt(i); // Conta quantidade de cada caracter
			System.out.println("Caractere: "+ caracter);
		}
		System.out.println("Tamanha: "+ linha.length());
	}
	leitor.close();
	}
}
