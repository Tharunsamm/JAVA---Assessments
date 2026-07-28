import java.util.*;
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input 1st integer:");
    int num1 = sc.nextInt();
    System.out.println("Input 2nd integer:");
    int num2 = sc.nextInt();
    System.out.println("The sum is: " + (num1 + num2));
    System.out.println("The difference is: " + (num1 - num2));
    System.out.println("The product is: " + (num1 * num2));
    System.out.println("Average of two integers is:" + (num1 + num2) / 2);
    System.out.println( "Max Integer is:" + Math.max(num1, num2));
    System.out.println( "Min Integer is:" + Math.min(num1, num2));

}