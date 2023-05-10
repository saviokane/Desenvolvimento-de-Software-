import java.util.Scanner;
public class exe09 {
public static void main(String[] args) {
	
	
	/*9. Leia dois números nas variáveis A e B e identifique se os valores são iguais ou
		 diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.
		 Caso sejam diferentes, informe que são diferentes e qual número é o maior. */
	
	int a,b;
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Informe A: ");
	a = leitor.nextInt();
	
	System.out.println("Informe B: ");
	b = leitor.nextInt();
	
	if(a == b) {
		System.out.println("A e B são iguais.");
	}else {
		System.out.println("A e B são diferentes.");
		
			if(a > b) {
				System.out.println("A maior que B.");
			}else {
				System.out.println("B maior que A.");
			}
	}
	leitor.close();
	
}
}
