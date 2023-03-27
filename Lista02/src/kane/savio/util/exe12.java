package kane.savio.util;

import java.util.Scanner;

public class exe12 {
	
public static void main(String[] args) {
	
	int[] numb = new int[12];
	int resul = 0;
	Scanner reader = new Scanner(System.in);
	for (int i = 0; i < numb.length; i++) {
		
		System.out.println("Informe o "+ (i + 1) +" do vetor: ");
		numb[i] = reader.nextInt();
		
	}
	
	for (int i = 0; i < numb.length; i++) {
		
		if(resul == 0) {
				resul = resul + numb[i];
		}else
			if(numb[i] % 2 == 0) {
				
				if(numb[i] > 0) {
					
					resul = resul * numb[i]; 
			}
		}
	}
		System.out.println("O resultado é: " +resul+".");
	
	
	
}
}
