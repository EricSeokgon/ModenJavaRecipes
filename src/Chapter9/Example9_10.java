package Chapter9;

import java.util.stream.Stream;

public class Example9_10 {
    private static final long N = 10;

    public long sequentialStreamSum() {
        return Stream.iterate(1L, i -> i + 1)
                .limit(N)
                .reduce(0L, Long::sum);
    }

    public long parallelStreamSum() {
        return Stream.iterate(1L, i -> i + 1)
                .limit(N)
                .parallel()
                .reduce(0L, Long::sum);
    }
}
