package orientacaoObjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class RedeSocial {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        
        
        Posts post1 = new Posts("Droidy", "Gameplay de alto nível", 50000, 23579, 12450);
        System.out.println(post1);
        int cincoEstrelas = post1.superLegal(5);
        System.out.println("O Post " + post1.getTitulo()+ ", do Usuário " + post1.getUsuario() + ", tem o total de " + cincoEstrelas + " Estrelas. É um post muito bom!\n");
        
        Posts post2 = new Posts("Jão do Rock", "Fazendo um Ouro Branco", 5000, 1200, 457);
        System.out.println(post2);
        int tresEstrelas = post2.legal(3);
        System.out.println("O Post " + post2.getTitulo()+ ", do Usuário " + post2.getUsuario() + ", tem o total de " + tresEstrelas + " Estrelas. É um post bom, mas pode melhorar\n");
        
        Posts post3 = new Posts("Cachorro Cearence", "Video do Cachorro Cearence solidário", 30, 0, 15);
        System.out.println(post3);
        int umaEstrela = post3.comum(1);
        System.out.println("O Post " + post3.getTitulo()+ ", do Usuário " + post3.getUsuario() + ", tem o total de " + umaEstrela + " Estrela. É um post ruim, melhore.\n");
        
    }
    
}
