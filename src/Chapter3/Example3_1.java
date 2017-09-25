package Chapter3;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_1
 * Date: 2017-09-25
 * Time: 오전 9:08
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_1 {
    @SafeVarargs
    public static <T> Stream<T> of(T... value) {
        return Arrays.stream(value);
    }
}
