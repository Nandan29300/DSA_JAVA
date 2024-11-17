import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args []) {
            
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal:");
        float principal  = sc.nextInt();
        System.out.println("Enter Rate of Interest:");
        float interest = sc.nextInt();
        System.out.println("Enter Time(Duration): " );
        float time = sc.nextInt();

        System.out.println("Simple Interest = " + (principal*interest*time) /100 );
        sc.close();
    }
}