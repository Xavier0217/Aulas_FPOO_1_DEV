package atividade01.classes;

public class Comercio {
    private double quantidadeKwh;
    private double precoPagar;

    public Comercio(double quantidadeKwh) {
        this.quantidadeKwh = quantidadeKwh;
        calcularPrecoPagar();
    }

    private void calcularPrecoPagar() {
        precoPagar = quantidadeKwh <= 1000 ? 0.55 * quantidadeKwh : 0.60 * quantidadeKwh;
    }

    public double getPrecoPagar() {
        return precoPagar;
    }
}

