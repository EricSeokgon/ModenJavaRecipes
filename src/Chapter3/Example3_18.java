package Chapter3;

import java.util.stream.IntStream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_18
 * Date: 2017-09-29
 * Time: 오전 10:52
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_18 {
    public static void main(String[] args) {
        int doubleSum = IntStream.rangeClosed(1, 10)
                .reduce((x, y) -> x + 2 * y).orElse(0);
    }
}
