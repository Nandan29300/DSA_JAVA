import java.util.Scanner;

class Armstrong {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int originalNum = n; //Storing copy of no.
		int digit =0;
		int sumOfCubeOfDig=0; //To strore cubes
		
		//Loop for individual digit
		while(n!=0) {
			digit = n % 10;
			n = n/10;
			sumOfCubeOfDig+= digit * digit * digit;
		}
		
		//Armstrong check
		if (originalNum == sumOfCubeOfDig)
			System.out.println("Number is an Armstrong");
		else 
			System.out.println("Number is not an Armstrong");
		sc.close();
	}
}