
package classes.atividade;


public enum CursoEnum {
    
    PROGRAMACAO("Progracao"),
    DESIGN("Design"),
    NEGOCIOS("Negocios"),
    OUTROS("Outros");
    
    private String categorias;

    private CursoEnum(String categorias) {
        this.categorias = categorias;
    }

    public String getCategorias() {
        return categorias;
    }
    
    
    
}
