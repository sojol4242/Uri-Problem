package uri;import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        double pi=3.14159;//	 eh o maior

        double a = (0.5 * A * C);
        double b = (pi * C * C);
        double c = (0.5 * (A + B)) * C;
        double d = (B * B);
        double e = (A * B);

        System.out.printf("TRIANGULO: %.3f\n", a);
        System.out.printf("CIRCULO: %.3f\n", b);
        System.out.printf("TRAPEZIO: %.3f\n", c);
        System.out.printf("QUADRADO: %.3f\n", d);
        System.out.printf("RETANGULO: %.3f\n", e);

    

    }

}
