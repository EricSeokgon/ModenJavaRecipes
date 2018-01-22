package Chapter5;

import java.util.function.Function;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_26
 * Date: 2018-01-23
 * Time: 오전 8:36
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_26 {
    public static void main(String[] args) {
        Function<Integer, Integer> add2 = x -> x + 2;
        Function<Integer, String> plus2toString = add2.andThen(Object::toString);
        System.out.println(plus2toString.apply(1));
    }
}
