/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author joaom
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    static void soma(int a, int b){ /*um método estático sem retorno (procedimento)
//void para criar método sem retorno *é funcional apenas dentro da classe                               
                                     *isto é ele não faz parte de um estanciamento
                                     *de objeto.*/
        int s = a + b;
        System.out.println("A soma é " + s);
    }
    static int somaF(int a, int b){     /*Um método estático com retorno (Função)
//Um TipoPrimitivo para criar uma função *é funcional apenas dentro da classe
                                         *isto é ela não faz parte de um estanciamento
                                         *de objeto.*/
        int s = a + b;
        return s;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        soma(5,2);  /*método sem retorno (procedimento) soma, 
                     *um procedimento não retorna valor
                     *ele retorna uma ação
                     *uma método com retorno (função) retorna valor.*/ 
        
        int sm = somaF(2,2);/*método com retorno (função) somaF, 
                             *uma função retorna um valor que pode
                             *ser atribuido a uma variável, participar
                             *de uma opração aritmética, lógica, etc
                             */
        System.out.println("Valor da função é " + sm);
    }
    
}
