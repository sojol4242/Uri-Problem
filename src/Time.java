
import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = n / 3600;
        int s = (n - h * 3600) / 60;

        int m = (n - h * 3600) % 60;
        System.out.println(h + ":" + s + ":" + m);

    }
}
