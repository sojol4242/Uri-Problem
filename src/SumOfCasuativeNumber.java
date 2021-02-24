
import java.util.Scanner;

public class SumOfCasuativeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M, N;
        long t1 = System.currentTimeMillis();
        while (true) {
            M = in.nextInt();
            N = in.nextInt();
            if (M <= 0 || N <= 0) {

                break;
            } else {

                int sum = 0;

                if (M < N) {
                    for (int i = M; i <= N; i++) {

                        System.out.printf(i + " ");
                        sum = sum + i;
                    }

                    System.out.printf("Sum=%d\n", sum);
                } else if (M > N) {
                    for (int i = N; i <= M; i++) {

                        System.out.printf(i + " ");
                        sum = sum + i;
                    }

                    System.out.printf("Sum=%d\n", sum);
                }

            }

            long t2 = System.currentTimeMillis();
            System.out.println("T = " + (t2 - t1));
        }

    }
}
