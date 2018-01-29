package Chapter5;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_39
 * Date: 2018-01-30
 * Time: 오전 8:47
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@FunctionalInterface
public interface FunctionWithException<T, R, E extends Exception> {
    R apply(T t) throws E;
}
