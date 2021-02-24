package uri;

import java.util.Scanner;

public class Diiff {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();

        System.out.println("DIFERENCA = " + (A * B - C * D));

    }

}
