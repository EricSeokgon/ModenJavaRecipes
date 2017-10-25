package Chapter3;

import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_38
 * Date: 2017-10-25
 * Time: 오전 9:15
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_39 {
    public static void main(String[] args) {
        long count = Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
                .count();
        System.out.printf("There are %d elements in the stream%n", count);
    }

}
