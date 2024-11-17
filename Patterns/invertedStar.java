import java.util.Scanner;

class invertedStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows to print inverted star pattern: ");
        int line= sc.nextInt(); 
        
        //Outer: Decides printing of row
        for(int i=1; i<=line; i++) {

            //Outer: cDecides printing of pattern contend
            for (int stars=0; stars<=(line - i); stars++) {
                System.out.print('*');
            }

            System.out.println();
        }
    
        sc.close();
    }
}