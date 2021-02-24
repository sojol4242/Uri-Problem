
import java.util.Scanner;

public class Tax {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();

        if (n >= 0.00 && n <= 2000.00) {

            System.out.println("Isento");
        } else if (n >= 2000.01 && n <= 3000.00) {

            System.out.println("Isento");
        } else if (n >= 3000.01 && n <= 4500.00) {

            System.out.println("Isento");
        } else if (n > 4500.00) {

        }

    }
}
