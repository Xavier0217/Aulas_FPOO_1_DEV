package atividade01;

import atividade01.classes.Funcionario;
import java.util.Scanner;


public class CalculoDeSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o salario do funcionario: ");
            double salario = scanner.nextDouble();

            Funcionario funcionario = new Funcionario(salario);
            double aumento = funcionario.calcularAumento();
            double novoSalario = salario + aumento;

            System.out.printf("O valor do aumento e: R$ %.2f%n", aumento);
            System.out.printf("O novo salario sera: R$ %.2f%n", novoSalario);
        } catch (java.util.InputMismatchException e) {
            System.out.println("O valor citado e invalido. Cofira-o  e digite corretamente");
        } finally {
            scanner.close();
        }
    }
}

