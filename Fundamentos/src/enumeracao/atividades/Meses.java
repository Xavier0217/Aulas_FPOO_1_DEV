
package enumeracao.atividades;

public class Meses {
    
       public static void main(String[] args) {
        System.out.println("Lista de meses:");
        for (TipoMesesEnum mes : TipoMesesEnum.values()) {
            System.out.println(mes.name());
        }
    }
    
}
