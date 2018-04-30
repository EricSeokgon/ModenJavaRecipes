package Chapter9;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;

import static junit.framework.TestCase.assertTrue;

public class Example9_27 {
    private CompletableFuture<Integer> getIntegerCompletableFuture(String num) {
        return CompletableFuture.supplyAsync(() -> Integer.parseInt(num))
                .handle((val, exc) -> val != null ? val : 0);
    }

    @Test
    public void handleWithException() throws Exception {
        String num = "abc";
        CompletableFuture<Integer> value = getIntegerCompletableFuture(num);
        assertTrue(value.get() == 0);
    }

    @Test
    public void handleWithoutException() throws Exception {
        String num = "42";
        CompletableFuture<Integer> value = getIntegerCompletableFuture(num);
        assertTrue(value.get() == 42);
    }
}
