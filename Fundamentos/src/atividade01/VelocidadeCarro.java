package atividade01;

import atividade01.classes.Veiculo;
import atividade01.classes.Multa;
import java.util.Scanner;

public class VelocidadeCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a velocidade do carro em km/h: ");
            double velocidadeCarro = scanner.nextDouble();
            Veiculo veiculo = new Veiculo(velocidadeCarro);
            Multa multa = new Multa();

            double valorMulta = multa.calcularMulta(veiculo.getVelocidade());

            if (valorMulta > 0) {
                System.out.printf("Voce foi multado! Valor da multa: R$ %.2f\n", valorMulta);
            } else {
                System.out.println("Parabéns, você está dentro do limite de velocidade!");
            }
        } catch (Exception e) {
            System.out.println("Valor inválido. Digite um número válido para a velocidade.");
        } finally {
            scanner.close();
        }
    }
}
