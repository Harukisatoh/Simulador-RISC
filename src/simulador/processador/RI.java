package simulador.processador;

/**
 *
 * @author Gabriel Haruki
 * @author Arthur Diniz
 * @author Fernando Masuda
 */

public class RI {
    
    //Cria uma variável float para armazenar o conteúdo do registrador
    private String conteudo;
    
    //Construtor da classe
    public RI() {
        //Inicializa o conteúdo do registrador
        conteudo = "";
    }

    //Método Get da variável "conteudo"
    public String getConteudo() {
        return conteudo;
    }

    //Método Set da variável "conteudo"
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
}
