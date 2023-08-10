package aulaestruturadecisao;

public class Ifelse2 {
    public static void main(String[] args) {
        int temperatura = 15;
        
        if (temperatura == 15) {
            System.out.println("esta ficando frio");
        } else if (temperatura == 20) {
            System.out.println("esta ficando agradavel");
        } else if (temperatura == 30) {
            System.out.println("esta ficando calor");
        }
        
        switch (temperatura) {
            case 15:
                System.out.println("esta ficando frio");
                break;
            case 20:
                System.out.println("esta ficando agradavel");
                break;
            case 30:
                System.out.println("esta ficando calor");
                break;
            default:
                throw new AssertionError();
        }
    }

}
