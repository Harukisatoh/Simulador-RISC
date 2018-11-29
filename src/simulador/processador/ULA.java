package simulador.processador;

/**
 *
 * @author Haruki
 */

public class ULA {
    
    //Construtor da classe
    public ULA() {
        
    }
    
    public void add(Registrador operando1, Registrador operando2) {
        if(operando1 == null || operando2 == null) {
            System.out.println("ERRO: NÃO ENCONTROU REGISTRADOR");
            return;
        }
        operando1.setConteudo(operando1.getConteudo() + operando2.getConteudo());
    }
    
}
