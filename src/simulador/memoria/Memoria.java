package simulador.memoria;


/**
 *
 * @author Gabriel Haruki
 * @author Arthur Diniz
 * @author Fernando Masuda
 */

public class Memoria {
    
    //Cria um array de string, onde cada posição é uma célula da memória
    private String[] celulas;
    
    //Construtor da classe
    public Memoria() {
        
        //Inicializa células da memória
        celulas = new String[16];
        int i;
        for(i=0; i < 16; i++){
            celulas[i] = null;
        }
        
    }

    //Método Get da variável "celulas"
    public String getCelulas(int pos) {
        return celulas[pos];
    }

    //Método Set da variável "celulas"
    public void setCelulas(String celula, int pos) {
        celulas[pos] = celula;
    }
    
}
