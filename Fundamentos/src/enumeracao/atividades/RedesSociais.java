
package enumeracao.atividades;


public class RedesSociais {
    
    public static void main(String[] args) {
        System.out.println("Lista de redes sociais:");
        for (TipoRedesEnum rede : TipoRedesEnum.values()) {
            System.out.println(rede.name());
        }
    }
    
}
