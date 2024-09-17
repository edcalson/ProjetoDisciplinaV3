package main;

import modelo.Financiamento;
import util.InterfaceUsuario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        // Adicionando valores de quatro financiamentos
        for (int i = 1; i <= 4; i++) {
            System.out.println("Financiamento " + i + ":");
            double valorImovel = interfaceUsuario.pedirValorImovel();
            int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
            double taxaJurosAnual = interfaceUsuario.pedirTaxaJurosAnual();

            Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
            financiamentos.add(financiamento);
        }

        // Calculo do total do valor dos imóveis e financiamentos
        double totalValorImoveis = 0;
        double totalValorFinanciamentos = 0;

        for (Financiamento financiamento : financiamentos) {
            totalValorImoveis += financiamento.getValorImovel();
            totalValorFinanciamentos += financiamento.calcularTotalPagamento();
        }

        // Mostrando resuldados
        System.out.println("\nResumo dos Valores:");
        for (int i = 0; i < financiamentos.size(); i++) {
            Financiamento financiamento = financiamentos.get(i);
            System.out.printf("Financiamento %d – valor do imóvel: R$ %.2f, valor do financiamento: R$ %.2f\n",
                    i + 1, financiamento.getValorImovel(), financiamento.calcularTotalPagamento());
        }

        // Mostrando o total dos imóveis e dos financiamentos
        System.out.printf("\nTotal de todos os Imóveis: R$ %.2f\n", totalValorImoveis);
        System.out.printf("Total de todos os Financiamentos: R$ %.2f\n", totalValorFinanciamentos);
    }
}

