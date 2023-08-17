package enumeracao.atividades;


public enum TipoCantinaEnum {
    
    
    COXINHA("Coxinha"),
    ESFIHA("Esfiha"),
    HAMBURGUER("Hambúrguer"),
    DOGUINHO("Doguinho"),
    ENROLADINHO_DE_PRESUNTO_E_QUEIJO("Enroladinho de Presunto e Queijo"),
    REFRIGERANTE("Refrigerante"),
    SUCO("Suco"),
    DOCE("Doce");
    
    private String produtos;

    private TipoCantinaEnum(String produtos) {
        this.produtos = produtos;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "TipoCantinaEnum{" + "produtos=" + produtos + '}';
    }
    
    
}
