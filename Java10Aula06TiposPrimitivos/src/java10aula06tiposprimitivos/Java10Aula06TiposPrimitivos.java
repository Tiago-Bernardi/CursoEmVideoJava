/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java10aula06tiposprimitivos;

/**
 *
 * @author PC
 */
public class Java10Aula06TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //float padrão repare na necessidade do "f" após o valor da nota
        float nota1 = 9.5f;
        System.out.println("A nota 1 é " + nota1);
        
        //typecast repete-se o float e coloca-se entre parenteses
        float nota2 = (float) 9.7;
        System.out.println("A nota 2 é " + nota2);
        
        //Wrapper Class é usado classe e objeto para criar variavel
        Float nota3 = new Float(9.9);
        System.out.println("A nota 3 é " + nota3);
        
        //print formatado "%.(numero de casas decimais)f"
        float notaf1 = 8.5f;
        System.out.printf("A nota é %.2f \n", notaf1);
        
        //print formatado com String %s
        String nome = "Tiago";
        float notaf2 = 8.5f;
        System.out.printf("A nota de %s é %.2f \n", nome, notaf2);
        
         //print formatado com format é igual o printf
        float notaf3 = 8.7f;
        System.out.format("A nota é %.2f \n", notaf3);
    }
}
