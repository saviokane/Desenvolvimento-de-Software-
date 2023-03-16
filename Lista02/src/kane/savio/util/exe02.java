package kane.savio.util;
import java.util.Scanner;

public class exe02 {
	public static void main(String[] args) {
		
	
		int quant = 1;
		int[] num = new int[99];
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qual a quantidade de números no vetor? ");
		quant = leitor.nextInt();
		
		
		for(int i = 0; i < quant;i++) {
			System.out.println("Informe o valor: ");
			num[i] = leitor.nextInt();
		}
		for(int i = 0; i < quant; i++) {
			System.out.println("====Posiçao====\n"+ i );
			System.out.println("Numero: " + num[i]);
			if(num[i] == 0) {
				System.out.println("Zero!");
			}
			if(num[i]> 0) {
				System.out.println("Numero Positivo !");
			}
			if(num[i] < 0) {
				System.out.println("Número negativo !");
			}
		}
	}

}
