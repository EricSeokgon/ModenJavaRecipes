package Chapter5;

import java.util.function.Function;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_40
 * Date: 2018-02-01
 * Time: 오전 8:38
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_40 {
    private static <T, R, E extends Exception>
    Function<T, R> wrapper(FunctionWithException<T, R, E> fe) {
        return arg -> {
            try {
                return fe.apply(arg);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
}
