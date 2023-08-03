package atividade01.classes;

public class Multa {
    private double valorBase = 5.0;
    private int limiteVelocidade = 80;

    public double calcularMulta(double velocidade) {
        if (velocidade > limiteVelocidade) {
            double kmAcima = velocidade - limiteVelocidade;
            return valorBase * kmAcima;
        } else {
            return 0;
        }
    }
}
