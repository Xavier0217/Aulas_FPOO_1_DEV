import java.util.Scanner;

public class CalculoDePassagem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a distancia em km percorrida ou que ira percorrer: ");
            double distancia = scanner.nextDouble();

            double precoPassagem;
            if (distancia <= 200) {
                precoPassagem = distancia * 0.50;
            } else {
                precoPassagem = distancia * 0.45;
            }

            System.out.printf("O preço da passagem é: R$ %.2f%n", precoPassagem);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Valor inválido. Certifique-se de digitar um número válido.");
        } finally {
            scanner.close();
        }
    }
}
