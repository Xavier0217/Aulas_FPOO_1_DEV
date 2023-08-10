package atividade02.classes;

public class Item {
    private String nome;
    private double valorTotal;
    private double percentualEconomia;

    public Item(String nome, double valorTotal, double percentualEconomia) {
        this.nome = nome;
        this.valorTotal = valorTotal;
        this.percentualEconomia = percentualEconomia;
    }

    public String getNome() {
        return nome;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getPercentualEconomia() {
        return percentualEconomia;
    }
}

