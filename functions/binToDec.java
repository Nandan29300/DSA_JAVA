import java.util.Scanner;

public class binToDec {

    public static int binToDecimal(int binN) {
        int power = 0;
        int decNum = 0;

        while ( binN > 0 ) {
            int lastDig = binN % 10;
            decNum = decNum + (lastDig * (int) Math.pow(2, power));

            power++;
            binN /= 10; // Reduce 1 digit after each iteration
        }

        return decNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a binary no: ");
        int binN = sc.nextInt();
        System.out.println("Decimal no for binary " + binN + " = " + binToDecimal(binN));
        sc.close();
    }
}
