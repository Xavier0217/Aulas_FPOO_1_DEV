package classes.atividade;

public class Sala {
    
    private int numeroDeCadeiras;
    private int numeroDeMesas;
    private int numeroSala;
    private boolean temProjetor;
    private int numeroComputadores;
    private boolean aberto;
    private boolean arLigado;

    public Sala(int numeroDeCadeiras, int numeroDeMesas, int numeroSala, boolean temProjetor, int numeroComputadores, boolean aberto, boolean arLigado) {
        this.numeroDeCadeiras = numeroDeCadeiras;
        this.numeroDeMesas = numeroDeMesas;
        this.numeroSala = numeroSala;
        this.temProjetor = temProjetor;
        this.numeroComputadores = numeroComputadores;
        this.aberto = aberto;
        this.arLigado = arLigado;
    }
    
    public void verificarSala() {
        if (aberto = true) {
            System.out.println("A sala esta aberta, pode entrar!");
        } else {
            System.out.println("infezlimente a sala esta fechada, procure outra ou fale com a coordenacao.");
        }
    }
    
    public void verificarAr() {
        if (arLigado = true) {
            System.out.println("O ar condicionado esta ligado, a sala estara com o clima bom!");
        } else {
            System.out.println("O ar condicionado esta desligado, a sala estara abafada.");
        }
    }

    @Override
    public String toString() {
        return "Sala{" + "numeroDeCadeiras=" + numeroDeCadeiras + ", numeroDeMesas=" + numeroDeMesas + ", numeroSala=" + numeroSala + ", temProjetor=" + temProjetor + ", numeroComputadores=" + numeroComputadores + ", aberto=" + aberto + ", arLigado=" + arLigado + '}';
    }
    
    

    
    
    
    
    
}
