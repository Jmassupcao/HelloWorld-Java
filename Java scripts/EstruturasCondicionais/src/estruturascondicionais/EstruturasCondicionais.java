/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturascondicionais;


/**
 *
 * @author joaom
 */
import java.util.Scanner;
public class EstruturasCondicionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota? ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda nota? ");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.printf("sua media foi %.2f \n", m);
        
        if(m>9){
            System.out.println("Parabens!");
        }else{
            System.out.println("Estude mais");
        }
    }
    
}
