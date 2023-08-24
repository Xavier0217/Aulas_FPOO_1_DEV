
package classes.atividade;

public class Computador {
    
    private String memoria;
    private String processador;
    private ComputadorEnum capacidadeDiscoRigido;
    private String sistemaOperacional;
    private boolean estaLigado;
    private int temperatura;

    public Computador(String memoria, String processador, ComputadorEnum capacidadeDiscoRigido, String sistemaOperacional, boolean estaLigado, int temperatura) {
        this.memoria = memoria;
        this.processador = processador;
        this.capacidadeDiscoRigido = capacidadeDiscoRigido;
        this.sistemaOperacional = sistemaOperacional;
        this.estaLigado = estaLigado;
        this.temperatura = temperatura;
    }
    
    public void verificarLigado() {
        if (estaLigado = true) {
            System.out.println("O computador esta operando");
        } else {
            System.out.println("O computador esta desligado");
        }
    }
    
    public void verificarTemperatura() {
        if (temperatura >= 80) {
            System.out.println("O computador esta quente, tome cuidado.");
        } else {
            System.out.println("O computador esta com a temperatura boa.");
                }
            
        }

    @Override
    public String toString() {
        return "Computador{" + "memoria=" + memoria + ", processador=" + processador + ", capacidadeDiscoRigido=" + capacidadeDiscoRigido + ", sistemaOperacional=" + sistemaOperacional + ", estaLigado=" + estaLigado + ", temperatura=" + temperatura + '}';
    }
    
    }
    

