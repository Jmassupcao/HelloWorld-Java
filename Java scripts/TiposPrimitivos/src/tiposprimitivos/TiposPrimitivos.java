/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author joaom
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Qual a nota: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f \n", nome, nota);
        
        //TesteTipos
        int num = 28;
        String valor = Integer.toString(num);
        /* String valor = num
         * String valor = (string) num;
         * Não funcionam 
        */
        String nume = "12.6";
        int val = Integer.parseInt(nume);
        float valf = Float.parseFloat(nume);
        
        System.out.println(val);
        System.out.println(valor);
        
    }
    
}
