import java.time.LocalTime;
import java.time.ZoneId;

public class assessment1_q5 {

    public static void main(String[] args) {

        // Converting current time in GMT
        LocalTime gmtTime = LocalTime.now(ZoneId.of("GMT"));

        System.out.println("Current GMT Time: " + gmtTime);
    }
}