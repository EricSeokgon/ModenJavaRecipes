package Chapter3;

import java.util.stream.IntStream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_32
 * Date: 2017-10-19
 * Time: 오전 9:31
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_32 {
    public int sumDoubleDivisibleBy3(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .map(n -> n * 2)
                .filter(n -> n % 3 == 0)
                .sum();
    }

}
