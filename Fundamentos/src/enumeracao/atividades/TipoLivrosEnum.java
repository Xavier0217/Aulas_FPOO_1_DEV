package enumeracao.atividades;


public enum TipoLivrosEnum {
    
    FICCAO("Ficção"),
    TERROR("Terror"),
    ROMANCE("Romance"),
    MISTERIO("Mistério"),
    FANTASIA("Fantasia");
    
    private String generos;

    private TipoLivrosEnum(String generos) {
        this.generos = generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public String getGeneros() {
        return generos;
    }
    

    @Override
    public String toString() {
        return "TipoLivrosEnum{" + "generos=" + generos + '}';
    }
    
    
    
}
