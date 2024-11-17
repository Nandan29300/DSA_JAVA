import java.util.Scanner;

class sumOfNum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a no:");
		int n = sc.nextInt();
		int sum = 0; //Storing sum
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println("Sum of Numbers in " + n + ": " + sum);					
		sc.close();
	}
}	