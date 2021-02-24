
import java.util.Scanner;

public class SUM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pos = 0;
        double sum = 0, avg;

        for (int i = 1; i <= 6; i++) {
            double n = in.nextDouble();

            if (n > 0) {
                sum = (sum + n);
                pos++;
            }
        }

        avg = sum / pos;
        System.out.printf("%d valores positivos\n", pos);
        System.out.printf("%.1f", avg);

    }
}
