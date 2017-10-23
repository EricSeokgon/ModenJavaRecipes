package Chapter3;

import java.util.stream.IntStream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_34
 * Date: 2017-10-23
 * Time: 오전 9:01
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_34 {
    public int sumDoubleDivisibleBy3(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .peek(n -> System.out.printf("original: %d%n", n))
                .map(n -> n * 2)
                .peek(n -> System.out.printf("doubled: %d%n", n))
                .filter(n -> n % 3 == 0)
                .peek(n -> System.out.printf("filtered: %d%n", n))
                .sum();
    }
}
