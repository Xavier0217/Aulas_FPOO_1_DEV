package atividade02.classes;

public class CalculadoraEconomia {
    public static double calcularValorEconomizadoPorMes(Item item, int quantidadeMeses) {
        return item.getValorTotal() * (item.getPercentualEconomia() / 100) / quantidadeMeses;
    }

    public static int calcularQuantidadeMeses(Item item, double valorMensal) {
        return (int) Math.ceil(item.getValorTotal() / (valorMensal * (1 - item.getPercentualEconomia() / 100)));
    }
}

