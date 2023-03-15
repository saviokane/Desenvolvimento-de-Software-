import java.util.Scanner;

public class ListaExercicios {

	public static void rodarExe01() {
			System.out.println("Escreva um algoritmo que leia um número digitado pelo usuário e mostre a\r\n"
					+ "	mensagem “Número maior do que 10!”, caso este número seja maior, ou “Número\r\n"
					+ "	menor ou igual a 10!”, caso este número seja menor ou igual.");
			
			
			Scanner leitor = new Scanner(System.in);
			int num;
			
			System.out.println("Informe o número:");
			num = leitor.nextInt();
			
			if(num > 10) {
				System.out.println("Número maior do que 10!");
			}else {
				System.out.println("Número menor ou igual a 10!");
			}
			
		}
	
	public static void rodarExe02() {
		System.out.println("Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o\r\n"
				+ "	resultado da sua soma"); 
		
		int num1, num2, soma;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		num1 = leitor.nextInt();
		
		System.out.println("Informe um segundo número: ");
		num2 = leitor.nextInt();
		
		soma = num1 + num2;
//		leitor.close();
		System.out.println("A soma é: "+ soma);
		
	}
	
	public static void rodarExe03() {
		System.out.println("Escreva um algoritmo que leia os valores de dois números "
				+ "inteiros distintos nas variáveis A e B e informe qual deles é o maior. "
				+ "Caso os números sejam iguais informar "
				+ "ao usuário que a sequência de números informados é inválida");
		
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
//			leitor.close();
}
	
public static void rodarExe04() {
		
		System.out.println("Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos números lidos.");
		
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

	public static void rodarExe05() {
		
	Scanner leitor = new Scanner(System.in);
	System.out.println("5. Leia valores nas variáveis A e B,"
			+ " e efetue a troca dos valores de forma que o"
			+ " valorda variável A passe a ser o valor da variável B"
			+ " e o valor da variável B passe a ser ovalor da variável A."
			+ " Apresentar uma mensagem com o valor original de cada variávele outra com os valores trocados.");
	
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
	
	public static void rodarExe06() {
		
		
		System.out.println("Ler uma temperatura em graus Celsius e apresentá-la convertida em graus\r\n"
				+ " Fahrenheit. A fórmula de conversão é:\r\n"
				+ "	F = (9 * C + 160) / 5");
		
			Scanner leitor = new Scanner(System.in);
			
			double graus, celcius;
			
				System.out.println("Informe os graus a ser convertido: ");
				graus = leitor.nextInt();
				
				celcius = (9 * graus) / 5;
				
				System.out.println("Convertido: "+ celcius);
				
				leitor.close();
				
			}
	
	public static void rodarExe07() {

		System.out.println("Escreva um algoritmo que leia um número e diga, através de uma mensagem, se\r\n"
				+ "	este número está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo\r\n"
				+ "	o usuário também deverá ser informado.");  
			
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
	
	public static void rodarExe08() {
		
		System.out.println("Escreva um algoritmo que leia um número e mostre uma mensagem caso este\r\n"
				+ "	número seja maior ou igual a 50, outra se ele for menor que 50.");
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
	
	public static void rodarExe09() {
		
		
		System.out.println("Leia dois números nas variáveis A e B e identifique se os valores são iguais ou\r\n"
				+ "	diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.\r\n"
				+ "	Caso sejam diferentes, informe que são diferentes e qual número é o maior.");
		
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
	
	public static void rodarExe10() {
		System.out.println("Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso. Caso\r\n"
				+ "		      o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número\r\n"
				+ "			  inválido!”.");
		
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
	
	
