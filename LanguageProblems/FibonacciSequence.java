import java.util.Scanner;

class FibonacciSequence {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth term for sequence: ");
		int n = sc.nextInt();
		
		//Using Loop
		int first = 0; int second = 1;
		int third;
		System.out.println("Fibonacci sequence for nth term: ");
		
		for(int i=2; i<=n; i++) {
			third = first + second;
			
			System.out.print(third + " ");
			
			first= second; second= third;
		}
		sc.close();	
	}
}