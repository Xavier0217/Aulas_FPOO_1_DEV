
package enumeracao.atividades;


public class Cantina {
    
    public static void main(String[] args) {
        System.out.println("Produtos da Cantina:");
        for (TipoCantinaEnum itens : TipoCantinaEnum.values()){
            System.out.println("- " + itens.getProdutos());
        }
    }
    
}
