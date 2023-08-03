package atividade01;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores a serem inseridos: ");
        int quantidadeValores = input.nextInt();

        double soma = 0;

        for (int i = 1; i <= quantidadeValores; i++) {
            System.out.print("Digite o valor " + i + ": ");
            double valor = input.nextDouble();
            soma += valor;
        }

        double media = soma / quantidadeValores;
        System.out.println("A media aritmetica e: " + media);

        input.close();
    }
}

