import java.math.BigInteger;
import java.util.*;
public class assessment1_q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        BigInteger num = sc.nextBigInteger();
        byte num0 = num.byteValue();
        short num1 = num.shortValue();
        int num2 = num.intValue();
        long num3 = num.longValue();
        float num4 = num.floatValue();
        double num5 = num.doubleValue();
        System.out.println("Byte value: " + num0);
    System.out.println("Short value: " + num1);
    System.out.println("Int value: " + num2);
    System.out.println("Long value: " + num3);
    System.out.println("Float value: " + num4);
    System.out.println("Double value: " + num5);
        sc.close();
    }
}