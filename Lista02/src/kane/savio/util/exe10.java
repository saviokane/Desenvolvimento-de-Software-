package kane.savio.util;

import java.util.Scanner;

public class exe10 {
public static void main(String[] args) {
	
	
	Scanner leitor = new Scanner(System.in);
	
	int[] a = new int[5];
	int[] b = new int[5];
	
	
	for (int i = 0; i < 5; i++) {
		System.out.println("Informe a posição "+ i +" do vetor: ");
		a[i] = leitor.nextInt();
	}
	
	for(int i = 0; i < 5; i++ ) {
		b[i] = a[4-i];
	}
	
	for (int i = 0; i < 5; i++) {
        System.out.print(b[i] + " ");
    }
	
}
}
