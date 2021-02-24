
import java.util.Scanner;

public class T  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A, B, C;
        double temp;
        A = in.nextDouble();
        B = in.nextDouble();
        C = in.nextDouble();

        if (A < B) {
            temp = A;
            A = B;
            B = temp;
        }
        if (A < C) {
            temp = A;
            A = C;
            C = temp;
        }
        if (B < C) {
            temp = B;

            B = C;
            C = temp;
        }
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if ((A * A) == ((B * B) + (C * C))) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (A * A > B * B + C * C) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (A * A < B * B + C * C) {
            
            
            System.out.println("TRIANGULO ACUTANGULO");
        } else if (A == B && B == C) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (A == B || B == C) {
            System.out.println("TRIANGULO ISOSCELES");
        }

    }

}
