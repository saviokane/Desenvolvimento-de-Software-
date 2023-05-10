import java.util.Scanner;
public class exe17 {
	
public static void main(String[] args) {
	
	/*17. Elabore um algoritmo que receba três notas de um aluno 
	 * os pesos referentes acada nota e retorne a sua média ponderada.
	 *  Veja o cálculo da média ponderada:
	 *  Média ponderada = nota1 * peso1 + nota2 *
	 *   peso2 + nota3 * peso3peso1 + peso2 + peso3*/
	
	Scanner leitor = new Scanner(System.in);
	// Lógica está correta, mas o calculo não está funcionando.
	double nota1, nota2, nota3, peso1 , peso2 , peso3, resultado;
	
	System.out.println("Informe sua primeira nota: ");
	nota1 = leitor.nextDouble();
	
	System.out.println("Informe sua segunda nota: ");
	nota2 = leitor.nextDouble();
	
	System.out.println("Informe sua terceira nota: ");
	nota3 = leitor.nextDouble();
	
	// --
	
	System.out.println("Informe sua primeiro peso: ");
	peso1 = leitor.nextDouble();
	
	System.out.println("Informe sua segundo peso: ");
	peso2 = leitor.nextDouble();
	
	System.out.println("Informe sua terceiro peso: ");
	peso3 = leitor.nextDouble();
	
	resultado = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) / (peso1 + peso2 + peso3);
	
	System.out.println("A media ponderada do aluno é: " + resultado);
	
}
}
