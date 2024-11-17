import java.util.Scanner;
class maxOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();
        System.out.println("Enter C: ");
        int c = sc.nextInt();
		
		if(a>b && a>c)
			System.out.println("Maximum No:"+ a);
		else if (b>a && b>c)
			System.out.println("Maximum No:"+ b);
		
		else System.out.println("Maximum No:"+ c);
        sc.close();
    }
}