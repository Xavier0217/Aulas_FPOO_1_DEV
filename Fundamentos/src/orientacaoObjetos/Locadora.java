package orientacaoObjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Locadora {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        Cliente robson = new Cliente("Robson");
        System.out.println(robson);
         double valorLocacaoSimples = robson.calcularLocacao(3);
         System.out.println("O valor da locação do filme simples é: " + valorLocacaoSimples);
     
        Cliente claudio = new Cliente("Cláudio", "claudiogamer@gmail.com");
        System.out.println(claudio);
        double valorLocacaoLancamento = claudio.calcularLocacao(3, true);
        System.out.println("O valor da locação do filme de lançamento é: " + valorLocacaoLancamento);
        
    }
    
}
