package atividade02;

import atividade02.classes.Funcionario;

public class CalculoSalario {
    

    public static void main(String[] args) {
        
        Funcionario gerente = new Funcionario("Gerente", 5590, 8, 289);
        Funcionario supervisor = new Funcionario("Supervisor", 4128, 7, 239);
        Funcionario tecnico = new Funcionario("Tecnico", 3789, 4, 189);
        Funcionario auxiliar = new Funcionario("Auxiliar", 2345, 2, 156);
        
        
        System.out.println("Funcionario: " + gerente.getCargo());
        System.out.println("Salario Bruto: " + gerente.getSalario());
        System.out.println("Desconto INSS: " + gerente.calcularDescontoInss());
        System.out.println("Salario Liquido: " + gerente.calcularSalarioLiquido());
        System.out.println(" ");
        
        System.out.println("Funcionario: " + supervisor.getCargo());
        System.out.println("Salario Bruto: " + supervisor.getSalario());
        System.out.println("Desconto INSS: " + supervisor.calcularDescontoInss());
        System.out.println("Salario Liquido: " + supervisor.calcularSalarioLiquido());
        System.out.println(" ");
        
        System.out.println("Funcionario: " + tecnico.getCargo());
        System.out.println("Salario Bruto: " + tecnico.getSalario());
        System.out.println("Desconto INSS: " + supervisor.calcularDescontoInss());
        System.out.println("Salario Liquido: " + supervisor.calcularSalarioLiquido());
        System.out.println("");
        
        System.out.println("Funcionario: " + auxiliar.getCargo());
        System.out.println("Salario Bruto: " + auxiliar.getSalario());
        System.out.println("Desconto INSS: " + auxiliar.calcularDescontoInss());
        System.out.println("Salario Liquido: " + auxiliar.calcularSalarioLiquido());
        System.out.println("");
    }
}

