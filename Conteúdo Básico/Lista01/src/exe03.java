import java.util.Scanner;
public class exe03 {
	public static void main(String[] args) {
		/*3. Escreva um algoritmo que leia os valores de dois números inteiros distintos nas
			 variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informar
			 ao usuário que a sequência de números informados é inválida*/
		
			Scanner leitor = new Scanner(System.in);
		
			int a,b;
			
			System.out.println("Informe A: ");
			a = leitor.nextInt();
			
			System.out.println("Informe B: ");
			b = leitor.nextInt();
			
			if(a == b) {
				System.out.println("Sequencia de números invalidas!!");
			}else {
			if(a > b) {

				System.out.println("'A' maior que 'B'");
				
			}else{
				System.out.println("'B' maior que 'A'.");
			
			}
			}
			leitor.close();
		
		
	
}
}
