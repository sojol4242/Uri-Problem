
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        for (int i = 1; i <= N; i++) {
            int X = in.nextInt();
            //if (X == 0) {

             //   System.out.println("NULL"); }
             if ( X % 2 == 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (X > 0 && X % 2 == 0) {
                System.out.println("EVEN POSITIVE");
            } else if (X < 0 && X % 2 == -1) {
                System.out.println("ODD NEGATIVE");
            } else if (X > 0 && X % 2 == 1) {
                System.out.println("ODD POSITIVE");
            }

        }

    }
}
