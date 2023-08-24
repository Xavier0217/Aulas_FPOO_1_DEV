package classes.atividade;

public class Atividade {
    
    public static void main(String[] args) {
        
        Sala laboratorio = new Sala(34, 2, 7, false, 4, true, true);
            System.out.println(laboratorio);
            laboratorio.verificarAr();
            laboratorio.verificarSala();
            System.out.println("\n");

        
        Sala ensinoMedio = new Sala(34, 34, 5, true, 1, true, true);
            System.out.println(ensinoMedio);
            ensinoMedio.verificarAr();
            ensinoMedio.verificarSala();
            System.out.println("\n");
        
        Sala informatica = new Sala(34, 34, 8, true, 34, true, true);
            System.out.println(informatica);
            informatica.verificarAr();
            informatica.verificarSala();
            System.out.println("\n\n\n");
            
            
            
        Computador gamer = new Computador("Kingston 16 gigas", "Core i9", ComputadorEnum.UM_TERABYTE, "Windows 10", true, 70);
            System.out.println(gamer);
            gamer.verificarLigado();
            gamer.verificarTemperatura();
            System.out.println("\n");
            
        Computador trabalho = new Computador("Kingston 8 gigas", "Core i5", ComputadorEnum.QUINHENTOS_GIGAS, "Windows 10", true, 40);
            System.out.println(trabalho);
            trabalho.verificarLigado();
            trabalho.verificarTemperatura();
            System.out.println("\n");
        
        Computador virus = new Computador("Kingston 4 gigas", "Core i3", ComputadorEnum.CEM_GIGAS, "Windows 10", true, 140);
            System.out.println(virus);
            virus.verificarLigado();
            virus.verificarTemperatura();
            System.out.println("\n\n\n");
            
        
        Curso dev = new Curso("Desenvolvimento de sistemas", "Sistemas", CursoEnum.PROGRAMACAO);
        System.out.println(dev);
        
        Curso design = new Curso("Designer", "Design de coisas",CursoEnum.DESIGN);
        System.out.println(design);
        
        Curso negocios = new Curso("Negocios", "Negocios", CursoEnum.NEGOCIOS);
        System.out.println(negocios);
       
    }
    
}
