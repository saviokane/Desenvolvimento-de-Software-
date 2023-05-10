package kane.savio.util;
import java.util.Scanner;
public class exe06 {
public static void main(String[] args) {
	// não entendi nada
	Scanner leitor = new Scanner(System.in);
	float media = 0;
	
	float[] notas = new float[5];
	notas[0] = 1;
	notas[1] = 5;
	notas[2] = 3;
	notas[3] = 5;
	notas[4] = 8;
	
	float[] peso = new float[5];
	peso[0] = 4;
	peso[1] = 2;
	peso[2] = 3;
	peso[3] = 4;
	peso[4] = 1;
	
	media = (notas[0] * peso[0]) +  (notas[1] * peso[1]) + (notas[2] * peso[2]) + (notas[3] * peso[3]) + (notas[4] * peso[4]) / (peso[0] + peso[1] + peso[2] + peso[3]+ peso[4]);
	
	System.out.println("A média ponderada é: "+ media);
}
}
