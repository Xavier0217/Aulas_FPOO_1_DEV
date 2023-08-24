package classes;


public class Bicicletaria {
    
    public static void main(String[] args) {
        Bicicleta caloiCross = new Bicicleta(2, true, 8, "Caloi Cross", true, "Vermelho e Preto");
        System.out.println(caloiCross);
        caloiCross.andar(10);
        caloiCross.andar(20);
        caloiCross.andar(30);
        System.out.println(caloiCross);
        
        Carro civic = new Carro("Urbano", "Honda", "Preto", 2015, 4);
        System.out.println(civic);
        civic.carroAndar(100);
        System.out.println(civic);
        
        Carro uno = new Carro("Urbano", "Fiat", "Vermelho", 2018, 4);
        System.out.println(uno);
        uno.carroAndar(80);
        System.out.println(uno);
        
        Aluno carlos = new Aluno("Carlos", "Carlos@gmail.com", 2134, true, 7);
        System.out.println(carlos);
        
    }
}
