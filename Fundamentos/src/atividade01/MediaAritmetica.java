package atividade01;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores a serem inseridos: ");
        int quantidadeValores = input.nextInt();

        double[] valores = new double[quantidadeValores];

        for (int i = 0; i < quantidadeValores; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = input.nextDouble();
        }

        double media = calcularMedia(valores);
        System.out.println("A media aritmetica e: " + media);

        input.close();
    }

    public static double calcularMedia(double... valores) {
        double soma = 0;

        for (double valor : valores) {
            soma += valor;
        }

        return soma / valores.length;
    }
}


