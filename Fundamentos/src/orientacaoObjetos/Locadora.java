package orientacaoObjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Locadora {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        Cliente robson = new Cliente("Robson");
        System.out.println(robson);
         double valorLocacaoSimples = robson.calcularLocacao(3);
         System.out.println("O valor da locação do filme simples é: " + valorLocacaoSimples + "\n");
         robson.validarNome(robson.getNome());
         robson.verificarEmailDominioGoogle(robson.getEmail());
     
         
         
        Cliente claudio = new Cliente("Cláudio", "claudiogamer@gmail.com");
        System.out.println(claudio);
        double valorLocacaoLancamento = claudio.calcularLocacao(3, true);
        System.out.println("O valor da locação do filme de lançamento é: " + valorLocacaoLancamento);
        claudio.validarNome(claudio.getNome());
        claudio.verificarEmailDominioGoogle(claudio.getEmail());
    }
    
}