import java.util.Scanner;

public class assessment1_q13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt();

        // Read the divisor
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Calculate floor division
        int floorDivision = Math.floorDiv(dividend, divisor);

        // Calculate floor modulus
        int floorModulus = Math.floorMod(dividend, divisor);

        System.out.println("Floor Division = " + floorDivision);
        System.out.println("Floor Modulus = " + floorModulus);

        sc.close();
    }
}