import java.util.Scanner;
class primeN {

    public static boolean prime (int n ) {
        boolean isPrime = true;
        
        if( n == 2) { //Edge-cases
            return true; 
        }

        for(int i=2; i<=Math.sqrt(n); i++) { //Optimization only runs till √n
            if(n % i == 0) {
                return false;
            }
        }
        return isPrime;
    }

    //Prime in range ->
    public static void primeInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(prime(i)) { //Print if true
                System.out.print(i + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no. to get all prime numbers till that: ");
        int no = sc.nextInt();
        System.out.println("Prime numbers in range of "+no+ " : ");
        primeInRange(no);



        sc.close();
    }
}