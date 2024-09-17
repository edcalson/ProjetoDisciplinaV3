package modelo;

public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }
    // Calculos
    public double calcularPagamentoMensal() {
        int prazoMeses = prazoFinanciamento * 12;
        double taxaMensal = (taxaJurosAnual / 12);
        return (valorImovel / prazoMeses) * (1 + taxaMensal);
    }

    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * prazoFinanciamento * 12;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void mostrarDadosFinanciamento() {
        System.out.printf("Valor do imóvel: R$ %.2f\n", valorImovel);
        System.out.printf("Prazo do financiamento: %d anos\n", prazoFinanciamento);
        System.out.printf("Taxa de juros anual: %.2f%%\n", taxaJurosAnual);
        System.out.printf("Total a pagar: R$ %.2f\n", calcularTotalPagamento());
    }
}

