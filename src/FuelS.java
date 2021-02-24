
import java.util.Scanner;

public class FuelS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("MUITO OBRIGADO");
        while (n > 0) {

            switch (n) {
                case 1:
                    System.out.printf("Alcool:%d" + n);
                    break;
                case 2:
                    System.out.printf("Gasolina:%d" + n);
                    break;
                case 3:
                    System.out.printf("Alcool:%d" + n);
                    break;
                case 4:
                    System.out.printf("Diesel:%d" + n);
                    break;
            } 
        }

    }
}
