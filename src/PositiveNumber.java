
import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pos = 0, neg = 0,par = 0, im = 0;
        for (int i = 1; i <= 5; i++) {
            int n = in.nextInt();

            if (n > 0) {
                pos++;
            } else {
                if (n != 0) {
                    neg++;
                }
            }

            if (n % 2 == 0) {
                par++;
            } else {
                im++;
            }
        }
        System.out.printf("%d valor(es) impar(es)\n", im);
        System.out.printf("%d valor(es) impar(es)\n", par);
        System.out.printf("%d valor(es) positivo(s)\n", pos);
        System.out.printf("%d valor(es) negativo(s)\n", neg);

    }

}
