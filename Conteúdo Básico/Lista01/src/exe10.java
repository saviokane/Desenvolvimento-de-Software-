import java.util.Scanner;
public class exe10 {
	public static void main(String[] args) {
		/*10. Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso. Caso
		      o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número
			  inválido!”. */
		
		int num;
		String mensagem;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		num = leitor.nextInt();
		
		switch(num) {
		
		case 1:
			mensagem = "Um.";
			System.out.println(mensagem);
			break;
			
		case 2:
			mensagem = "Dois.";
			System.out.println(mensagem);
			break;
			
		case 3:
			mensagem = "Três.";
			System.out.println(mensagem);
			break;
			
		case 4:
			mensagem = "Quatro.";
			System.out.println(mensagem);
			break;
			
		case 5:
			mensagem = "Cinco.";
			System.out.println(mensagem);
			break;
			
		default:
			System.out.println("Número inválido.");
			break;
	
		}
		leitor.close();
		
		
		
		
	}

}
