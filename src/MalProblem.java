
import java.util.Scanner;

public class MalProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();
        int sum = 0;
        if (X < Y) {
            for (int i = X + 1; i < Y; i++) {
                if (i % 13 != 0) {;
                    sum = sum + i;
                }

            }
            System.out.println(sum);
        } else if (X > Y) {
            for (int i = Y + 1; i < X; i++) {
                if (i % 13 != 0) {;
                    sum = sum + i;
                }

            }
            System.out.println(sum);
        }
    }
}
