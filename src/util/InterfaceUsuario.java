package util;

import java.util.Scanner;

public class InterfaceUsuario {
    private final Scanner scanner;

    public InterfaceUsuario() {
        scanner = new Scanner(System.in);
    }

    public double pedirValorImovel() {
        double valor;
        do {
            System.out.print("Digite o valor do imóvel): ");
            valor = scanner.nextDouble();
            if (valor <= 0) {
                System.out.println("Erro: O valor do imóvel deve ser positivo.");
            }
        } while (valor <= 0);
        return valor;
    }

    public int pedirPrazoFinanciamento() {
        int prazo;
        do {
            System.out.print("Digite o prazo do financiamento (em anos): ");
            prazo = scanner.nextInt();
            if (prazo <= 0) {
                System.out.println("Erro: O prazo do financiamento deve ser positivo.");
            }
        } while (prazo <= 0);
        return prazo;
    }

    public double pedirTaxaJurosAnual() {
        double taxa;
        do {
            System.out.print("Digite a taxa de juros anual: ");
            taxa = scanner.nextDouble();
            if (taxa <= 0) {
                System.out.println("Erro: A taxa de juros anual deve ser positiva.");
            }
        } while (taxa <= 0);
        return taxa;
    }
}
