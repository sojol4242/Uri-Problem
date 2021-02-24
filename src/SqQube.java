
import java.util.Scanner;

public class SqQube {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 10000) {

            for (int i = 1; i <= n; i++) {

                System.out.println(i + " " + (i * i) + " " + (i * i * i));
            }

        }
    }
}
