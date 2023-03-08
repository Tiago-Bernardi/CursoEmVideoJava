/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java18aula07operadoresunarios;

/**
 *
 * @author PC
 */
public class Java18Aula07OperadoresUnarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Atenção! Pós incremento é meio inutil, pois só funciona com a variavel 'numero' isolada");
        /* 
         * Exempleplificando!
         * numero1 = 5
         * valor1 = 5 + (numero1++)
         * valor1 = 5 + (5+1)
         * valor1 = 5 + 5
         * valor1 = 10
         */
        int numero1 = 5;
        int valor1 = 5 + numero1++;
        System.out.println(valor1);
        System.out.println(numero1);
             
        int numero2 = 10;
        int valor2 = 4 + numero2--;
        System.out.println(valor2);
        System.out.println(numero2);
             
        /*
         *Pré incremento funciona!
         *5 + (1+5)
         *5 + 6
         *11
         */
        int numero3 = 5;
        int valor3 = 5 + ++numero3;
        System.out.println("Pré Incremento");
        System.out.println(valor3);
        System.out.println(numero3);
        
        System.out.println("Operadores de Atribuição");
        int x = 4;
        x += 2;
        System.out.println(x); //  x = x + 2  -->  x = 4 + 2  -->  x = 6
        
        int y = 4;
        y *= 2;
        System.out.println(y); // y = y * 2  -->  y = 4 * 2  -->  y = 8  
        
        //Outro exemplo para ilustrar!
        System.out.println("Outro exemplo para facilitar a compreensão");
        
        int num1, num2;
		
	num1 = 6;
	num2 = 6;

	System.out.println(num1); //num1 = 6 
	System.out.println(num1++); //num1 = 6 + 1 que sera incrementado na proxima, ou seja, a resposta é 6
	System.out.println(num1); //num1 = 7 agora foi incrementado
		
	System.out.println(++num2); //num2 = 7 
	System.out.println(num2); //num2 = 7 
    } 
}
