package orientacaoObjetos;

public interface ClassificacaoPost {
    
    int UMA_ESTRELA = 1;
    int TRES_ESTRELAS = 3;
    int CINCO_ESTRELAS = 5;
    
    int comum(int qtdeEstrelas);
    int legal(int qtdeEstrelas);
    int superLegal(int qtdeEstrelas);
}
