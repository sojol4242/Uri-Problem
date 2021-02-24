/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.util.Scanner;

public class ArrayReplace1 {

    public static void main(String[] args) {

        int X[] = new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < X.length; i++) {
            int n = in.nextInt();

            if (n <= 0) {
                int n1 = 1;
                System.out.printf("X[%d] = %d\n", i, n1);

            } else {
                System.out.printf("X[%d] = %d\n", i, n);
            }
        }

    }
}
