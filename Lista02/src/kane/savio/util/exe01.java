package kane.savio.util;

import java.util.Scanner;
public class exe01 {
	
	public static void Exe01() {
		/*1. Construa um programa que leia em um vetor uma sequência de 5 números digitados
	 	 	 pelo usuário, calcule a média destes valores em um outro vetor, e depois apresente
	 	 	 na tela quais valores que são menores, iguais ou superiores à média.
	 	 	 refazer esse exe pq está todo cagado*/
		
		int[] num = new int[5];
		int soma = 0;
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o numero: " );
			num[i] = leitor.nextInt();
			soma += num[i];
			
		}
		
		double media = soma / 5;
		System.out.println("A média dos números é: "+ media);
		
		System.out.println("\nValores menores que a média: ");
		
		for (int i = 0; i < 5; i++) {
				if(num[i] == media) {
					System.out.println("Valores iguais a média.");
				}
		}
		
		for(int i = 0; i < 5; i++) {
			if(num[i]> media) {
				System.out.println(num[i] + " ");
			}
		}
//		leitor.close();
	}
}
