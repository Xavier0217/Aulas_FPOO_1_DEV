package atividade01.classes;

import java.util.Scanner;

public class Compra {
    private Produto produto;
    private String formaPagamento;
    private int numeroParcelas;

    public Compra(Produto produto, String formaPagamento) {
        this.produto = produto;
        this.formaPagamento = formaPagamento;
        this.numeroParcelas = 1;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }
    
        public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public double calcularValorFinal() {
        double valorTotal = produto.calcularValorTotal();
        if (formaPagamento.equalsIgnoreCase("D")) {
            if (valorTotal <= 100.00) {
                return valorTotal * 0.95; 
            } else {
                return valorTotal * 0.97; 
            }
        } else if (formaPagamento.equalsIgnoreCase("C")) {
            return valorTotal / numeroParcelas; 
        } else {
            return valorTotal; 
        }
    }
}

