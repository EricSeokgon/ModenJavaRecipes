package Chapter9;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Example9_17 {
    public void main(String[] args) {
        AbstractExecutorService service = null;
        Future<String> future = service.submit(() -> {
            Thread.sleep(10);
            return "Hello, World!";
        });
        System.out.println("More processing...");
        while (!future.isDone()) {
            System.out.println("Waiting...");
        }
        getIfNotCancelled(future);
    }

    public void getIfNotCancelled(Future<String> future) {
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
