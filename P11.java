import java.util.Scanner;
public class P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); 
        }
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println("A soma total dos elementos do vetor é: " + soma);
        scanner.close();
    }
}