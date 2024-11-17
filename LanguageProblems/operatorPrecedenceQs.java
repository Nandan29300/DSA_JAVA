class operatorPrecedenceQs {
	public static void main(String args[]) {
		
		//Question 1
		int x = 2, y = 5;
		int exp1 = (x * y / x); // ans= 5
		int exp2 = (x * (y / x)); // ans= 4
		System.out.println(exp1 +", " + exp2);

		//Question 2
		x = 200; y = 50; int z = 100;
		if (x > y && y > z)
			System.out.println("Hello");

		if(z > y && z < x)
			System.out.println("Java"); //This will be printed.

		if((y+200) < x && (y+150) < z)
			System.out.println("Hello Java");	

		//Question 3
		x = y = z = 2;
		x += y;
		y -= z;
		z /= (x + y);
		System.out.println(x + " " + y + " " + z);	// 4 0 0
		
		//Question 4
		
		x = 9; y = 12;
		int a = 2, b = 4, c = 6;
		
		// Ans 278 solved by applying BODMAS and Left to Right associativity
		int exp= 4/3 * (x + 34) + 9* (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
		System.out.println(exp); 
		
		//Question 5
		
		x = 10; y = 5;
		exp1 = (y * (x / y + x / y));
		exp2 = (y * x / y + y * x / y) ;
		
		//Both gives 20
		System.out.println(exp1);
		System.out.println(exp2);
	}
}