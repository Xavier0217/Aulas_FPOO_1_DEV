package atividade02;

import java.util.Scanner;

public class Almoco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de opcoes:");
        System.out.println("1 - Arroz, feijao, bife acebolado (19,99 reais)");
        System.out.println("2 - Arroz, feijao, fila de frango frito (18,99 reais )");
        System.out.println("3 - Arroz, feijao, brajola (23,99 reais)");

        System.out.print("Escolha uma opcao (1/2/3): ");
        int opcao = scanner.nextInt();

        System.out.print("Digite a quantidade de pratos: ");
        int quantidade = scanner.nextInt();

        double precoTotal = 0.0;

        switch (opcao) {
            case 1:
                precoTotal = 19.99 * quantidade;
                break;
            case 2:
                precoTotal = 18.99 * quantidade;
                break;
            case 3:
                precoTotal = 23.99 * quantidade;
                break;
            default:
                System.out.println("Opcao invalida");
                return;
        }

        System.out.println("Total a pagar: " + precoTotal + " reais");

        scanner.close();
    }
}

