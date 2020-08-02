/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classearray;

import java.util.Arrays;

/**
 *
 * @author joaom
 */
public class ClasseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int colec[] = new int[40];
        Arrays.fill(colec, 0);
        
        float num[] = { 31,-5,7,2,1,23};
        for (float valor:num){//for expecifico para arrays 
            System.out.println(valor);
        }
        System.out.println(" ");
        Arrays.sort(num);//ordenar o array 
        int pos = Arrays.binarySearch(num,7);
        System.out.println("encontrei o valor na posicao " + pos);
        
        for (int val:colec){
            System.out.print(val);
        }
    }
    
}
