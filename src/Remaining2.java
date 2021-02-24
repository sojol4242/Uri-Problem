
import java.util.Scanner;

public class Remaining2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i;

        for (i = 1; i < 10000; i++) {
            if (i % N == 2) {
                System.out.println(i);
            }
       
        }
    }
}
