package enumeracao.atividades;


public enum TipoMesesEnum {
    
    JANEIRO("Janeiro"),
    FEVEREIRO("Fevereiro"),
    MARÇO("Março"),
    ABRIL("Abril"),
    MAIO("Maio"),
    JUNHO("Junho"),
    JULHO("Julho"),
    AGOSTO("Agosto"),
    SETEMBRO("Setembro"),
    OUTUBRO("Outubro"),
    NOVEMBRO("Novembro"),
    DEZEMBRO("Dezembro");
    
    private String meses;

    private TipoMesesEnum(String meses) {
        this.meses = meses;
    }

    public void setMeses(String meses) {
        this.meses = meses;
    }

    public String getMeses() {
        return meses;
    }

    @Override
    public String toString() {
        return "TipoMesesEnum{" + "meses=" + meses + '}';
    }
    
    
}
