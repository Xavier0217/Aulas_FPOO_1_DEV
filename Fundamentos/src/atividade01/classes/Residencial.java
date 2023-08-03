package atividade01.classes;

public class Residencial {
    private double quantidadeKwh;
    private double precoPagar;

    public Residencial(double quantidadeKwh) {
        this.quantidadeKwh = quantidadeKwh;
        calcularPrecoPagar();
    }

    private void calcularPrecoPagar() {
        precoPagar = quantidadeKwh <= 500 ? 0.40 * quantidadeKwh : 0.65 * quantidadeKwh;
    }

    public double getPrecoPagar() {
        return precoPagar;
    }
}

