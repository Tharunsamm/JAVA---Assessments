import java.util.*;
public class assessment1_q15{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any float/double value: ");
        double value = sc.nextDouble();
        System.out.println("Next value towards float/double value:" + Math.nextDown(value));
        System.out.println("Next value towards float/double value:" + Math.nextUp(value));
        sc.close();
    }
}