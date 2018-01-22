package Chapter5;

import java.util.function.Function;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_25
 * Date: 2018-01-22
 * Time: 오전 9:08
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_25 {
    public static void main(String[] args) {
        Function<Integer, Integer> add2 = x -> x + 2;
        Function<String, Integer> parseThenAdd2 = add2.compose(Integer::parseInt);
        System.out.println(parseThenAdd2.apply("1"));
    }
}
