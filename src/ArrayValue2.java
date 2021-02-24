
import java.util.Scanner;

public class ArrayValue2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N[] = new int[10];

//        arr[0] = 10;
//        arr[1] = arr[0] * 2;
//        arr[2] = arr[1] * 2;
//        arr[3] = arr[2] * 2;
//        arr[4] = arr[3] * 2;
//        arr[5] = arr[4] * 2;
        int V = in.nextInt();

        if (V < 50) {

            System.out.println(N[0] = V);
            for (int i = 1; i < N.length; i++) {

                N[i] = N[i - 1] * 2;
         

            }
            for (int i = 0; i < 10; i++) {
                System.out.println("N[" + i + "] = " + N[i]);//gitthub;
            }
        }

    }

}
