package atividade02;

import atividade02.classes.Veiculo;
import atividade02.classes.CalculadoraAluguel;

public class AluguelVeiculos {
    public static void main(String[] args) {
        Veiculo fiatArgo = new Veiculo("Fiat Argo", 98, 2.39);
        Veiculo fiatMobi = new Veiculo("Fiat Mobi", 79, 1.99);
        Veiculo hyundaiHb20 = new Veiculo("Hyundai Hb20", 102, 2.99);

        int diasAluguel = 5;
        double kmRodados = 250.0;

        double valorAluguelFiatArgo = CalculadoraAluguel.calcularAluguel(fiatArgo, diasAluguel, kmRodados);
        double valorAluguelFiatMobi = CalculadoraAluguel.calcularAluguel(fiatMobi, diasAluguel, kmRodados);
        double valorAluguelHyundaiHb20 = CalculadoraAluguel.calcularAluguel(hyundaiHb20, diasAluguel, kmRodados);

        System.out.println("Valor do aluguel do Fiat Argo: " + valorAluguelFiatArgo + " reais");
        System.out.println("Valor do aluguel do Fiat Mobi: " + valorAluguelFiatMobi + " reais");
        System.out.println("Valor do aluguel do Hyundai Hb20: " + valorAluguelHyundaiHb20 + " reais");
    }
}

