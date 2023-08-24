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

    
    
    public void Passou(int media) {
        if (media >= 7) {
            System.out.println("O Aluno esta aprovado");
        } else {
            System.out.println("O Aluno esta reprovado");
        }
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", ra=" + ra + ", fezLicao=" + fezLicao + ", media=" + media + '}';
    }


    
    
    
}
