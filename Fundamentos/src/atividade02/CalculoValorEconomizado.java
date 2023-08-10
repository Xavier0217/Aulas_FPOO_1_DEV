package atividade02;

import atividade02.classes.Item;
import atividade02.classes.CalculadoraEconomia;

public class CalculoValorEconomizado {
    public static void main(String[] args) {
        Item notebook = new Item("Notebook Lenovo", 3299.0, 5.0);
        Item celular = new Item("Celular MotoG22", 1789.0, 10.0);
        Item carro = new Item("Carro Hb20", 68000.0, 2.0);
        Item apartamento = new Item("Apartamento", 180000.0, 1.0);

        double valorMensal = 1000.0; 

        System.out.println("Economia necessária para comprar os itens:");

        System.out.println("Notebook Lenovo:");
        int mesesNotebook = CalculadoraEconomia.calcularQuantidadeMeses(notebook, valorMensal);
        System.out.println("   Meses necessarios: " + mesesNotebook + " meses");
        System.out.println("   Valor economizado por mes: " + CalculadoraEconomia.calcularValorEconomizadoPorMes(notebook, mesesNotebook) + " reais");

        System.out.println("Celular MotoG22:");
        int mesesCelular = CalculadoraEconomia.calcularQuantidadeMeses(celular, valorMensal);
        System.out.println("   Meses necessarios: " + mesesCelular + " meses");
        System.out.println("   Valor economizado por mes: " + CalculadoraEconomia.calcularValorEconomizadoPorMes(celular, mesesCelular) + " reais");

        System.out.println("Carro Hb20:");
        int mesesCarro = CalculadoraEconomia.calcularQuantidadeMeses(carro, valorMensal);
        System.out.println("   Meses necessarios: " + mesesCarro + " meses");
        System.out.println("   Valor economizado por mes: " + CalculadoraEconomia.calcularValorEconomizadoPorMes(carro, mesesCarro) + " reais");

        System.out.println("Apartamento:");
        int mesesApartamento = CalculadoraEconomia.calcularQuantidadeMeses(apartamento, valorMensal);
        System.out.println("   Meses necessarios: " + mesesApartamento + " meses");
        System.out.println("   Valor economizado por mes: " + CalculadoraEconomia.calcularValorEconomizadoPorMes(apartamento, mesesApartamento) + " reais");
    }
}

