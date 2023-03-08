package java29aula10votacao;

import java.util.Scanner;

public class Java29Aula10Votacao {

    public static void main(String[] args) {

        System.out.print("Qual o ano de nascimento? ");
        Scanner entrada_de_dados = new Scanner(System.in);

        int ano_de_nascimento = entrada_de_dados.nextInt();

        int idade = 2023 - ano_de_nascimento;
        System.out.println("Sua idade é " + idade);

        if (idade < 16) {
            System.out.println("Você não pode votar");
        } else {
            if ((idade >= 16 && idade < 18) || (idade > 70)) {
                System.out.println("O voto para você é opcional");
            } else {
                System.out.println("O voto para você é obrigatório");
            }
        }
    }
}
