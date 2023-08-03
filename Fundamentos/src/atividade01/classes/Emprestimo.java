package atividade01.classes;

public class Emprestimo {
    private Casa casa;
    private Pessoa pessoa;
    private int anos;
    
    public Emprestimo(Casa casa, Pessoa pessoa, int anos) {
        this.casa = casa;
        this.pessoa = pessoa;
        this.anos = anos;
    }
    
    public double calcularPrestacaoMensal() {
        double valorCasa = casa.getValor();
        double salario = pessoa.getSalario();
        int meses = anos * 12;
        
        double prestacao = valorCasa / meses;
        double limiteSalario = salario * 0.30;
        
        return prestacao <= limiteSalario ? prestacao : -1;
    }
}

