import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantidade de números: ");
        int n = scanner.nextInt();
        
        int[] numeros = new int[n];
        System.out.print("Digite os números: ");
        
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        int[] pares = new int[n/2 + n%2];
        int[] impares = new int[n/2];
        int paresIndex = 0, imparesIndex = 0;
        
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares[paresIndex++] = num;
            } else {
                impares[imparesIndex++] = num;
            }
        }
        
        System.out.println("Pares: " + Arrays.toString(pares));
        System.out.println("Ímpares: " + Arrays.toString(impares));
        
        scanner.close();
    }
}

