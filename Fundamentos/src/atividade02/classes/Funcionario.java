package atividade02.classes;

public class Funcionario {
    private String cargo;
    private int salario;
    private int inss;
    private int convenio;

    public Funcionario(String cargo, int salario, int inss, int convenio) {
        this.cargo = cargo;
        this.salario = salario;
        this.inss = inss;
        this.convenio = convenio;
    }
    
    

    public String getCargo() {
        return cargo;
    }

    public int getSalario() {
        return salario;
    }

    public int getInss() {
        return inss;
    }

    public int getConvenio() {
        return convenio;
    }
    

    public int calcularDescontoInss() {
        return (int) (salario * (inss / 100.0));
    }
    

    public int calcularSalarioLiquido() {
        int descontoInss = calcularDescontoInss();
        return salario - descontoInss - convenio;
    }
}

