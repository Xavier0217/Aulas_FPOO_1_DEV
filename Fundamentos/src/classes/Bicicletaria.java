package classes;


public class Bicicletaria {
    
    public static void main(String[] args) {
        Bicicleta caloiCross = new Bicicleta(2, true, 8, "Caloi Cross", true, "Vermelho e Preto");
        System.out.println(caloiCross);
        caloiCross.andar(10);
        caloiCross.andar(20);
        caloiCross.andar(30);
        System.out.println(caloiCross);
        
        Carro civic = new Carro("Urbano", "Honda", CorEnum.PRETO, 2015, 4, 4);
        System.out.println(civic);
        civic.carroAndar(100);
        System.out.println(civic);
        
        Carro uno = new Carro("Urbano", "Fiat", CorEnum.PRETO, 2018, 4, 3);
        System.out.println(uno);
        uno.carroAndar(80);
        System.out.println(uno);
        uno.trocarDeMarcha(MarchaEnum.PRIMEIRA_MARCHA);
        uno.trocarDeMarcha(MarchaEnum.SEGUNDA_MARCHA);
        System.out.println(uno);
        
        Aluno joao = new Aluno("Joao", "joao@example.com", 12345, true, 7);
        System.out.println(joao);
        joao.verificarAprovacao();
        joao.enviarEmailLembrete();

        Aluno maria = new Aluno("Maria", "maria@example.com", 67890, false, 5);
        System.out.println(maria);
        maria.verificarAprovacao();
        maria.enviarEmailLembrete();
        
    }
}
