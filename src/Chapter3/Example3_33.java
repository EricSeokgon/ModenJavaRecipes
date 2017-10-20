package Chapter3;

import java.util.stream.IntStream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_33
 * Date: 2017-10-20
 * Time: 오전 9:02
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_33 {
    public int sumDoubleDivisibleBy3(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .map(n -> {
                    System.out.println(n);
                    return n;
                })
                .map(n -> n * 2)
                .filter(n -> n % 3 == 0)
                .sum();
    }
}
