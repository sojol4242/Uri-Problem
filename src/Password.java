
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;
        do {
            n = in.nextInt();

            if (n == 2002) {

                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        } while (true);

    }
}
