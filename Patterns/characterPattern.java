import java.util.Scanner;

class characterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows to print character pattern: ");
        int n= sc.nextInt();
        char ch = 'A';
        
        //Outer: Decides printing of row
        for(int i=1; i<=n; i++) {

            //Outer: cDecides printing of pattern contend
            for (int j=1; j<=i; j++) {
                System.out.print(ch);
                ch++; // For every character increment
            }
            System.out.println();
        }
    
        sc.close();
    }
}