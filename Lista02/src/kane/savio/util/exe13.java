package kane.savio.util;

import java.util.Scanner;

public class exe13 {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	int n;
	
	System.out.println("Informe n: ");
	n = leitor.nextInt();
	
	int[] fib = new int[n];
	int a = 0;
	fib[0] = 0;
	if(n==1) {
		System.out.println(fib[0]);
		
	}
		if(n > 1) {
			fib[1] = 1;
			System.out.println(fib[0]);
			System.out.println(fib[1]);
			
			
			
		
	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584
		for (int i = 2; i < n; i++) {
			
//			int menos1 = -1, menos2 = -2;
			fib[i] = fib[i] + (fib[i-1] + fib[i-2]);
			
			System.out.println(fib[i]);
		}
		}
	
	}
}
