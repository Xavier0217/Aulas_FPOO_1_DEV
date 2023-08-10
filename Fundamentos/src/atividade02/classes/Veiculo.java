package atividade02.classes;

public class Veiculo {
    private String nome;
    private int valorDiaria;
    private double valorKmRodado;

    public Veiculo(String nome, int valorDiaria, double valorKmRodado) {
        this.nome = nome;
        this.valorDiaria = valorDiaria;
        this.valorKmRodado = valorKmRodado;
    }

    public String getNome() {
        return nome;
    }

    public int getValorDiaria() {
        return valorDiaria;
    }

    public double getValorKmRodado() {
        return valorKmRodado;
    }
}
