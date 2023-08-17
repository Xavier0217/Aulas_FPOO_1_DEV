package enumeracao.atividades;


public enum TipoRedesEnum {
    
   REDES_DE_STREAMING("Redes de Streaming"),
   REDES_DE_MENSAGENS_INSTANTANEAS("Redes de Mensagens Instantâneas"),
   REDES_DE_JOGOS("Redes de Jogos");
   
   private String tiposRedes;

    private TipoRedesEnum(String tiposRedes) {
        this.tiposRedes = tiposRedes;
    }

    public String getTiposRedes() {
        return tiposRedes;
    }

    public void setTiposRedes(String tiposRedes) {
        this.tiposRedes = tiposRedes;
    }

    @Override
    public String toString() {
        return "TipoRedesEnum{" + "tiposRedes=" + tiposRedes + '}';
    }
   
   
}
