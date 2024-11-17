import java.util.Scanner;

public class functionQs {
    // Q1. Write a Java method to compute the average of three numbers.
    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    /*
     * Q2. Write a method named isEven that accepts an int argument.
     * The method should return true if thea rgument is even, or false otherwise.
     */

    public static boolean isEven(int no) {
        if (no % 2 == 0)
            return true;

        else
            return false;
    }

    //Q3. To check if a number is a palindrome
    public static boolean isPalindrome(int no) {
        int revN = 0;
        int orignalN = no;
        int lastD = 0;

        while (no != 0) {
            lastD = no % 10;
            revN = revN * 10 + lastD;
            no /= 10;
        }

        if (revN  == orignalN){
            return true;
        }    
        
        return false;
    }
    
    // Q4. Write a Java method to compute the sum of the digits in an integer
    public static int sumOfDig(int no) {
        int sum = 0;
        int lastD = 0;

        while (no >0 ) {
            lastD = no % 10;
            sum = sum + lastD;
            no /= 10;
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double a = sc.nextInt();
        System.out.println("Enter second number: ");
        double b = sc.nextInt();
        System.out.println("Enter third number: ");
        double c = sc.nextInt();
        
        //Calling average
        System.out.println("Average of 3 numbers= " + average(a, b, c));

        // ----------Checking Even or not
        System.out.println("Enter a number to check Even/Odd: ");
        int no = sc.nextInt();
        
        //Calling isEven
        if (isEven(no))
            System.out.println("Number is Even. ");
        else
            System.out.println("Number is odd.");
        
        //Calling isPalindrome
        System.out.println("Enter a number to check Palindrome/Not: ");
        no = sc.nextInt();
        
        //Calling isEven
        if (isPalindrome(no))
            System.out.println("Number is Palindrome. ");
        else
            System.out.println("Number is not Palindrome.");

        // ----------Calculating sum of digits
        System.out.println("Enter a number to calculate sum of digits: ");
        no = sc.nextInt();
        
        //Calling sumOfDig
        System.out.println("Sum of digits in number= " + sumOfDig(no));        

        sc.close();
    }
}   
