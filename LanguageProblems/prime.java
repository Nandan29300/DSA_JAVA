import java.util.Scanner;

class prime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean isPrime = true;
		
		System.out.println("Enter a no:");
		int n = sc.nextInt();
		
		for(int i=2; i*i<= n; i++) {
			if (n % i == 0 ) {
				isPrime = false;
				break;					
			}	
		}

		if (isPrime == true )
			System.out.println("No. is Prime");				
		else System.out.println("No. is non-prime");	

		sc.close();
	}
}	