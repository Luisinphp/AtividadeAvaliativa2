import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha = 123456;
        System.out.println("Digite a senha");
        int tentativa;
        do {
            System.out.print("senha: ");
            tentativa = scanner.nextInt();

            if (tentativa != senha) {
                System.out.println("Senha incorreta");
            } else {
                System.out.println("Acesso Concedido");
            }
        } while (tentativa != senha);

        scanner.close();
    }
}