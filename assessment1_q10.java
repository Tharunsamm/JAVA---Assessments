import java.util.*;

public class assessment1_q10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input six non-negative digits: ");
        int number = sc.nextInt();

        // Divide by 100000 to get the first digit.
        System.out.print(number / 100000 + " ");

        // Remove the first digit using the remainder.
        number %= 100000;

        // Divide by 10000 to get the second digit.
        System.out.print(number / 10000 + " ");

        // Remove the second digit.
        number %= 10000;

        // Divide by 1000 to get the third digit.
        System.out.print(number / 1000 + " ");

        // Remove the third digit.
        number %= 1000;

        // Divide by 100 to get the fourth digit.
        System.out.print(number / 100 + " ");

        // Remove the fourth digit.
        number %= 100;

        // Divide by 10 to get the fifth digit.
        System.out.print(number / 10 + " ");

        // Remove the fifth digit.
        number %= 10;

        // Print the last remaining digit.
        System.out.print(number);

        sc.close();
    }
}
   

