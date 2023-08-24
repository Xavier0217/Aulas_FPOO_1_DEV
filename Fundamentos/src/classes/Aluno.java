package classes;

public class Aluno {
    
    private String nome;
    private String email;
    private int ra;
    private boolean fezLicao;
    private int media;

    public Aluno(String nome, String email, int ra, boolean fezLicao, int media) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.fezLicao = fezLicao;
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", ra=" + ra + ", fezLicao=" + fezLicao + ", media=" + media + '}';
    }

    public void verificarAprovacao() {
        if (fezLicao && media >= 6) {
            System.out.println(nome + " foi aprovado!");
        } else {
            System.out.println(nome + " nao foi aprovado.");
        }
    }

    public void enviarEmailLembrete() {
        if (!fezLicao) {
            System.out.println("Enviando email de lembrete para " + nome + ": Nao esqueca de fazer a licao!");
        }
    }
}

