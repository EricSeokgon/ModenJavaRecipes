package Chapter5;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_9
 * Date: 2018-01-04
 * Time: 오전 8:38
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_9 {
    private Map<Long, BigInteger> cache = new HashMap<>();
    public BigInteger fib(long i) {
        if (i == 0) return BigInteger.ZERO;
        if (i == 1) return BigInteger.ONE;
        return cache.computeIfAbsent(i, n -> fib(n - 2).add(fib(n - 1)));
    }
}
