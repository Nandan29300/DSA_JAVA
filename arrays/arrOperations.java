import java.util.Scanner;

public class arrOperations {

    public static void updateMarks(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] += 5;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Array creation definition
        int marks[] = new int[3];

        //Array input
        System.out.println("Enter marks of Physics: ");
        marks[0] = sc.nextInt();
        
        System.out.println("Enter marks of Chemistry: ");
        marks[1] = sc.nextInt();
        
        System.out.println("Enter marks of Maths: ");
        marks[2] = sc.nextInt();

        System.out.print("Entered marks: ");
        //Output from Array using loop
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        } 
        System.out.println(); //Next line

        //Updating array element
        updateMarks(marks);
        System.out.print("Updated marks with grace: ");

        //Output from Array using loop
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        } 
        System.out.println(); //Next line

        //Operations by retrieving array values
        int percent = (marks[0] + marks[1] + marks[2]) /3;
        System.out.println("Percentages: " + percent);

        //Array length
        System.out.println("Length of defined marks array= " + marks.length);

        sc.close();
    }
}