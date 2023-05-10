import java.util.Scanner;
public class exe05 {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int a, b, c = 0 ;
		
		System.out.println("Informe A: ");
		a = leitor.nextInt();
		
		System.out.println("Informe B: ");
		b = leitor.nextInt();
		
		
		
		System.out.println("Valor original\nA: " + a + "\nB: " + b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Valores trocados\n\nA: " + a + "\nB: " + b);
		leitor.close();
	}
}
