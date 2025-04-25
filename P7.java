import java.util.Random;
import java.util.Scanner;
public class P7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = random.nextInt(20) + 1;
        System.out.println("Tente adivinhar o número gerado entre 1 e 20!");
        int tentativa;
        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();

            if (tentativa > numeroAleatorio) {
                System.out.println("O número é menor!");
            } else if (tentativa < numeroAleatorio) {
                System.out.println("O número é maior!");
            } else {
                System.out.println("Parabéns! Você acertou o número: " + numeroAleatorio);
            }
        } while (tentativa != numeroAleatorio);
        scanner.close();
    }
}