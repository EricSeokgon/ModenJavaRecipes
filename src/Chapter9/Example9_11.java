package Chapter9;

import java.util.stream.LongStream;

public class Example9_11 {
    private static final long N = 10;

    public long sequentialLongStreamSum() {
        return LongStream.rangeClosed(1, N)
                .sum();
    }

    public long parallelLongStreamSum() {
        return LongStream.rangeClosed(1, N)
                .parallel()
                .sum();
    }
}
