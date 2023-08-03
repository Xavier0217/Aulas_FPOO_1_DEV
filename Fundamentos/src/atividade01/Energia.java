package atividade01;
import atividade01.classes.Residencial;
import atividade01.classes.Comercio;
import atividade01.classes.Industrial;
public class Energia {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Digite a quantidade de KW/h consumidos: ");
        double quantidadeKwh = input.nextDouble();

        System.out.print("Digite o tipo de instalacao elatrica (R para residencia, I para industria e C para comercio): ");
        char tipoInstalacao = input.next().charAt(0);

        double precoPagar = calcularPrecoPagar(quantidadeKwh, tipoInstalacao);
        System.out.println("O preco a pagar e: " + precoPagar + " reais");

        input.close();
    }

    public static double calcularPrecoPagar(double quantidadeKwh, char tipoInstalacao) {
        double preco;
        if (tipoInstalacao == 'R') {
            preco = quantidadeKwh <= 500 ? 0.40 : 0.65;
        } else if (tipoInstalacao == 'C') {
            preco = quantidadeKwh <= 1000 ? 0.55 : 0.60;
        } else if (tipoInstalacao == 'I') {
            preco = quantidadeKwh <= 5000 ? 0.55 : 0.60;
        } else {
            System.out.println("Tipo de instalaçao invalido!");
            return 0.0;
        }

        return quantidadeKwh * preco;
    }
}


