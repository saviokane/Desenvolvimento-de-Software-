import java.text.DecimalFormat;
import java.util.Scanner;
public class exe16 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double nota1, nota2, nota3, resul;
		DecimalFormat df = new DecimalFormat("#.##"); // 1 - Metodos para formatar um double e limitar a casa decimais
		
		System.out.println("Informe a primeira nota: ");
		nota1 = leitor.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = leitor.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = leitor.nextDouble();
		
		resul = (nota1 + nota2 + nota3) / 3;
		String valorFormatado = df.format(resul); // 2 Formatando a variavel resultado e limitando as casas decimais.
		
		System.out.println("O resultado da soma é: "+ valorFormatado);
		
		
		
		
		
	}

}
