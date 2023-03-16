package kane.savio.util;
import java.util.Scanner;
public class exe04 {
	public static void main(String[] args) {
		
	
	int[] num = new int[5];
	int n = 5;
	Scanner leitor = new Scanner(System.in);
	
	for(int i = 0; i < 5; i++) {
		System.out.println("Informe o " + i + " Indice: " );
		num[i] = leitor.nextInt();
	}
	for(int i = 0; i < 5; i++) {
		if(num[i]< n) {
			System.out.println("O indice " + i +" do número "+ num[i]+ " é inferior a 5");
		}
	}
	
}
}