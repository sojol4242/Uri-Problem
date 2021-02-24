
import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String n = in.next();
        double main = in.nextDouble();
        double bonas = in.nextDouble();
        double total = (main + (15 * bonas) / 100);

        System.out.printf("TOTAL = R$ %.2f\n", total);

    }

}
