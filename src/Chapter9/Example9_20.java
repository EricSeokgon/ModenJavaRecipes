package Chapter9;

import java.util.IdentityHashMap;
import java.util.concurrent.CompletableFuture;

public class Example9_20 {
    private IdentityHashMap<Integer, Product> cache;

    public CompletableFuture<Product> getProduct(int id) {
        try {
            Product product = getLocal(id);
            if (product != null) {
                return CompletableFuture.completedFuture(product);
            } else {
                CompletableFuture<Product> future = new CompletableFuture<>();
                Product p = getRemote(id);
                cache.put(id, p);
                future.complete(p);
                return future;
            }
        } catch (Exception e) {
            CompletableFuture<Product> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    private Product getRemote(int id) {
        return null;
    }

    private Product getLocal(int id) {
        return null;
    }
}
