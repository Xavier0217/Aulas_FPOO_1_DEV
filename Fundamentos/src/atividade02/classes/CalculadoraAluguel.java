package atividade02.classes;

public class CalculadoraAluguel {
    public static double calcularAluguel(Veiculo veiculo, int dias, double kmRodados) {
        double valorAluguel = veiculo.getValorDiaria() * dias;
        valorAluguel += veiculo.getValorKmRodado() * kmRodados;
        return valorAluguel;
    }
}

