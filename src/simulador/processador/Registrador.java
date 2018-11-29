package simulador.processador;

/**
 *
 * @author Gabriel Haruki
 * @author Arthur Diniz
 * @author Fernando Masuda
 */

public class Registrador {
    
    //Cria uma variável float para armazenar o conteúdo do registrador
    private float conteudo;
    
    //Construtor da classe
    public Registrador() {
        //Inicializa o conteúdo do registrador
        conteudo = 0;
    }

    //Método Get da variável "conteudo"
    public float getConteudo() {
        return conteudo;
    }

    //Método Set da variável "conteudo"
    public void setConteudo(float conteudo) {
        this.conteudo = conteudo;
    }
    
}
