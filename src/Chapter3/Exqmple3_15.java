package Chapter3;

import java.util.stream.IntStream;

/**
 * Project: ModenJavaRecipes
 * FileName: Exqmple3_15
 * Date: 2017-09-28
 * Time: 오전 8:56
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Exqmple3_15 {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 10)
                .reduce((x, y) -> x + y).orElse(0);
        System.out.println(sum);
    }
}
