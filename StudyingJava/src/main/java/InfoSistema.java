import java.awt.*;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class InfoSistema {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Locale idioma = Locale.getDefault();
        Date relogio = new Date();
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension d = tela.getScreenSize();

        System.out.println("A hora do sistema é...");
        System.out.println(relogio.toString());
        System.out.println("-------------------------");
        System.out.println("O seu idioma do seu sistema está em "+idioma.getDisplayLanguage());
        System.out.println("-------------------------");
        System.out.println("Resolução do Display: "+d.width+" x "+d.height);
        System.out.println("-------------------------");

        //vendo configurações do sistema
        System.out.println("Meu sistema Operacional é: " + System.getProperty("os.name"));
        System.out.println("Versão: " + System.getProperty("os.version"));
        System.out.println("Nome do usuário: " + System.getProperty("user.name"));





    }
}
