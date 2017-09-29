package Chapter3;

import java.util.stream.IntStream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_16
 * Date: 2017-09-29
 * Time: 오전 10:07
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_16 {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 10)
                .reduce((x, y) -> {
                    System.out.printf("x=%d, y=%d%n", x, y);
                    return x + y;
                }).orElse(0);
    }
}
