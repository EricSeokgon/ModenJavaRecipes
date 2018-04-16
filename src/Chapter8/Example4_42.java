package Chapter8;

import java.time.Duration;
import java.time.Instant;

public class Example4_42 {
    public static double getTiming(Instant start, Instant end) {
        return Duration.between(start, end).toMillis() / 1000.0;
    }

    public static void main(String[] args) {
        Instant start = Instant.now();
        // ... call method to be timed ...
        Instant end = Instant.now();
        System.out.println(getTiming(start, end) + " seconds");
    }
}
