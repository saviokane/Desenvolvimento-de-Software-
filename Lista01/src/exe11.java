import java.util.Scanner;
public class exe11 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Informe o primeiro número: ");
		num1 = leitor.nextInt(); // 5 
		
		System.out.println("Informe o segundo número: ");
		num2 = leitor.nextInt(); // 6
		
		System.out.println("Informe o terceiro número: ");
		num3 = leitor.nextInt(); // 8 
		
		if(num1 < num2 && num2 < num3 && num3 > num1) {
			System.out.println(num3); // 
			System.out.println(num2);
			System.out.println(num1);
	
		}
		if(num1 > num2 && num1 > num3 && num2 > num3) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
		}
		
		if(num1 > num2 && num1 > num3 && num2 < num3) {
			System.out.println(num1);
			System.out.println(num3);
			System.out.println(num2);
			
		}
		
		if(num1 < num2 && num2 < num3 && num3 < num1) {
			System.out.println(num3);
			System.out.println(num1);
			System.out.println(num2);
			
		}
		if(num2> num3 && num1>num3 && num1 < num2) {
			System.out.println(num2);
			System.out.println(num1);
			System.out.println(num3);
			
		}
		if(num2>num3 && num3 > num1 && num2> num1) {
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num1);
		}else{
			
		}
}
}
