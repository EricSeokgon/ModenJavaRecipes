package Chapter3;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_47
 * Date: 2017-10-26
 * Time: 오전 10:14
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_47 {
    public static void main(String[] args) {
        Optional<Integer> firstEvenGT10 = Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
                .filter(n -> n > 10)
                .filter(n -> n % 2 == 0)
                .findFirst();
        System.out.println(firstEvenGT10);
    }
}
