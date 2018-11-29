package simulador.processador;

import java.math.BigDecimal;
import java.math.RoundingMode;
import simulador.memoria.Memoria;

/**
 *
 * @author Gabriel Haruki
 * @author Arthur Diniz
 * @author Fernando Masuda
 */

public class ULA {
    
    //Construtor da classe
    public ULA() {
        
    }
    
    //Função que carrega nos registradores um conteúdo da memória
    public void load(Registrador operando1, String conteudo) {
        
        //Verifica se realmente é um número, caso não seja, trata a excessão
        try {
            //Carrega para o registrador arredondando o conteudo para duas casas decimais
            //parseFloat converte String para float
            float d = Float.parseFloat(conteudo);
            BigDecimal bd = new BigDecimal(d).setScale(2, RoundingMode.HALF_EVEN);
            operando1.setConteudo(bd.floatValue());
            
        } catch(NumberFormatException e) {
            System.out.println("ERRO: NÚMERO COM FORMATO ERRADO");
        }
        
    }
    
    //Função que guarda na memória um conteúdo dos registradores
    public void store(Memoria mem, int pos, Registrador operando) {
        mem.setCelulas("" + operando.getConteudo(), pos);
    }
    
    //Função que executa uma adição de dois operandos, e guarda no primeiro
    public void add(Registrador operando1, Registrador operando2) {
        if(operando1 == null || operando2 == null) {
            System.out.println("ERRO: NÃO ENCONTROU REGISTRADOR");
            return;
        }
        operando1.setConteudo(operando1.getConteudo() + operando2.getConteudo());
    }
    
    //Função que executa uma subtração de dois operandos, e guarda no primeiro
    public void sub(Registrador operando1, Registrador operando2) {
        if(operando1 == null || operando2 == null) {
            System.out.println("ERRO: NÃO ENCONTROU REGISTRADOR");
            return;
        }
        operando1.setConteudo(operando1.getConteudo() - operando2.getConteudo());
    }
    
    //Função que executa uma multiplicação de dois operandos, e guarda no primeiro
    public void mul(Registrador operando1, Registrador operando2) {
        if(operando1 == null || operando2 == null) {
            System.out.println("ERRO: NÃO ENCONTROU REGISTRADOR");
            return;
        }
        operando1.setConteudo(operando1.getConteudo() * operando2.getConteudo());
    }
    
    //Função que executa uma divisão de dois operandos, e guarda no primeiro
    public void div(Registrador operando1, Registrador operando2) {
        
        //Verifica se todos operandos são válidos
        if(operando1 == null || operando2 == null) {
            System.out.println("ERRO: NÃO ENCONTROU REGISTRADOR");
            return;
        }
        
        //Verifica se é uma divisão por zero
        if (operando2.getConteudo() == 0) {
            System.out.println("ERRO: NÃO É POSSÍVEL DIVIDIR POR ZERO");
        } else {
            //Faz a divisão arredondando o resultado para duas casas decimais
            float d = operando1.getConteudo() / operando2.getConteudo();
            BigDecimal bd = new BigDecimal(d).setScale(2, RoundingMode.HALF_EVEN);
            operando1.setConteudo(bd.floatValue());
        }
        
    }
    
    //Função que pula para um endereço de memória
    public void jmp(PC pc, int pos) {
        pc.setContador(pos);
    }
    
    //Função que se desloca para outro endereço de memória
    public void branch(PC pc, int offset) {
        
        //Verifica se o deslocamento é maior, menor ou igual a 0
        if (offset < 0) {
            //Decrementa contador
            for(int i = offset; i <= 0; i++) {
                pc.subtrair();
            }
        } else if(offset > 0) {
            //Incrementa contador
            for(int i = offset; i > 1; i--) {
                pc.somar();
            }
        } else {
            //Contador continua com o mesmo valor
            pc.setContador(offset - 1);
        }
    }
    
}
