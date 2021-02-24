import java.util.Scanner;
 
public class Salary1 {
   public static void main(String[] args){
     
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int h=in.nextInt();
     float r=in.nextFloat();
     System.out.println("NUMBER = "+n);
     System.out.printf("SALARY = U$ %.2f\n",(h*r));
     
     
    }
 
}