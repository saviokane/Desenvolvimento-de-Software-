import java.util.Scanner;
public class exe15 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	// DEU ERRADO AQUI, NAO CONINCIDIU O RESULTADO, DEPOIS PESQUISAR PARA ENTEDNER MELHOR
	double x1, y1, x2, y2, p1, p2, total, resul1, resul2;
	
	System.out.println("Informe em P1 o x2:");
	x2 = leitor.nextDouble();
	
	System.out.println("Informe em P1 o x1:");
	x1 = leitor.nextDouble();
	
	System.out.println("Informe em P2 o x2:");
	y2 = leitor.nextDouble();
	
	System.out.println("Informe em P2 o y2:");
	y1 = leitor.nextDouble();
	
	p1 = x2 - x1;
	
	p2 = y2 - y1;

	resul1 = Math.pow(p1, 2); 
	resul2 = Math.pow(p2, 2);
	
	total = resul1 + resul2;
	
	System.out.println("O resultado é: "+ Math.cbrt(total));
	
}
}
