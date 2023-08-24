package classes.atividade;

public class Curso {
    private String nome;
    private String descricao;
    private CursoEnum categoria;

    public Curso(String nome, String descricao, CursoEnum categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
    }
    
    public void verificarCurso() {
        System.out.println("Curso: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Categoria: " + categoria);
    }

    public void verificarCategoria() {
        System.out.println("A categoria do curso " + nome + " e: " + categoria);
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", descricao=" + descricao + ", categoria=" + categoria + '}';
    }
    
    
    
    
    
}
