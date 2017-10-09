package Chapter3;

import java.util.stream.IntStream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example_19
 * Date: 2017-10-10
 * Time: 오전 8:55
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example_19 {
    public static void main(String[] args) {
        int doubleSum = IntStream.rangeClosed(1, 10)
                .reduce(0, (x, y) -> x + 2 * y);
        System.out.println(doubleSum);
    }
}
