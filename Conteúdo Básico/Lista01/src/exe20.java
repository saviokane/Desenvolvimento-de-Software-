import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormat;
public class exe20 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.#");
		
		double quant_litros, km_percorrido;
		
		System.out.println("Informe quantos KM foi percorrido: ");
		km_percorrido = leitor.nextDouble();
		
		quant_litros = km_percorrido / 12;
		
		String valorFormatado = df.format(quant_litros);
		
		System.out.println("A quantidade de combustivel gasta é: "+ valorFormatado +" litros.");
		
	}

}
