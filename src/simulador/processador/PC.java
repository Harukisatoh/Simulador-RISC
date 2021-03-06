package simulador.processador;

/**
 *
 * @author Gabriel Haruki
 * @author Arthur Diniz
 * @author Fernando Masuda
 */

public class PC {
    
    //Cria um contador
    private int contador;
    
    //Construtor da classe
    public PC(){
        //Inicializa contador
        contador = 0;
    }

    //Método Get da variável "contador"
    public int getContador() {
        return contador;
    }

    //Método Set da variável "contador"
    public void setContador(int contador) {
        this.contador = contador;
    }
    
    //Função que incrementa contador
    public void somar() {
        //Verifica se a já percorreu todas as células da memória
        if (contador == 15) {
            contador = -1;
        }
        
        //Incrementa contador
        contador++;
    }
    
    //Função que decrementa contador
    public void subtrair() {
        //Verifica se a já percorreu todas as células da memória
        if (contador == 0) {
            contador = 16;
        }
        
        //Decrementa contador
        contador--;
    }
    
}
