package kane.savio.util;
import java.util.Scanner;
public class exe05 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] num = new int[5];
		int quant = 0;
		int n = 2;
	for (int i = 0; i < 5; i++) {
		System.out.println("Números: ");
		num[i] = leitor.nextInt();
		if(num[i] == n) {
			quant++;
		}
	}	
	System.out.println("Quantidade que n apareceu: "+ quant);
	}

}
