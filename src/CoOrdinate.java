/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.util.Scanner;

public class CoOrdinate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float y = in.nextFloat();

         if (y > 0 && x > 0) {
            System.out.println("Q1");
        } else if (y < 0 && x < 0) {
            System.out.println("Q3");
        } else if (y < 0 && x > 0) {
            System.out.println("Q4");
        } else if (y > 0 && x < 0) {
            System.out.println("Q2");
        }
        
        
       else if (x == 0 && (y>0||y<0)) {
            System.out.println("Eixo Y");
        } else if (x == 0 && y ==0) {
            System.out.println("Origem");
        } else if (y == 0 && (x > 0||x<0)) {
            System.out.println("Eixo X");
        }  
       

    }
}
