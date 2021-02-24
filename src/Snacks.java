
import java.util.Scanner;

public class Snacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();

        switch (X) {

            case 1:
                System.out.printf("Total: R$ %.2f\n", 4.00 * Y);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n", 4.50 * Y);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n", 5.00 * Y);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n", 2.00 * Y);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n", 1.50 * Y);
                break;
            default:
                System.out.println("This is not in above list");
        }

    }
}
