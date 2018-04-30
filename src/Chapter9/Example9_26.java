package Chapter9;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;

import static junit.framework.TestCase.assertTrue;

public class Example9_26 {
    @Test
    public void combine() throws Exception {
        int x = 2;
        int y = 3;
        CompletableFuture<Integer> completableFuture =
                CompletableFuture.supplyAsync(() -> x)
                        .thenCombine(CompletableFuture.supplyAsync(() -> y),
                                (n1, n2) -> n1 + n2);
        assertTrue(5 == completableFuture.get());
    }
}
