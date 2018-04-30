package Chapter9;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;

import static junit.framework.TestCase.assertTrue;

public class Example9_25 {

    @Test
    public void compose() throws Exception {
        int x = 2;
        int y = 3;
        CompletableFuture<Integer> completableFuture =
                CompletableFuture.supplyAsync(() -> x)
                        .thenCompose(n -> CompletableFuture.supplyAsync(() -> n + y));
        assertTrue(5 == completableFuture.get());
    }

}
