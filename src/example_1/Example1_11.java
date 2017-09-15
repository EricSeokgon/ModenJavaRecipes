package example_1;

import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example1_11
 * Date: 2017-09-15
 * Time: 오전 9:47
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example1_11 {
    public static void main(String[] args) {
        Stream.of("this", "is", "a", "stream", "of", "strings")
                .map(String::length)
                .forEach(System.out::println);
    }
}
