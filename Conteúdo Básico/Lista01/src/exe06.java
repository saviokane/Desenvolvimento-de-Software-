import java.util.Scanner;
public class exe06 {
	public static void main(String[] args) {
		
	
/*6. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
	 Fahrenheit. A fórmula de conversão é:
	 F = (9 * C + 160) / 5*/
	Scanner leitor = new Scanner(System.in);
	
	double graus, celcius;
	
		System.out.println("Informe os graus a ser convertido: ");
		graus = leitor.nextInt();
		
		celcius = (9 * graus) / 5;
		
		System.out.println("Convertido: "+ celcius);
		
		leitor.close();
		
	}
}
