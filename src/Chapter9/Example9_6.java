package Chapter9;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

public class Example9_6 {
    private static int total;

    public static final int doubleIt(int n) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignore) {
        }
        return n * 2;
    }

    public static void main(String[] args) {
        Instant before = Instant.now();
        total = IntStream.of(3, 1, 4, 1, 5, 9)
                .map(Example9_6::doubleIt)
                .sum();
        Instant after = Instant.now();
        Duration duration = Duration.between(before, after);
        System.out.println("Total of doubles = " + total);
        System.out.println("time = " + duration.toMillis() + " ms");
    }
}
