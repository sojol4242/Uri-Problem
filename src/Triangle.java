package uri;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double perimeter = (x + y + z);
        double area= ((x + y) * z) / 2;

        if ((x + y) > y && (x + y) > z && (y + z) > x) {

            System.out.printf("Perimetro = %.1f\n", perimeter);

        } else {

            System.out.printf("Area = %.1f\n",area);

        }

    }

}
