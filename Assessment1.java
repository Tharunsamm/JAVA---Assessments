import java.util.Scanner;

public class Assessment1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        problem1();
        problem2();
        problem3();
        problem4();
        problem6();

        sc.close();
    }
    //Problem 1
    public static void problem1() {

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;//Formula °F = (°C × 9/5) + 32
        System.out.println(fahrenheit + " degree Fahrenheit is equal to "+ celsius + " in Celsius");
    }
    //Problem 2
    public static void problem2() {

        System.out.print("Enter inches: ");
        double inch = sc.nextDouble();
        double meter = inch * 0.0254;//Formula 1 inch = 0.0254 meters
        System.out.println(inch + " inches is " + meter + " meters");
    }

    //Problem 3
    public static void problem3() {
        System.out.println("Enter any integer between 0 to 1000: ");
        int num = sc.nextInt();
        int num1 = num/100;// Get the first digit
        int num2 = num%100;// Get the remaining two digits
        int num3 = num2/10;// Get the second digit
        int num4 = num2%10;// Get the third digit

        System.out.println("The sum of the digits in " + num + " is " + (num1 + num3 + num4));
    }
    //Problem 4
    public static void problem4(){
        System.out.println("Input the number of minutes:");
        long mins = sc.nextLong();
        long years = mins / (365 * 24 * 60);//multiply 365days*24hrs*60mins and divided by minutes then we get the estimated years, we get the value in decimal but since we are using long data type it only gives the whole number
        long days = (mins % (365 * 24 * 60)) / (24 * 60);//the remaining minutes after calculating years, then divided by minutes in a day to get the number of days
        System.out.println(mins + " minutes is " + years + " years and " + days + " days");
    }
    //problem5
    public static void problem6(){
        System.out.println("Enter the weight in Pounds:");
        double weight= sc.nextDouble();
        System.out.println("Enter the height in Inches:");
        double height= sc.nextDouble();
        
        double weightInKg = weight * 0.45359237;// converting pounds to kilograms
        double heightInMeters = height * 0.0254;// converting inches to meters
        double bmi = weightInKg / Math.pow(heightInMeters,2);//BMI formula
        System.out.println("Body Mass Index is: " + bmi);
    }

}
