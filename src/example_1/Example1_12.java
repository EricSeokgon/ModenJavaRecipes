package example_1;

import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example1_12
 * Date: 2017-09-18
 * Time: 오전 9:11
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example1_12 {
    public static void main(String[] args) {
        Stream.of("this", "is", "a", "stream", "of", "strings")
                .map(s -> s.length())
                .forEach(x -> System.out.println(x));
    }
}
