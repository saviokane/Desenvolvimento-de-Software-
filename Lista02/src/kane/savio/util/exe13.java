package kane.savio.util;

import java.util.Scanner;

public class exe13 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	int n;
	
	System.out.println("Informe n: ");
	n = leitor.nextInt();
	
	int[] fib = new int[n];
	
	fib[0] = 0;
		if(n > 1) {
			fib[1] = 1;
		}
	
		for (int i = 0; i < n; i++) {
			int menos1 = -1, menos2 = -2;
			fib[i] = fib[i] + (fib[i-menos1] + fib[i-menos2]);
			System.out.println(fib[i]);
		}
	// desisto desse aqui
	}
}
