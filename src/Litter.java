
import java.util.Scanner;

public class Litter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int X = in.nextInt();
        float Y = in.nextFloat();

        float Z = (X / Y);

        System.out.printf("%.3f km/l\n", Z);

    }

}
