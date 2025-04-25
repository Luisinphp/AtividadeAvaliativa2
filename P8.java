import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;
        int qtdtnotas = 0;
        char continuar;
        do {
            System.out.print("Digite uma nota (0 a 10): ");
            double nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Insira um valor entre 0 e 10.");
            } else {
                somaNotas += nota;
                qtdtnotas++;
            }
            System.out.print("Deseja inserir outra nota? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0);
        } while (continuar == 's');

        if (qtdtnotas > 0) {
            double media = somaNotas / qtdtnotas;
            System.out.println("A média das notas inseridas é: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }
        scanner.close();
    }
}