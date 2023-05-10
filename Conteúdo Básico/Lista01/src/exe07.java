import java.util.Scanner;
public class exe07 {

	public static void main(String[] args) {

	/*7. Escreva um algoritmo que leia um número e diga, através de uma mensagem, se
		 este número está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo
		 o usuário também deverá ser informado. */
		
		int num;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		num = leitor.nextInt();
		
		if(num >= 100 && num <= 200) {
			System.out.println("O número está no intervalo entre 100 e 200.");
		}else {
			System.out.println("O número está fora do intervalo entre 100 e 200.");
		}
		leitor.close();
	}
	
}
