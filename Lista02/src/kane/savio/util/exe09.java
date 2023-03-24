package kane.savio.util;
import java.util.Scanner;
public class exe09 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		// não conseguir resolver, pulei exercicio.
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[5];
		System.out.println("Informe o elemento A: ");
		for(int j = 0; j < 5; j++) {
			System.out.println("Digite o contador "+ (j + 1)+":");
				a[j] = leitor.nextInt();	
		}
		System.out.println("Informe o elemento B: ");
		for (int j = 0; j < c.length; j++) {
			
			System.out.println("Digite o contador "+ (j + 1)+":");
			b[j] = leitor.nextInt();	
		}
		
		for(int i = 0; i < 5; i++) {
			
			if(a[i] % 2 == 0) {
					c[i] = b[i];
			}else {
					c[i] = a[i];
			}
		}
		System.out.println("------------Elementos do vetor C.");
		for (int i = 0; i < c.length; i++) {
			System.out.println("O vetor "+ (i+1) +" é: "+ c[i]+ ".");
		}
	
}
}