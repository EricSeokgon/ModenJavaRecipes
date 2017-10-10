package Chapter3;

import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_21
 * Date: 2017-10-11
 * Time: 오전 8:56
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_21 {
    public static void main(String[] args) {
        int sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
