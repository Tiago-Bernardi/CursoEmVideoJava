/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java11aula06entradadedados;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Java11Aula06EntradaDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f \n", nome, nota);
    }
    //para ler inteiro é int variavel = varivael_do_scanner.nextInt();
    // int idade = teclado.nextInt();
    //Scanner é 
}
