package classes;

public class Carro {

    private String modelo;
    private String marca;
    private String cor;
    private int ano;
    private int qtdeRodas;
    private int velocidade;
    private String situacao;

    public Carro(String modelo, String marca, String cor, int ano, int qtdeRodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.qtdeRodas = qtdeRodas;
        this.velocidade = 0;
        this.situacao = "Parado";
    }
        
    public void carroAndar(int velocidade) {
        this.situacao = "Andando";
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", qtdeRodas=" + qtdeRodas + ", velocidade=" + velocidade + ", situacao=" + situacao + '}';
    }

    
    
}
