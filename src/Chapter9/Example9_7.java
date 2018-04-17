package Chapter9;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

public class Example9_7 {
    public static void main(String[] args) {
        Instant before = Instant.now();
        int total = IntStream.of(3, 1, 4, 1, 5, 9)
                .parallel()
                .map(Example9_6::doubleIt)
                .sum();

        Instant after = Instant.now();
        Duration duration = Duration.between(before, after);
        System.out.println("Total of doubles = " + total);
        System.out.println("time = " + duration.toMillis() + " ms");

    }
}
