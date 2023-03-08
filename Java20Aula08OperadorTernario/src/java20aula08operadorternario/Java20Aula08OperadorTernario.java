/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java20aula08operadorternario;

/**
 *
 * @author PC
 */
public class Java20Aula08OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
         * OPERADOR TERNARIO
         * Se (n1 > n2)
         * Então ?
         * n1+n2
         * Se não :
         * n1-n2
         */
     
        int n1, n2, r;
        n1 = 14;
        n2 = 8;
        r = (n1 > n2)?n1+n2:n1-n2;
        System.out.println(r);
        
        
    }
    
}
