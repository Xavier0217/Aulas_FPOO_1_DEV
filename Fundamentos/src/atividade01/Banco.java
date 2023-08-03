package atividade01;
import atividade01.classes.Casa;
import atividade01.classes.Emprestimo;
import atividade01.classes.Pessoa;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Digite o valor da casa a comprar: ");
            double valorCasa = scanner.nextDouble();
            
            System.out.print("Digite o salário da pessoa: ");
            double salario = scanner.nextDouble();
            
            System.out.print("Digite a quantidade de anos a pagar: ");
            int anos = scanner.nextInt();
            
            Casa casa = new Casa(valorCasa);
            Pessoa pessoa = new Pessoa(salario);
            Emprestimo emprestimo = new Emprestimo(casa, pessoa, anos);
            
            double prestacao = emprestimo.calcularPrestacaoMensal();
            if (prestacao == -1) {
                System.out.println("Emprestimo nao aprovado. Prestação mensal passa 30% do salário.");
            } else {
                System.out.printf("Emprestimo aprovado! Prestação mensal: R$ %.2f%n", prestacao);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("O valor citado e invalido. Cofira-o  e digite corretamente.");
        } finally {
            scanner.close();
        }
    }
}

