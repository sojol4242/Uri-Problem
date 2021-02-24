
import java.util.Scanner;

public class Vol {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double R = in.nextDouble();

        double pi = 3.14159;

        double vol = (4.0 / 3.0) * (pi * R * R * R);
        System.out.printf("VOLUME = %.3f\n", vol);

    }
}
