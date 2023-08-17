package enumeracao.atividades;

public class MesesDoAno {
    
    public static void main(String[] args) {
        
    
    System.out.println("Lista dos meses do ano:");
        for (TipoMesesEnum mes : TipoMesesEnum.values()){
            System.out.println("- " + mes.getMeses());
        }
    }
    
}
