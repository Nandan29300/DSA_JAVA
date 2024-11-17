import java.util.Scanner;

public class SumOf2 {
    public static void main(String args[]) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        int a = sc.nextInt();
        System.out.println("Enter B:");
        int b = sc.nextInt();
        System.out.println("Sum of A & B: " + (a+b) );
        sc.close();
    }
    
}