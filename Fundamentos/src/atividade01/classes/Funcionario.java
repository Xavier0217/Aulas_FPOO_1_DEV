package atividade01.classes;

public class Funcionario {

    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double calcularAumento() {
        if (salario > 1350) {
            return salario * 0.10;
        } else {
            return salario * 0.15;
        }
    }
}
