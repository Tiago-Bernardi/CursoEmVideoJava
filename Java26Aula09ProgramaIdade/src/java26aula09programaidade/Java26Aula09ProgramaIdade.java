package java26aula09programaidade;

import java.util.Scanner;

public class Java26Aula09ProgramaIdade {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int nasc = t.nextInt();
        int i = 2023 - nasc;
        System.out.println("Sua idade é " + i);
        if (i >= 18) {
            System.out.println("Maior de Idade");
        } else {   
            System.out.println("Menor de Idade");
        }
    }
}
