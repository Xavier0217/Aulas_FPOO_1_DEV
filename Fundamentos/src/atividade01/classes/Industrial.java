package atividade01.classes;

public class Industrial {
    private double quantidadeKwh;
    private double precoPagar;

    public Industrial(double quantidadeKwh) {
        this.quantidadeKwh = quantidadeKwh;
        calcularPrecoPagar();
    }

    private void calcularPrecoPagar() {
        precoPagar = quantidadeKwh <= 5000 ? 0.55 * quantidadeKwh : 0.60 * quantidadeKwh;
    }

    public double getPrecoPagar() {
        return precoPagar;
    }
}

