import java.util.*;
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input a number:");
    double num = sc.nextDouble()/0.0;

    System.out.println(Double.isFinite(num)?"Finite":"Not Finite");
   
}
