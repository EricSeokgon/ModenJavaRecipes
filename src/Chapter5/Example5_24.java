package Chapter5;

import java.util.function.Function;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_24
 * Date: 2018-01-18
 * Time: 오전 8:31
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_24 {
    public static void main(String[] args) {
        Function<Integer, Integer> add2 = x -> x + 2;
        Function<Integer, Integer> mult3 = x -> x * 3;
        Function<Integer, Integer> mult3add2 = add2.compose(mult3);
        Function<Integer, Integer> add2mult3 = add2.andThen(mult3);
        System.out.println("mult3add2(1): " + mult3add2.apply(1));
        System.out.println("add2mult3(1): " + add2mult3.apply(1));
    }
}
