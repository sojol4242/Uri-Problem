
import java.util.Scanner;

public class Quardinates {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x;
        int y;
        do {
            x = in.nextInt();
            y = in.nextInt();
            if (x > 0 && y > 0) {

                System.out.println("primeiro");
            } else if (x < 0 && y < 0) {

                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {

                System.out.println("quarto");
            } else if (x < 0 && y > 0) {

                System.out.println("segundo");
            }

            if (x == 0 || y == 0) {
                break;
            }

        } while (true);

    }
}
