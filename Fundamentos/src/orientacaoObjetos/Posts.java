package orientacaoObjetos;

public class Posts implements ClassificacaoPost{
    
    private String usuario;
    private String titulo;
    private int visualizações;
    private int likes;
    private int comentarios;

    public Posts(String usuario, String titulo, int visualizações, int likes, int comentarios) {
        this.usuario = usuario;
        this.titulo = titulo;
        this.visualizações = visualizações;
        this.likes = likes;
        this.comentarios = comentarios;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getTitulo() {
        return titulo;
    }
    
    @Override
    public String toString() {
        return "Posts{" + "usuario=" + usuario + ", titulo=" + titulo + ", visualiza\u00e7\u00f5es=" + visualizações + ", likes=" + likes + ", comentarios=" + comentarios + '}';
    }
    @Override
    public int comum(int qtdeEstrelas) {
        return UMA_ESTRELA;
    }
    
    @Override
    public int legal(int qtdeEstrelas) {
        return TRES_ESTRELAS;
    }
    
    @Override
    public int superLegal (int qtdeEstrelas) {
        return CINCO_ESTRELAS;
    }
    
    

    
    
    
}
