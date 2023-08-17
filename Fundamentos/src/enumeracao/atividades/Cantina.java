
package enumeracao.atividades;


public class Cantina {
    
    public static void main(String[] args) {
        System.out.println("Lista de produtos:");
        for (TipoCantinaEnum produto : TipoCantinaEnum.values()) {
            System.out.println(produto.name());
        }
    }
    
}
