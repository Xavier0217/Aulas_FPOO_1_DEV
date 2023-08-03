package atividade01;

import atividade01.classes.Produto;
import atividade01.classes.Compra;
import java.util.Scanner;

public class VendaDeProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        int quantidadeProduto = scanner.nextInt();

        System.out.print("Digite a forma de pagamento (D para debito, C para credito): ");
        String formaPagamento = scanner.next();

        Produto produto = new Produto(nomeProduto, valorProduto, quantidadeProduto);
        Compra compra = new Compra(produto, formaPagamento);

        if (formaPagamento.equalsIgnoreCase("C")) {
            System.out.print("Digite o numero de parcelas: ");
            int numeroParcelas = scanner.nextInt();
            compra.setNumeroParcelas(numeroParcelas);
        }

        System.out.println("Detalhes da compra:");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor unitario: R$" + produto.getValor());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Valor total: R$" + produto.calcularValorTotal());

        if (formaPagamento.equalsIgnoreCase("D")) {
            System.out.println("Forma de pagamento: Debito");
            System.out.println("Valor final: R$" + compra.calcularValorFinal());
        } else if (formaPagamento.equalsIgnoreCase("C")) {
            System.out.println("Forma de pagamento: Credito");
            System.out.println("Numero de parcelas: " + compra.getNumeroParcelas());
            System.out.println("Valor da parcela: R$" + compra.calcularValorFinal());
        } else {
            System.out.println("Forma de pagamento inválida. Valor total sem desconto ou parcelamento: R$" + produto.calcularValorTotal());
        }

        scanner.close();
    }
}
