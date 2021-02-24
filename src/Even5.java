
import java.util.Scanner;

public class Even5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();

        int[] arr = {a, b, c, d, e};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count + " valores pares");
    }
}
