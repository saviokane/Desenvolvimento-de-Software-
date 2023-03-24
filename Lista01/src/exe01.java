import java.util.Scanner;
public class exe01 {

	public static void main(String[] args) {
		/*1. Escreva um algoritmo que leia um número digitado pelo usuário e mostre a
		mensagem “Número maior do que 10!”, caso este número seja maior, ou “Número
		menor ou igual a 10!”, caso este número seja menor ou igual. */
		
		
		Scanner leitor = new Scanner(System.in);
		int num;
		
		System.out.println("Informe o número:");
		num = leitor.nextInt();
		
		if(num > 10) {
			System.out.println("Número maior do que 10!");
		}else {
			System.out.println("Número menor ou igual a 10!");
		}
		leitor.close();
	}
}
