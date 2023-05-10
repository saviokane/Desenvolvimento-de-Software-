import java.util.Scanner;
public class exe08 {
	public static void main(String[] args) {
		
	/*8. Escreva um algoritmo que leia um número e mostre uma mensagem caso este
		 número seja maior ou igual a 50, outra se ele for menor que 50. */
		int num;
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Informe um número: ");
		num = leitor.nextInt();
		leitor.close();
		
		if(num >= 50) {
			System.out.println("Numero maior igual a 50.");
		}else {
			System.out.println("Numero menor que 50.");
		}		
	}
}
