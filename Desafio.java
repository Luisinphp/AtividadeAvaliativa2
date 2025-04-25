import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 0;

        do {
            // Solicita os dados do usuário
            System.out.print("Digite o valor do investimento inicial (P): ");
            double investimentoInicial = scanner.nextDouble();

            System.out.print("Digite a taxa de juros anual (r) em %: ");
            double taxaJuros = scanner.nextDouble();

            System.out.print("Digite o período de investimento em anos (t): ");
            int periodo = scanner.nextInt();

            System.out.print("Escolha o tipo de capitalização (simples ou composta): ");
            String tipoCapitalizacao = scanner.next().toLowerCase();

            double montante = 0;

            // Calcula o montante com base no tipo de capitalização
            if (tipoCapitalizacao.equals("simples")) {
                montante = investimentoInicial * (1 + (taxaJuros / 100) * periodo);
            } else if (tipoCapitalizacao.equals("composta")) {
                montante = investimentoInicial * Math.pow((1 + taxaJuros / 100), periodo);
            } else {
                System.out.println("Tipo de capitalização inválido. Tente novamente.");
                continue;
            }

            // Exibe o resultado
            System.out.printf("O montante ao final do período será: %.2f%n", montante);

            // Pergunta se o usuário deseja realizar outro cálculo
            System.out.print("Deseja realizar um novo cálculo? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0);

        } while (continuar == 's');

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}