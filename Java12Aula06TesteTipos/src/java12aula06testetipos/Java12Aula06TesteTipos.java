/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java12aula06testetipos;

/**
 *
 * @author PC
 */
public class Java12Aula06TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // converter inteiro int para String
        int idade1 = 30;
        String valor1 = Integer.toString(idade1);
        System.out.println(valor1);
        
        //converter String para inteiro int
        String valor2 = "31";
        int idade2 = Integer.parseInt (valor2);
        System.out.println(idade2);
      
        //converter String para real float
        String valor3 = "31.5";
        float idade3 = Float.parseFloat (valor3);
        System.out.println(idade3);
        
       //converter real float para String
       float idade4 = 36.5f;
       String valor4 = Float.toString (idade4);
       System.out.println(valor4);
       
       /*
        *converter int para String é Integer.toString (para String .toString)
        *converter float para String é Float.toString (para String .toString)
        *converter String para int é Integer.parseInt (I.parseI)
        *converter String para float é Float.parseFloat (F.parseF)
        */
    }
}
