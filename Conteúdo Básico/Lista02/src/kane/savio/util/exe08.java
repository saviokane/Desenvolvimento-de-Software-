package kane.savio.util;
import java.util.Scanner;
public class exe08 {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		String[] c = new String[5];
		
	
	
	for(int i = 0; i < 5; i++) {
		System.out.println("Informe A: ");
		a[i] = leitor.nextInt();
		
		System.out.println("Informe B: ");
		b[i] = leitor.nextInt();		
	}
	
	for (int i = 0; i < 5; i++) {
		c[i] = String.valueOf(a[i])+ String.valueOf(b[i]);
		System.out.println("A contatenação: "+ i+"\né: "+c[i]);
	}
}
}
