package Chapter9;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

public class Example9_14 {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(15);
        ForkJoinTask<Long> task = pool.submit(
                () -> LongStream.rangeClosed(1, 3_000_000)
                        .parallel()
                        .sum());
        try {
            Long total = task.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            pool.shutdown();
        }
        int poolSize = pool.getPoolSize();
        System.out.println("Pool size: " + poolSize);
    }
}
