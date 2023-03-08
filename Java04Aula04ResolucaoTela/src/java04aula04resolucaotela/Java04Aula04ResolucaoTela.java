package java04aula04resolucaotela;

import java.awt.Toolkit;
import java.awt.Dimension;

public class Java04Aula04ResolucaoTela {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A sua tela está em resolução de " + d.width + " X " + d.height);
    }
}
