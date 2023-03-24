import java.util.Scanner;
public class exe14 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int termo, indice, resul;
		
		
		System.out.println("Digite o valor do primeiro termo: ");
		termo = leitor.nextInt();
		
		System.out.println("Digite o valor do índice: ");
		indice = leitor.nextInt();
		
		resul = termo + (9 - 1 ) * indice;
		
		System.out.println("O n-ésimo é: "+ resul+".");
		

	}

}
