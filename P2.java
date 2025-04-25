import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Digite um número (negativo para encerrar): ");
            int numero = scanner.nextInt(); 

            if (numero < 0) {
                break; 
            }
            sum += numero; 
        }
        System.out.println("A soma dos números positivos é: " + sum);
        scanner.close(); 
    }
}