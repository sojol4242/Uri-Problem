package uri;

import java.util.Scanner;

public class SalarIncrease {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();

        if (n >= 0 && n <= 400.00) {

            System.out.printf("Novo salario: %.2f\n", (n + n * 15 / 100));
            System.out.printf("Reajuste ganho: %.2f\n", (n * 15 / 100));
            System.out.println("Em percentual: 15 %");

        } else if (n >= 400.01 && n <= 800.00) {

            System.out.printf("Novo salario: %.2f\n", (n + n * 12 / 100));
            System.out.printf("Reajuste ganho: %.2f\n", (n * 12 / 100));
            System.out.println("Em percentual: 12 %");
        } else if (n >= 800.01 && n <= 1200.00) {

            System.out.printf("Novo salario: %.2f\n", (n + n * 10 / 100));
            System.out.printf("Reajuste ganho: %.2f\n", (n * 10 / 100));
            System.out.println("Em percentual: 10 %");

        } else if (n >= 1200.01 && n <= 2000.00) {

            System.out.printf("Novo salario: %.2f\n", (n + n * 7 / 100));
            System.out.printf("Reajuste ganho: %.2f\n", (n * 7 / 100));
            System.out.println("Em percentual: 7 %");
        } else if (n > 2000.00) {

            System.out.printf("Novo salario: %.2f\n", (n + n * 4 / 100));
            System.out.printf("Reajuste ganho: %.2f\n", (n * 4 / 100));
            System.out.println("Em percentual: 4 %");
        }

    }

}
