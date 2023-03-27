package kane.savio.util;
import java.util.Scanner;
public class exe11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int[] num1 = new int[5];
		int[] num2 = new int[5];
		int resul = 0;
		
		for (int i = 0; i < num2.length; i++) {
			
			System.out.println("Informe o "+(i+1)+" elemento do vetor 1: ");
				num1[i] = reader.nextInt();
				
			}
		
		for (int i = 0; i < num2.length; i++) {	
			
			System.out.println("Informe o "+(i+1)+" elemento do vetor 2: ");
				num2[i] = reader.nextInt();
			}
		
		for (int i = 0; i < num2.length; i++) {
			resul = resul + (num1[i] * num2[i]);
		}

		System.out.println("O resultado dos produtos escalar é: "+resul+".");
	}
}
