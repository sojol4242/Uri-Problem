/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.util.Scanner;

public class SumOdd {

    public static void main(String[] args) {

        
        //when x>0
        //and y>0 this code is perfect;
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1 = in.nextInt();

        int sum = 0;
        for (int i = n1; i < n; i++) {
            if (i % 2 != 0) {;
                sum = sum + i;
            }
        }
        System.out.println(sum);

    }

}
