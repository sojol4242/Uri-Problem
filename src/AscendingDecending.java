
import java.util.Scanner;

public class AscendingDecending {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int n1;

        do {
            n = in.nextInt();
            n1 = in.nextInt();

            if (n == n1) {

                break;
            } else {

                if (n > n1) {
                    System.out.println("Decrescente");
                } else {
                    System.out.println("Crescente");
                }

            }
        } while (true);

    }
}
