import java.util.Scanner;
class ConditionalCheckQs {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		//Question 1 : Check entered no. is postive or negative
		System.out.println("Enter a number: ");
		float num = sc.nextInt();
		
		if(num < 0 )
			System.out.println("Number is negative");
		else 
			System.out.println("Number is positive");
		
		//Question 2 : Check the fever upon temperature input
		System.out.println("Enter your body temperature: ");
		double temp = sc.nextDouble();
		
		if(temp > 100)
			System.out.println("You have a Fever, Go to doctor!");
		else 
			System.out.println("No worries, You don't have a Fever");
		
				
		//Question 3 : Input (1-7) and print day of week using 'switch'
		System.out.println("Enter number of day: ");
		int noDay = sc.nextInt();
		
		switch(noDay) {
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tuesday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday"); break;
			case 5: System.out.println("Friday"); break;
			case 6: System.out.println("Saturday"); break;
			case 7: System.out.println("Sunday"); break;
			default: System.out.println("Enter valid day between (1-7)"); break;
		}
		
		//Question 4 : Guess value of x & y (Ternary operator)
		int a=63, b=36; 
		boolean x = (a<b) ? true : false; 
		
		int y= (a>b) ? a:b; // Gives x= false & y= 63
		
		
		//Question 5 : Check entered year is leap or not
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		
		/* -----If-else simple approach
		if(year % 4 == 0) {
			if (year % 100 == 0) {
				if(year % 400 == 0)
					System.out.println("Year is leap");
				else
					System.out.println("Year is not leap");
			} else {
				System.out.println("Year is leap");
			}
		} else {
			System.out.println("Year is not leap");				
		}

		*/
		
		//--- Q5 with logical operators approach
		boolean mod4 = (year % 4) == 0;
		boolean mod100 = (year % 100) != 0;
		boolean mod400 = ((year % 100 == 0) && (year % 400  == 0));
		
		if ( mod4 && (mod100 || mod400) ) {
			System.out.println("Year is leap");
		} else {
			System.out.println("Year is not leap");
		}
		sc.close();
	}
}