import java.util.Scanner;
class LoopsQs {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		// Question 1 :How many times 'Hello' is printed?
		for(int i = 0; i<5; i++) 
		{ 
			System.out.println("Hello");
			i+=2;
		} // Ans: 2 times at iteration 2 and 4.
		
		/* Question 2: Write a program that reads a set of integers,
					   and then prints the sum of the even and odd integers */
		
		int evenSum=0; int oddSum=0;
		int number; int choice;
		
		do {
			System.out.println("Enter a number: ");
			number= sc.nextInt();			
			
			//evenSum
			if(number % 2 == 0 ) {
				evenSum += number;
			} else {
				oddSum += number; //oddSum
			}
			
			System.out.print("Do you want to continue? 1-> Yes 0->No: ");
			choice= sc.nextInt();
			
		} while(choice == 1);
		
		System.out.println("Sum of even numbers = " + evenSum);
		System.out.println("Sum of odd numbers = " + oddSum);
		
		// Question 3: Write a program to find the factorial of any number entered by the user.
		
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		int fact = 1;
		
		for(int i=1; i<=num; i++) {
			fact *= i;	
		}
		System.out.println("Factorial of " + num + "= " + fact);
		
		// Question 4: Write a program to print the multiplication table of a number N,entered by user
		
		System.out.println("Enter a number: ");
		int n= sc.nextInt();
		System.out.println("Table for " + n + ":");
		
		for(int i=1; i<=10; i++) {
			System.out.println( n + " * " + i + " = " + n * i );
		}
		
		sc.close();
	}
}