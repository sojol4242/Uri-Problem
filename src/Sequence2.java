
public class Sequence2 {

    public static void main(String[] args) {

        double i = 0, j = 1, k = 0;
        for (i = 0; i <= 2; i = i + .2, k = k + .2) {
            for (j = 1 + k; j <= 3 + k; j++) {

                System.out.printf("I=%.1f J=%.1f\n", i, j);
            }
        }
    }
}
