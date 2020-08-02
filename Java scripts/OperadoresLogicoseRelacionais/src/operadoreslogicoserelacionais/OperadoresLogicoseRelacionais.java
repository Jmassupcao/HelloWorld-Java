/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicoserelacionais;

/**
 *
 * @author joaom
 */
public class OperadoresLogicoseRelacionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Operador terciario:");
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1>n2)?n1:n2;
        System.out.println(r);
        System.out.println("....................");
        
        System.out.println("Comparação de objetos");
        String nome1 = "Joao";
        String nome2 = "Joao";
        String nome3 = new String("Joao");
        String res;
        res = (nome1==nome2)?"igual":"diferente";
        System.out.println(res);
        res = (nome1==nome3)?"igual":"diferente";
        System.out.println(res);
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
        System.out.println("....................");
        
        System.out.println("Operadores Logicos");
        int x,y,z;
        x = 4;
        y = 7;
        z = 12;
        boolean re;
        re =(x<y && y==z)?true:false;
        System.out.println(re);
        re =(x<y || y==z)?true:false;
        System.out.println(re);
        re =(x<y ^ y==z)?true:false;
        System.out.println(re);
        
        
    }
    
}
