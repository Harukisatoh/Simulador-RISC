package simulador.processador;

/**
 *
 * @author Haruki
 */

public class Registradores {
    
    //Cria um array de Registrador, onde cada posição é um registrador
    private Registrador[] registradores;
    
    //Construtor da classe
    public Registradores() {
        //Inicializa registradores
        registradores = new Registrador[32];
        int i;
        for(i=0; i < 32; i++){
            registradores[i] = new Registrador();
        }
    }

    //Método Get da variável "registradores"
    public Registrador getRegistradores(int pos) {
        return registradores[pos];
    }

    //Método Set da variável "registradores"
    public void setRegistradores(Registrador registrador, int pos) {
        registradores[pos] = registrador;
    }
    
}
