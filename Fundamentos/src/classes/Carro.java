package classes;

public class Carro {

    private String modelo;
    private String marca;
    private CorEnum cor;
    private int ano;
    private int qtdeRodas;
    private int marcha;
    private int velocidade;
    private String situacao;

    public Carro(String modelo, String marca, CorEnum cor, int ano, int qtdeRodas, int marcha) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.qtdeRodas = qtdeRodas;
        this.velocidade = 0;
        this.situacao = "Parado";
        this.marcha = marcha;
    }
        
    public void carroAndar(int velocidade) {
        this.situacao = "Andando";
        this.velocidade = velocidade;
    }
    
    public void trocarDeMarcha(MarchaEnum novaMarcha) {
        int diferenca = novaMarcha.getNumeroMarcha() - this.marcha;
        
        if (diferenca == 1) {
            this.marcha = novaMarcha.getNumeroMarcha() - this.marcha;
        }
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", qtdeRodas=" + qtdeRodas + ", marcha=" + marcha + ", velocidade=" + velocidade + ", situacao=" + situacao + '}';
    }

    

    
    
}
