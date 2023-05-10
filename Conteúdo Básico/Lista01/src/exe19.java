import java.text.DecimalFormat;
import java.util.Scanner;
public class exe19 {
	
public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.##");
	
	double raio, altura, volume;
	
	System.out.println("Informe o raio do cilindro: ");
	raio = leitor.nextDouble();
	
	System.out.println("Informe a altura do cilindro: ");
	altura = leitor.nextDouble();
	
	volume = 3.14 * Math.pow(raio, 2) * altura;
	String ValorFormatado = df.format(volume);
	
	System.out.println("O volme do cilindro é: "+ ValorFormatado);
	
}
}
