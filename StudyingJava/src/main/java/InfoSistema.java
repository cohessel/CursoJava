import java.awt.*;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class InfoSistema {

    public static void main(String[] args) {


        Locale idioma = Locale.getDefault();
        Date relogio = new Date();
        Toolkit tela = Toolkit.getDefaultToolkit();

        System.out.println("A hora do sistema é...");
        System.out.println(relogio.toString());

        System.out.println("-------------------------");

        System.out.println("O seu idioma do seu sistema está em "+idioma);

        System.out.println("-------------------------");




    }
}
