package atividade01;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o raio do circulo em cm(raio = comprimento / 2): ");
        double raio = scanner.nextDouble();
        
        System.out.print("Digite o valor de pi que sera considerado: ");
        double pi = scanner.nextDouble();
        
        double area = pi * (raio * raio);
        
        System.out.println("A area do circulo e: "+ area+"cm");
    }

}
