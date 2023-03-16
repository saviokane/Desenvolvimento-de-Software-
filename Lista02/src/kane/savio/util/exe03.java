package kane.savio.util;
import java.util.Scanner;
public class exe03 {

	public static void main(String[] args) {
		int[] num = new int[99];
		int[] armz = new int[99];
		int quant = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a quantidade dos vetores: ");
		quant = leitor.nextInt();
		
		for(int i = 0; i< quant; i++) {
			System.out.println("Informe o número: ");
			num[i] = leitor.nextInt();
			armz[i] = 2 * num[i];
			
			}
		for (int i = 0; i < quant; i++) {
			System.out.println("Valor do primeiro vetor: "+ num[i]);
			System.out.println("Valor do segundo vetor "+ armz[i]);
		}
	}
}
