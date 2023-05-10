import java.text.DecimalFormat;
import java.util.Scanner;
public class exe18 {
	
public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	
	double nota1, nota2, nota3, resul;
	
	DecimalFormat df = new DecimalFormat("#.###");
		
	System.out.println("Informe sua primeira nota: ");
	nota1 = leitor.nextDouble();
	
	System.out.println("Informe sua segunda nota: ");
	nota2 = leitor.nextDouble();
	
	System.out.println("Informe sua terceira nota: ");
	nota3 = leitor.nextDouble();
	
	resul = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3)) ;
	
	String valorFormatado =  df.format(resul);
	
	System.out.println("O resultado da media harmônica é: "+ valorFormatado);
	
	
}
}
