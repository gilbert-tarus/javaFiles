import java.time.Instant;
import java.util.Date;

public class mySecondApp {
    public static void main(String[] args) {
        int x = 1;
        String[] wordListOne = { "24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "frontend", "web-based",
                "pervasive", "smart", "sixsigma", "critical-path", "dynamic" };
        System.out.println("This is My Second App");
        while (x<=5) {
            
            System.out.println("This is Awesome "+x); 
            System.out.println((int) (Math.random() * wordListOne.length));
            x+=1;
            // System.out.println( Date.from(null));
        }
    }
}

