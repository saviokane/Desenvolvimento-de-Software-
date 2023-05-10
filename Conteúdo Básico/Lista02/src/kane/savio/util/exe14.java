import java.util.Scanner;

public class exe14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = input.nextInt();
        input.close();
        
        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        if (n > 1) {
            fibonacci[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
        }
        
        System.out.print("Sequência de Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
