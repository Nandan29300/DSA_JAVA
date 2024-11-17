import java.util.Scanner;

class FunctionsN_Methods {

    //Factorial
    public static int factorial(int n) {
        int fact = 1;
        
        for(int i = 1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    //Binomial Coeff n! / r! * (n-r)!
    public static int binCoeff(int n, int r) {
        int factN = factorial(n);
        int factR = factorial(r);
        int factnMr = factorial(n-r);

        int binCoeff = factN / (factR * factnMr);
        return binCoeff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // ------------Factorial
        System.out.println("Enter a no. to find factorial");
        int n = sc.nextInt();
        System.out.println("Factorial of number: "+ factorial(n));
        
        // ------------Binomial Coefficient
        System.out.println("Binomial Coefficient for n:5, r:2 = " + binCoeff(5, 2));

        sc.close();

    }
}