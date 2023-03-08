package java03aula04idiomasistema;

import java.util.Locale;

public class Java03Aula04IdiomaSistema {

   public static void main(String[] args) {
       Locale loc = Locale.getDefault();
       System.out.println("Seu sistema está em " + loc.getDisplayLanguage());
    }
}
