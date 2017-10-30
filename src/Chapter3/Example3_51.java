package Chapter3;

import java.util.stream.IntStream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_51
 * Date: 2017-10-30
 * Time: 오전 9:19
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_51 {
    public boolean isPrime(int num) {
        int limit = (int) (Math.sqrt(num) + 1);
        return num == 2 || num > 1 && IntStream.range(2, limit)
                .noneMatch(divisor -> num % divisor == 0);
    }
}
