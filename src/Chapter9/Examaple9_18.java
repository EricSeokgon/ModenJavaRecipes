package Chapter9;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Examaple9_18 {
    public static void main(String[] args) {
        AbstractExecutorService service = null;
        Future future = service.submit(() -> {
            Thread.sleep(10);
            return "Hello, World!";
        });
        future.cancel(true);
        System.out.println("Even more processing...");
        getIfNotCancelled(future);
    }

    public static void getIfNotCancelled(Future<String> future) {
        try {
            if (!future.isCancelled()) {
                System.out.println(future.get());
            } else {
                System.out.println("Cancelled");
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
