import java.util.Scanner;

class Day2Questions {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		/* 
		Question 1: In a program,input 3numbers:A,B and C.
		You have to output the average of these 3 numbers
		*/
		
		System.out.println("Enter Three Numbers: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		System.out.println("Average of 3 numbers = " + (a+b+c) / 3);
		
		/* 
		Question 2: In a program,input the side of a square.
		You have to output the area of the square. 
		*/
		
		System.out.println("Enter Side of square: ");		
		int side = sc.nextInt();
		System.out.println("Area of square= " + side*side);
		
		/* 
		Question 3: Enter cost of 3 items from the user(float)-
		a pencil, a pen and an eraser. 
		You have to output the total cost of the items back to the user as their bill..
		Add 18% gst tax	to bill	
		*/
		
		System.out.println("Enter cost of 3 items: ");
		float pencil= sc.nextInt();
		float pen= sc.nextInt();
		float eraser= sc.nextInt();

		
		double totalWithGST = (pencil+pen+eraser) + (pencil+pen+eraser)*0.18;
		System.out.println("Total bill (With 18% GST) = " + totalWithGST);

		/* 
		Question 4: What will be the type of result in the following Java code?
		byte b = 4; 
		char c = 'a';
		short s = 512;
		int i = 1000;
		float f = 3.14f;
		double d = 99.9954;
		result = (f✶ b) + (i % c) - (d * s);
		
		Type will be 'double' as largest type in equation is double.
		*/
		
		/* 
		Question 5: Will the following statementgive any error in Java?
		int$=24
		
		No, the special characters ( _ ,  $) are allowed as starting of variable name.
		*/	
		
		sc.close();
	}
}