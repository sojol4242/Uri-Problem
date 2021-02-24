
import java.util.Scanner;

public class Fuel {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        int trip = in.nextInt();
        double cost = (1.0 / 12.0) * time * trip;
        System.out.printf("%.3f\n", cost);

    }
}
