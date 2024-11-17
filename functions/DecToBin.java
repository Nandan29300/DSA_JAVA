import java.util.Scanner;

public class DecToBin {

    public static int decimalToBinary(int decimal) {
        int power = 0;
        int binNo = 0;
        int lastDig = 0;

        while ( decimal > 0 ) {
            lastDig = decimal % 2;
            binNo = binNo + (lastDig * (int) Math.pow(10, power));

            power++;
            decimal /= 2; // Reduce 1 digit after each iteration
        }

        return binNo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Decimal no: ");
        int decimal = sc.nextInt();
        System.out.println("Binary no for Decimal " + decimal + " = " + decimalToBinary(decimal));
        sc.close();
    }
}
