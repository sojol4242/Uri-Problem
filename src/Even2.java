package uri;

 
import java.util.Scanner;

public class Even2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if (n > 5 && n < 2000) {

            for (int i = 2; i <= n; i = i + 2) {
                System.out.printf("%d^2 = %d\n", i, i * i);
            }

        }

    }

}
