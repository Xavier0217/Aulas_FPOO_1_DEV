package atividade02;

import java.util.Scanner;

public class Imovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite quantos metros quadrados serao usados em m2: ");
        double m2 = scanner.nextDouble();
        
        if (m2 <= 250) {
            double calculo1 = m2 * 8.50;
            System.out.println("O valor total pago por " + m2 + "m2" + " e de: " + calculo1 + " reais");
        } else if (m2 <=350) {
            double calculo2 = m2 * 9.50;
            System.out.println("O valor total pago por " + m2 + "m2" + " e de: " + calculo2 + " reais");
        } else {
            double calculo3 = m2 * 11.50;
            System.out.println("O valor total pago por " + m2 + "m2" + " e de: " + calculo3 + " reais");
        }
        
    }

}
