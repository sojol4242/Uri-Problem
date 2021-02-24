 
package uri;

import java.util.Scanner;

public class AVG {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float A = in.nextFloat();
        float B = in.nextFloat();
        float C = in.nextFloat();
        float D = in.nextFloat();

        float MEDIA;

        MEDIA = ((A * 2) + (B * 3) + (C * 4) + (D * 1)) / 10;

        System.out.printf("Media: %.1f\n", MEDIA);

        if (MEDIA >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (MEDIA < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (MEDIA >= 5.0 && MEDIA < 7) {

            System.out.println("Aluno em exame.");
            double a = in.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", a);
            MEDIA = (float) ((MEDIA + a) / 2);

            if (MEDIA >= 5.0) {
                System.out.println("Aluno aprovado.");

            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", MEDIA);

        }

    }

}
