package kane.savio.util;
import java.util.Scanner;
public class exe07 {
	public static void main(String[] args) {
		// Não entendi como verificar se TODOS os indices são iguais dos dois vetores // conseguir verificar, mas não de forma ideal
		Scanner leitor = new Scanner(System.in);
		int[] vetor1 = new int[5];
		int[] vetor2 = new int[5];
		int j = 0;
		
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Informe os valores do primeiro vetor: ");
			vetor1[i] = leitor.nextInt();
			
			System.out.println("Informe os valores do segundo vetor: ");
			vetor2[i] = leitor.nextInt();
		}
		
		for (int i = 0; i < vetor2.length; i++) {
			if(vetor1[i] == vetor2[i]) {
				j++;
			}
		}
		
		if(j++ == 5) {
			System.out.println("Todos os indices consequentemente tem números iguais.");
		}else {
			System.out.println("Puramente mentira, nem todos os indices são iguais, somente: "+ j+ " são iguais.");
		}
	}

}
