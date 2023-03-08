/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java16aula07operadoresaritmeticos;

/**
 *
 * @author PC
 */
public class Java16Aula07OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m + "\n");
        
        //Operadores unários 
        
        //Incremento (soma-se (+1) o sinal pode ser antes ou depois da variavel)
        int n3 = 5;
        n3++;
        System.out.println("Incremento de numero igual a 5 Resultado " + n3);
        
        //Decremento (diminui-se (-1) o sinal pode ser antes ou depois da variavel)
        int n4 = 5;
        n4--;
        System.out.println("Decremento de numero igual a 5 Resultado " + n4 + "\n");   
                   
        //Arredondamentos
        
        float v = 8.5f;
        
        int arbaixo = (int) Math.floor(v);
        System.out.println("Arredondando para baixo " + arbaixo);
        
        int arcima = (int) Math.ceil(v);
        System.out.println("Arredondando para cima " + arcima);
        
        int armath = (int) Math.round(v);
        System.out.println("Arredondando aritmeticamente " + armath + "\n");
        
        //Gerador de número 
        
        double ale = Math.random();
        System.out.println("Número aleatório entre 0 e 1 -> " + ale);
        int n = (int) (5 + ale * (11 - 5)); //numeros entre 10 e 5 
        System.out.println("Número aleatório entre 10 e 5 -> " + n);
    }
}
