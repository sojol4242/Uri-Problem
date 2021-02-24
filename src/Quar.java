
import java.util.Scanner;

public class Quar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = Math.sqrt(b * b - 4 * a * c);

        double A = 2 * a;
        double R1 = (-b + d) / (A);
        double R2 = (-b - d) / (A);

        if (d > 0 && A != 0) {

            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);

        } else {
            System.out.println("Impossivel calcular");
        }

    }

}
