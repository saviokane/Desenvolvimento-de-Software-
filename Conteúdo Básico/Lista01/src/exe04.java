import java.util.Scanner;
public class exe04 {
	public static void main(String[] args) {
		
		/*4. Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração,
		  multiplicação e a divisão dos números lidos. */
		
		float num1, num2, multi, soma, div, sub;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		num1 = leitor.nextFloat();
		
		System.out.println("Informe o segundo núnero: ");
		num2 = leitor.nextFloat();
		
		soma = num1 + num2;
		multi = num1 * num2;
		div = num1 / num2;
		sub = num1 - num2;
		leitor.close();
		
		System.out.println("A soma é: "+ soma+"\nA multiplicação é: "+multi+"\nA divisão é: "+div+"\nA subtração é: "+sub);
	}


}
