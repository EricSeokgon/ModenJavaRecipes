package Chapter3;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_49
 * Date: 2017-10-27
 * Time: 오전 9:27
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_49 {
    public Integer delay(Integer n) {
        try {
            Thread.sleep((long) (Math.random() * 100));
        } catch (InterruptedException ignored) {

        }
        return n;
    }


    Optional<Integer> any = Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
            .unordered()
            .parallel()
            .map(this::delay)
            .findAny();

}
