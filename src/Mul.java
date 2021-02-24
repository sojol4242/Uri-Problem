
import java.util.Scanner;

public class Mul {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        if (A > B) {

            if (A % B == 0) {
                System.out.println("Sao Multiplos");
            } else {

                System.out.println("Nao sao Multiplos");
            }

        } else if (B > A) {
            if (B % A == 0) {
                System.out.println("Sao Multiplos");
            } else {

                System.out.println("Nao sao Multiplos");
            }
        }
    }
}
