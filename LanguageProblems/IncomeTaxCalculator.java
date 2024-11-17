import java.util.Scanner;

class IncomeTaxCalculator {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your current income: ");
		float income = sc.nextInt();
		float tax;
		
		if(income < 500000) {
			tax = 0;
		} else if(income >= 500000 && income < 1000000) {
			tax = (float) (income * 0.2) ; //20% tax will be levied
		} else {
			tax = (float) (income * 0.3) ; // 30% tax above 10L income
		}
		
		System.out.println("Tax on your income = " + tax);
		sc.close();
	}
}