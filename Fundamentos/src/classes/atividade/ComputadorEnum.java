package classes.atividade;


public enum ComputadorEnum {
    
    CEM_GIGAS("100 gigas"),
    QUINHENTOS_GIGAS("500 gigas"),
    UM_TERABYTE("1 terabyte");
    
    private String capacidadeDisco;

    private ComputadorEnum(String capacidadeDisco) {
        this.capacidadeDisco = capacidadeDisco;
    }

    public String getCapacidadeDisco() {
        return capacidadeDisco;
    }
    
    
    
    
    
    
}
