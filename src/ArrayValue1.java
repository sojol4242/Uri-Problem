
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class ArrayValue1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] N = new int[10];
        N[0] = leitor.nextInt();
        for (int i = 1; i < 10; i++) {
            N[i] = N[i - 1] * 2;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }

}
