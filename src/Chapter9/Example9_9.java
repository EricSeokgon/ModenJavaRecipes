package Chapter9;

public class Example9_9 {
    private static final long N = 10;

    public long iterativeSum() {
        long result = 0;
        for (long i = 1L; i <= N; i++) {
            result += i;
        }
        return result;
    }
}
