import java.util.*;
public class assessment1_q8 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input a number:");
    double num = sc.nextDouble();
    System.out.printf("Square: %.2f%n", num * num);//square of a number
    System.out.printf("Cube: %.2f%n", num * num * num);//cube of a number
    System.out.printf("Fourth power: %.2f%n", Math.pow(num, 4));//fourth power
    
}
}