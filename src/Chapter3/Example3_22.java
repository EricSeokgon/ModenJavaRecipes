package Chapter3;

import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_22
 * Date: 2017-10-12
 * Time: 오전 9:04
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_22 {
    public static void main(String[] args) {
        Integer max = Stream.of(3, 1, 4, 1, 5, 9)
                .reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("The max value is " + max);
    }
}
