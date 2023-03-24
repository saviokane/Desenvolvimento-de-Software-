import java.util.Scanner;
public class exe02 {
public static void main(String[] args) {
	/*2. Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o
		 resultado da sua soma*/
	
	int num1, num2, soma;
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Informe um número: ");
	num1 = leitor.nextInt();
	
	System.out.println("Informe um segundo número: ");
	num2 = leitor.nextInt();
	
	soma = num1 + num2;
	leitor.close();
	System.out.println("A soma é: "+ soma);
	
}
}
