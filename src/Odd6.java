package uri;

import java.util.Scanner;

public class Odd6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int X = in.nextInt();

        if (X > 0) {

            for (int i = 0; i < 12; i++) {
                if ((X + i) % 2 != 0) {
                    System.out.println((X + i));

                }
            }

        }

    }
}
