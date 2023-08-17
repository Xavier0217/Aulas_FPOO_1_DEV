
package enumeracao.atividades;


public class Livros {
    
        public static void main(String[] args) {
        System.out.println("Lista de livros:");
        for (TipoLivrosEnum livro : TipoLivrosEnum.values()) {
            System.out.println(livro.name());
        }
    }
    
}
