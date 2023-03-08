package java21aula08comparacaostring;

public class Java21Aula08ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        
        //O nome1 é igual ao nome2
        String res1;
        res1 = (nome1==nome2)?"igual":"diferente";
        System.out.println(res1);
        
        //O nome1 ou nome2 é diferente do nome3
        //Eles tem o mesmo conteudo porém a estrutura é diferente
        String res2;
        res2 = (nome1==nome3)?"igual":"diferente";
        System.out.println(res2);
        
        //Aqui eu não uso o operador relacional para testar a igualdade
        //Com o metodo .esquals() eu verifico se os conteudos são iguais
        String res3;
        res3 = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res3);

    }
}
