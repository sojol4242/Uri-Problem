package uri;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Fib {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, f;

        System.out.println("Take Range ");
        n = in.nextInt();

        if (n > 0 && n <= 60) {
            int fib[] = new int[n];

            fib[0] = 0;
            fib[1] = 1;
            for (int j = 2; j <= fib.length - 1; j++) {
                fib[j] = fib[j - 2] + fib[j - 1];
                          System.out.println(fib[j]);
            }
    
            
//            System.out.printf("Fibonacci List Of This Up To %d  Range \n", n);
//            for (int a : fib) {
//
//                System.out.print(a + "  ");
//
//            }
//            System.out.println();
//            for (int i = 0; i < n; i++) {
//                f = in.nextInt();
//                System.out.printf("Fib(%d) = %d\n", f, fib[f]);
//
//            }

        }

    }
}
