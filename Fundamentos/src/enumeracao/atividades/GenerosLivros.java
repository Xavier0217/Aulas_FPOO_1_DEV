package enumeracao.atividades;


public class GenerosLivros {

    public static void main(String[] args) {

        System.out.println("Lista de Gêneros de Livros:");
        for (TipoLivrosEnum tipo : TipoLivrosEnum.values()) {
            System.out.println("- " + tipo.getGeneros());
        }
    }
}

