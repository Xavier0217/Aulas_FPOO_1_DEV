
package enumeracao.atividades;


public class RedesSociais {
    
    public static void main(String[] args) {
        System.out.println("Lista de Tipos de Redes Sociais:");
        for (TipoRedesEnum redesTipo : TipoRedesEnum.values()){
            System.out.println("- " + redesTipo.getTiposRedes());
        }
    }
    
}
