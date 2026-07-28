import java.util.Scanner;

public class assessment1_q7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input distance in meters:");
    double meters = sc.nextDouble();
    System.out.println("input hour:");

    int hours = sc.nextInt();
    System.out.println("input minutes:");

    int minutes = sc.nextInt();
    System.out.println("input Seconds:");

    double Seconds = sc.nextDouble();
    double Totaltime_Hrs = hours + minutes / 60.0 + Seconds / 3600.0;//60 seconds * 60 mintues which equals to 3600 seconds==1hour
    double kilometers = meters / 1000.0;//1000 meters euals to 1 kilometer
    double miles = kilometers * 0.621371;//1 kilometer = 0.621371 miles
    System.out.println("Your speed in meters/second is" + meters / (Totaltime_Hrs*3600));
    System.out.println("Your speed in km/h is" + (kilometers / Totaltime_Hrs));
    System.out.println("Your speed in mph is" + (miles / Totaltime_Hrs));

 }
}
