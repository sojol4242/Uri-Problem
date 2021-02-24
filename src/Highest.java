package uri;

import java.util.Scanner;

public class Highest {

    public static void main(String[] args) {
        int   X, highest = 0, position = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            X = input.nextInt();

            if (highest > X) {
                highest = highest;
                position = position; 
            } else {
                highest = X;
                position = i;
            }

        }
        System.out.print(highest + "\n" + position + "\n");
    }
}
