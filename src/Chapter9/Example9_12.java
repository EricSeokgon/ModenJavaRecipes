package Chapter9;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.LongStream;

public class Example9_12 {
    public static void main(String[] args) {
        System.setProperty(
                "java.util.concurrent.ForkJoinPool.common.parallelism", "20");
        long total = LongStream.rangeClosed(1, 3_000_000)
                .parallel().sum();

        int poolSize = ForkJoinPool.commonPool().getPoolSize();
        System.out.println("Pool size:" + poolSize);
    }
}
