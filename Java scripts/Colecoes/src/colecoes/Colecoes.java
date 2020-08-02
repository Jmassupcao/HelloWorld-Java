/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.Arrays;

/**
 *
 * @author joaom
 */
public class Colecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int n[] = new int[4];
        int n[] = new int[6]
        int n[] = {3,2,8,3,1,7};
        
        System.out.println("Total de elementos: " + n.length);
       /* for(int i=0; i<= n.length-1; i++){
        * System.out.println("O valor do indice " + i + " e igual a " + n[i]);
        */   }
        Arrays.sort(n);
        for (int val: n){
            System.out.println(val);
    }
    
}
