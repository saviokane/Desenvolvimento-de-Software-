import java.util.Scanner;
public class exe13 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int a, b, resul;
		char operacao;
		
		System.out.println("Informe A: ");
		a = leitor.nextInt();
		
		System.out.println("Informe B: ");
		b = leitor.nextInt();
		
		System.out.println("Informe a operação: ");
		operacao = leitor.next().charAt(0);
		
		switch(operacao) {
		
		case '*':
			
			System.out.println("Você escolheu multiplicação.");
			resul = a * b;
			System.out.println("\nO resultado da multiplicação é: "+ resul+ ".");
			break;
			
		case '+':
			
			System.out.println("Você escolheu soma.");
			resul = a + b;
			System.out.println("\nO resultado da soma é: "+ resul +".");
			break;
			
		case '-':
			
			System.out.println("Você escolheu subtração.");
			resul = a - b;
			System.out.println("\n O resultado da subtração é: "+ resul + ".");
			break;
		case '/':
			
			if(a != 0 && b != 0) {
				System.out.println("Você escolheu divisão.");
				resul = a / b;
				System.out.println("\n O resultado da divisão é: "+ resul + ".");
			}else
				System.err.println("Não é possivel realizar divisão por '0'.");
			break;
		default:
			System.out.println("Operação invalida.");
			
			
		}
		
		
			
		
		
		
		
	}

}
