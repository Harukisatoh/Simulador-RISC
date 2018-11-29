package simulador.processador;

import simulador.memoria.Memoria;

/**
 *
 * @author Gabriel Haruki
 * @author Arthur Diniz
 * @author Fernando Masuda
 */

public class UC {

    ULA ula;

    //Construtor da classe
    public UC() {
        ula = new ULA();
    }

    //Decodifica e interpreta a instrução
    public void interpretador(String instrucao, Registradores registradores, Memoria mem, PC pc) {

        //Divide a instrução em termos
        String termos[] = instrucao.split(" ");

        //Verifica qual instrução está sendo executada
        switch (termos[0]) {
            case "load":
                //Verifica se o endereço de memória digitado é válido
                try {
                    ula.load(encontraRegistrador(termos[1], registradores), mem.getCelulas(encontraMemoria(termos[2])));
                } catch(ArrayIndexOutOfBoundsException e) {
                    System.out.println("ERRO: POSIÇÃO DE MEMÓRIA NÃO ENCONTRADA");
                }
                break;
            case "store":
                //Verifica se o endereço de memória digitado é válido
                try {
                    ula.store(mem, encontraMemoria(termos[1]), encontraRegistrador(termos[2], registradores));
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("ERRO: POSIÇÃO DE MEMÓRIA NÃO ENCONTRADA");
                }
                break;
            case "add":
                ula.add(encontraRegistrador(termos[1], registradores), encontraRegistrador(termos[2], registradores));
                break;
            case "sub":
                ula.sub(encontraRegistrador(termos[1], registradores), encontraRegistrador(termos[2], registradores));
                break;
            case "mul":
                ula.mul(encontraRegistrador(termos[1], registradores), encontraRegistrador(termos[2], registradores));
                break;
            case "div":
                ula.div(encontraRegistrador(termos[1], registradores), encontraRegistrador(termos[2], registradores));
                break;
            case "jmp":
                ula.jmp(pc, encontraMemoria(termos[1]) - 1);
                break;
            case "branch":
                int i = Integer.parseInt(termos[1]);
                ula.branch(pc, i);
                break;
            default:
                System.out.println("ERRO: OPERAÇÃO NÃO RECONHECIDA");
                    break;
        }

    }

    //Função usada pra converter String para a referência de um Registrador
    public Registrador encontraRegistrador(String nome, Registradores registradores) {
        switch (nome) {
            case "r0":
                return (registradores.getRegistradores(0));
            case "r1":
                return (registradores.getRegistradores(1));
            case "r2":
                return (registradores.getRegistradores(2));
            case "r3":
                return (registradores.getRegistradores(3));
            case "r4":
                return (registradores.getRegistradores(4));
            case "r5":
                return (registradores.getRegistradores(5));
            case "r6":
                return (registradores.getRegistradores(6));
            case "r7":
                return (registradores.getRegistradores(7));
            case "r8":
                return (registradores.getRegistradores(8));
            case "r9":
                return (registradores.getRegistradores(9));
            case "r10":
                return (registradores.getRegistradores(10));
            case "r11":
                return (registradores.getRegistradores(11));
            case "r12":
                return (registradores.getRegistradores(12));
            case "r13":
                return (registradores.getRegistradores(13));
            case "r14":
                return (registradores.getRegistradores(14));
            case "r15":
                return (registradores.getRegistradores(15));
            case "r16":
                return (registradores.getRegistradores(16));
            case "r17":
                return (registradores.getRegistradores(17));
            case "r18":
                return (registradores.getRegistradores(18));
            case "r19":
                return (registradores.getRegistradores(19));
            case "r20":
                return (registradores.getRegistradores(20));
            case "r21":
                return (registradores.getRegistradores(21));
            case "r22":
                return (registradores.getRegistradores(22));
            case "r23":
                return (registradores.getRegistradores(23));
            case "r24":
                return (registradores.getRegistradores(24));
            case "r25":
                return (registradores.getRegistradores(25));
            case "r26":
                return (registradores.getRegistradores(26));
            case "r27":
                return (registradores.getRegistradores(27));
            case "r28":
                return (registradores.getRegistradores(28));
            case "r29":
                return (registradores.getRegistradores(29));
            case "r30":
                return (registradores.getRegistradores(30));
            case "r31":
                return (registradores.getRegistradores(31));
            default:
                return null;
        }
    }
    
    //Função usada pra converter String para a referência de uma célula de Memoria (int)
    public int encontraMemoria(String nome) {
        switch (nome) {
            case "m0":
                return (0);
            case "m1":
                return (1);
            case "m2":
                return (2);
            case "m3":
                return (3);
            case "m4":
                return (4);
            case "m5":
                return (5);
            case "m6":
                return (6);
            case "m7":
                return (7);
            case "m8":
                return (8);
            case "m9":
                return (9);
            case "m10":
                return (10);
            case "m11":
                return (11);
            case "m12":
                return (12);
            case "m13":
                return (13);
            case "m14":
                return (14);
            case "m15":
                return (15);
            default:
                return -1;
        }
    }

}
