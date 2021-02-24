
import java.util.Scanner;

public class divide {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        while (N > 0) {

            int X, Y;

            X = in.nextInt();
            Y = in.nextInt();

            if (Y == 0) {

                System.out.println("divisao impossivel");
            } else {

                double r = (double) X / Y;

                System.out.printf("%.1f\n", r);
            }

            N--;
        }

    }
}
